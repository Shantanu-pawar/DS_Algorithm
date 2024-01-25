package I2I_starterQues;

public class o13_second_smallest_Element_find {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int[] arr = {5, 8, 34, 54, 43};

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            }
            // handle the cornerCase =
            if (arr[i] < max && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);
    }
}
