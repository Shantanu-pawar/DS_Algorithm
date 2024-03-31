package Questions_nd_CONCEPTS.AccentureQuestions;

//https://prepinsta.com/accenture/coding/#:~:text=0%3B%0A%7D-,Question%3A6,-(Asked%20in%20Accenture
//ques : 6


public class a9_find_secondMax_secondMin {
    public static void main(String[] args) {
        // 2 min already coding

        //problem statement : return the sum of second largest element from the even positions and
        // second smallest from the odd position of given ‘arr’

//        int []arr = {3,2,1,7,5,4}; // OP = 7
        int []arr = {1,8,0,2,3,5,6}; // output : 8
        solve(arr);
    }
    static void solve(int []arr){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

//        second largest for even
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0) {
                if(max < arr[i]) {
                    secondMax = max;
                    max = arr[i];
                }
                if(secondMax < arr[i] && arr[i] < max) secondMax = arr[i];
            }

            else {
                if(min > arr[i]) {
                    secondMin = min;
                    min = arr[i];
                }
                if(secondMin > arr[i] && arr[i] > min) secondMin = arr[i];
            }
        }

        System.out.println(secondMax + secondMin);
        System.out.println(secondMax + " " + secondMin);
    }
}
