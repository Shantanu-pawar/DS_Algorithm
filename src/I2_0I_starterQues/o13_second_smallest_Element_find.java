package I2_0I_starterQues;

public class o13_second_smallest_Element_find {
    public static void main(String[] args) {

//        Ques : find 2nd smallest element from an arr
        int [] arr = {5,3,2,1,39,44,-23,-23};

        /*first  approach : sort the arr, and return the 2nd large element from it.
        * second approach : efficient if else statements in looping */
        optimalSolution(arr);
    }
    static void optimalSolution(int []arr){ // O(N) :: Time Complexity
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        if(arr.length == 0) throw new  NullPointerException();

        if(arr.length < 2) {
            System.out.println("Invalid input"); return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            // handling duplicate element's here
            if(arr[i] < secondMin && arr[i] != min) secondMin = arr[i];
        }

        if (secondMin == Integer.MAX_VALUE)
            System.out.println("There is no second smallest element");

        System.out.println(min +" : is the min element");
        System.out.println(secondMin + " : is the 2nd smallest");
    }

    static void secondLastElement(int []arr){
        int min = arr[0];

        if(arr.length == 0 || arr.length == 1){
            System.out.println("There is no 2nd element exists");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }

        int secondLast = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(secondLast > arr[i] && arr[i] > min)
                secondLast = arr[i];
        }

        System.out.println(min +" : is the min elemnt");
        System.out.println(secondLast + " : is the 2nd smallest");
    }
}
