package I2I_starterQues;

import java.util.Arrays;

public class o7_Delete_Elements_FromArr {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50, 60, 70};
        int delete = 10;
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == delete) {

                for (int j = i; j < arr.length - 1 ; j++) {
                    arr[j] = arr[j+1]; // here we're just setting the further elements
                }
                flag++;
                break;
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
