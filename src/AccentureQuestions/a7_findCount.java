package AccentureQuestions;
// https://prepinsta.com/accenture/coding/ - main website
// https://prepinsta.com/accenture/coding/#:~:text=len)%3B%0A%7D-,Question%204%3A,-(Asked%20in%20Accenture
//ques : 4

public class a7_findCount {

    /*absolute concept : it return's the magnitude of number without returning the -ve sign

    problem statement : find the number of elements of ‘arr’ having an absolute
    difference of less than or equal to ‘diff’ with ‘num’.

    in this question we've to find the total elements who is lying under this condition and print those elements.
    condition : {Math.abs(num - arr[i]) <= diff} then will print it.
    * */
    public static void main(String[] args) {
        int []arr = {13, 3, 14, 56, 77, 12, 11};
        int diff = 2;
        int num = 13;

        int c = count(arr, diff, num);
        System.out.println("\n and the total number count is: " + c);
    }
    static int count(int []arr, int diff, int num){
        int c = -1;

        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(num - arr[i]) <= diff) {
                System.out.print(arr[i] + " "); c++;
            }
        }


        return c;
    }
}
