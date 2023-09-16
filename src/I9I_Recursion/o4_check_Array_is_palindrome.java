package I9I_Recursion;

public class o4_check_Array_is_palindrome {
    public static void main(String[] args) {
        int []arr = {1, 22, 2, 22, 1};
        int start = 0;
        int last = arr.length-1;
        boolean check = checkArr(arr, start, last);

        if(check)
            System.out.println("yes it's your Arr is palindrome");
        else System.out.println("Nooooooooo! arr is Not a palindrome arr!!");
    }

    static boolean checkArr(int []arr, int i, int j){
        if(i >= j) return true;

        if(arr[i] == arr[j])
        return checkArr(arr, i+1, j-1);

        else return false;
    }
}
