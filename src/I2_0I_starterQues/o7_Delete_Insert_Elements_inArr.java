package I2_0I_starterQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class o7_Delete_Insert_Elements_inArr {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50, 60, 70};
        int delete = 60;

        optimisedRemoval(arr, delete);
//        insertElement(arr, 3,3434);
    }
    static void insertElement(int []arr, int index, int element){
        List<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < index-1; i++) {
            newArr.add(arr[i]);
        }

        newArr.add(element);

        for (int i = index; i < arr.length ; i++) {
            newArr.add(arr[i]);
        }
        System.out.println(newArr);
    }

    static void optimisedRemoval(int []arr, int delete){

        int count = 0;
        int ans[] = new int[arr.length-1];
        int k = 0;
        for(int i=0; i<= ans.length; i++){

            if(arr[i] == delete) {
                count++; continue;
            }
            ans[k++] = arr[i];
        }

        if(count != 0) {
            System.out.println(Arrays.toString(ans));
        }
         else System.out.println("Element Not present in arr");

    }

    static void inplaceRemoval(int []arr, int delete) {
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == delete) {
                for (int j = i; j < arr.length-1; j++){
                    arr[j] = arr[j+1]; // here we're just setting the further elements
                }
                flag++; break;
            }
        }

        if(flag == 0)
            System.out.println("Element not found");

        else {
            for (int i = 0; i < arr.length - 1; i++)
                System.out.print(arr[i] + " ");
        }
    }
}
