package I9I_Recursion;

public class o8_check_arr_is_Sorted {
    public static void main(String[] args) {
        int []arr = {2, 3, 4, 65, 7, 8};

        boolean check = sorted(arr, arr.length-1);

        if(check) System.out.println("Arr is sorted");
        else System.out.println("Not a sorted arr");
    }

    static boolean sorted(int []arr, int n) {

        if(n == 0) return true;

    // case :here we're just checking last two numbers in descending manner
        if(arr[n] > arr[n-1])
            return sorted(arr, n-1);

        else return false;
    }
}
