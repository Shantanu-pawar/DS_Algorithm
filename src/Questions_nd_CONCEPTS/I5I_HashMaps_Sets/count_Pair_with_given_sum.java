package Questions_nd_CONCEPTS.I5I_HashMaps_Sets;

/*
there are two approaches
1. O(N²) - two for loops and check it iteratively set first loop to 0 to [n-1] and 2nd [i+1 to n]

2. using hashset store the number's and check the counter each time and if it is present
in set or not O(N) time and space both

as we know a + b = sum || sum - a = b
[so in map we're storing b and check each time of map contains it ?] */


//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
//    done!!


import java.util.HashMap;

public class count_Pair_with_given_sum {
    public static void main(String[] args) {
        int []arr = {1, 5, 7, -1};
        int n = arr.length;
        int k = 6;

        int ans = getList(arr,n , k);
        System.out.println(ans);
    }
    static int getList(int []arr, int n, int k){
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i = 0; i < n; i++) {
            int temp = k - arr[i];
            if(map.containsKey(temp)) {

                count += map.get(temp);
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

           else map.put(arr[i], 1);
        }

        return count;
    }
}

