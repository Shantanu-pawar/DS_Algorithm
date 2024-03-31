package Questions_nd_CONCEPTS.I2I_starterQues;
import java.util.Arrays;

public class o7_Delete_Insert_Elements_inArr {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70};
        int delete = 60;

        // TC : O(N) | SC : O(1)
        inplaceOptimised(arr, delete);
    }

    static void inplaceOptimised(int []arr, int target){
        int index = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] != target){
                arr[index] = arr[i];
                index++;
            }
            else if(arr[i] == target){
                arr[index] = arr[i+1];
                index++;
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n \n // print using stream APIs");
        Arrays.stream(arr)
                .forEach(a -> System.out.print(a + " "));
    }
}