package Questions_nd_CONCEPTS.PAINDING;

import java.util.ArrayList;

//      print the same elements in all three arrays

public class Q26_ThreeArray_commonElementFind {
    public static void main(String[] args) {
        int [] arr1 = {2, 4, 8, 10};
        int [] arr2 = {2, 3, 4, 8, 10, 16};
        int [] arr3 = {2, 8, 10, 40};

        // this code find out any arrays and identify common elements

        int x = 0;
        int y = 0;
        int z = 0;

        ArrayList<Integer> al = new ArrayList<>();


        while   (x < arr1.length && y <arr2.length && z < arr3.length){

            if ( arr1[x] == arr2[y]  && arr2[y] == arr3[z]){

                al.add(arr1[x]); // this is for storing the arrays
                x++;
                y++;
                z++;
            }
            else if( arr1[x] < arr2[y]) {
                x++;
            }
            else if(arr2[y] < arr3[z]) {
                y++;
            }
            else{
                z++;
            }
        }

            for (int no: al){
                System.out.print(no + " ");
            }


    }
}
