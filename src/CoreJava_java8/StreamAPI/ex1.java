package CoreJava_java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Question: write a program to return all the duplicate values by using stream API
*/

public class ex1{
    public static void main(String[] args) {

        List<Data> dataList = Arrays.asList(
                new Data(1, "ganesh", "dhule"),
                new Data(2, "mangesh", "surat"),
                new Data(3, "shashwat", "lombok"),
                new Data(4, "ganesh", "pune-mumbai")
        );

        Map<String, Long> nameCountMap = dataList.stream()
                .collect(Collectors.groupingBy(Data::getName,
                        Collectors.counting()));

        System.out.println("Duplicate names:");

        nameCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}


class Data {
    int number;
    String name;
    String location;

    public Data(int number, String name, String location) {
        this.number = number;
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }
}