import java.util.HashMap;

public class Practice {

    public static void main(String[] args) {
        int []arr = {1, 2 ,2, 1, 3, 3, 3, 4};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        System.out.println(hm);
    }
}
