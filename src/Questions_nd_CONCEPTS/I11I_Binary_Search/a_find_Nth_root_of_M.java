package Questions_nd_CONCEPTS.I11I_Binary_Search;

public class a_find_Nth_root_of_M {
    /*
    find nth root of any number if not found then just return -1
	   ex : 2 9
	   output : 3

	   ex : 3 9
	   output : -1

	   ex : 3 1000
	   output : 10 */

    public static void main(String[] args) {

        int n = 3;
        int target = 100;
        int start = 0;
        int end = target;

        System.out.println(BS(start, end, n, target));
    }

    static int BS(int start, int end, int n, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int store = multiply(mid, n);

            if (store == target) return mid;
            if (store > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    static int multiply(int mid, int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = mid * ans;
        }
        return ans;
    }
}

