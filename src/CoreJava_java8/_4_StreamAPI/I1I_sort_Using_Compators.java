package CoreJava_java8._4_StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class I1I_sort_Using_Compators {
    public static void main(String[] args) {

        //statement : print duplicate student objects using stream API
        List<School> list = new ArrayList<>();
        list.add(new School(1200, "jai hind"));
        list.add(new School(230, "ssvps"));
        list.add(new School(10, "jai hind"));
        list.add(new School(1020, "kamlabai"));
        list.add(new School(200, "new city"));


/* now sort according to name || Comparator.comparing(Student::getName)
creates a comparator that compares students based on their names. */

        // usingComparator
        sortAccordingToSchoolName(list);
        sortAccordingToFees(list);
    }

        private static void sortAccordingToFees(List<School> list) {
        // now i'm sorting student obj based on their ranking
        List<School> sortedBasedOnRank = list.stream()
                .sorted(Comparator.comparing(School::getFees))
                .collect(Collectors.toList());

        System.out.println(sortedBasedOnRank);
    }

    private static void sortAccordingToSchoolName(List<School> list) {

        // here i've sorted student object based on their names
        List<School> schoolNames = list.stream()
                .sorted(Comparator.comparing(School::getName))
                .collect(Collectors.toList());

        System.out.println(schoolNames);

    }
}

class School{
    int fees;
    String name;

    public School(int fees, String name) {
        this.fees = fees;
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "School{" +
                "fees=" + fees +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}