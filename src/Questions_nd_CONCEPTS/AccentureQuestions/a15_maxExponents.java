package Questions_nd_CONCEPTS.AccentureQuestions;

//Question : 13 : interesting problem statement

public class a15_maxExponents {

    public static void main (String[]args) {
        System.out.println (maxExponents(7,15));
    }

    static int freqCount(int i){
        int count = 0;
        while(i % 2 == 0 && i != 0) {
            i /= 2;
            count += 1;
        }
        return count;
    }

    static int maxExponents(int a, int b){
        int maxNo = 0; int maxFreq = 0;
        for (int i = a; i < b; i++) {

              int count = freqCount(i);
              if(count > maxFreq){
                  maxFreq = count;
                  maxNo = i;
              }
        }
        return maxNo;
    }
}

//    public static int count (int i) {
//        int count = 0;
//        while (i % 2 == 0 && i != 0){
//            count += 1;
//            i = i / 2;
//        }
//        return count;
//    }
//
//    public static int maxExponents (int a, int b) {
//        int max = 0, num = 0;
//
//        for (int i = 12; i < 17; i++) {
//            int temp = count (i);
//
//            if (temp > max) {
//                max = temp;
//                num = i;
//            }
//        }
//        return num;
//    }
//}