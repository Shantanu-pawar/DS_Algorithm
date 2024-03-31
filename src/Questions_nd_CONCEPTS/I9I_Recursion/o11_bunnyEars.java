package Questions_nd_CONCEPTS.I9I_Recursion;

public class o11_bunnyEars {
    public static void main(String[] args) {

    }

    //https://codingbat.com/prob/p183649
    public int bunnyEars(int bunnies) {

        if(bunnies == 0) return 0;
        if(bunnies == 1) return 2;
        if(bunnies == 2) return 4;

        return bunnyEars(bunnies-1) + 2;
    }

    //https://codingbat.com/prob/p107330
    public int bunnyEars2(int bunnies) {

        if(bunnies == 0) return 0;
        if(bunnies == 1) return 2;
        if(bunnies == 2) return 5;

        if(bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);

        else return 2 + bunnyEars2(bunnies-1);
    }
}




