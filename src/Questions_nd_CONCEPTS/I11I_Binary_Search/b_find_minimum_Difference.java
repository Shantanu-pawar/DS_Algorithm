package Questions_nd_CONCEPTS.I11I_Binary_Search;

public class b_find_minimum_Difference {
    public static void main(String[] args) {

        int [] arr = {1, 2, 5, 10, 11};
        int target = 12;
        // in short we just have to find floor and ceil of target and return the difference :!

        int floor = floor(arr, target);
        int ceil = ceil (arr, target);

        System.out.println("floor element : " + ""  +floor );
        System.out.println("ceil element : " + " "+ceil);

        if(floor == -1 && ceil != -1) System.out.println(ceil);
        else if (floor != -1 && ceil == -1) System.out.println(floor);

        else {

            if ((floor-target) > (ceil-target)) System.out.println(floor);

            else System.out.println(ceil);
        }

    }

    static int floor (int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end) {
            int mid = start  +  ( end-start)/2;

            if(target == arr[mid]) return arr[mid];

            if(arr[mid] < target) {
                ans = arr[mid];
                start = mid+1;
            }
            else end = mid-1;
        }

        return ans;
    }


    static int ceil (int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans =-1;

        while(start <= end) {
            int mid = start  +  ( end-start)/2;

            if(target == arr[mid]) return arr[mid];

            if(arr[mid] > target) {
                ans = arr[mid];
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
}
