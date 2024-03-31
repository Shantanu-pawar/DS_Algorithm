package Questions_nd_CONCEPTS.AccentureQuestions;

//ques : 7
public class a10_Product_smallestPair {
    public static void main(String[] args) {

//        int []arr = {5,2,4,3,9,7,1}; // ans : 2
        int []arr = {9,8,3,-7,3,9}; // ans : -21
        int sum = 9;
        System.out.println(solve(arr, sum));
    }

/*
    find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k]
    are the least two elements of array (arr[j] + arr[k] <= sum)
    return those two elements product           */


    static int solve(int []arr, int sum){
        int n = arr.length;
        if(n < 2) return -1;

        int ans = 0;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                secondMin =  min;
                min = arr[i];
            }
            if(arr[i] > min && secondMin > arr[i]) secondMin = arr[i];
        }

        if(( secondMin + min) <= sum)
            return ans = secondMin * min;

        return ans;
    }
}
