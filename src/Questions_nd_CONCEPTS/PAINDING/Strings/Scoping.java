

/*
Scooping :
it means anything that is outside the block can use in inside as well
anything which is inside the block can't be use outside
 */

public class scope {
    public static void main(String[] args) {
        int a = 10 ;
         int b = 20;

//         lets try this concept to strings
        String name = "shantanu";


        {
            a = 45;
//            note: this value is just a initialised value over the previous Original value of integer A
            System.out.println(a);
//            the values which are initialised in this block which remains in this perticular block

            name = "dada";
            System.out.println(name);

        }
        System.out.println(a);
        System.out.println(name);


//        scoping in for loops
        for (int i = 0; i <4 ; i++){
            System.out.println(i);
            int num = 39;


        }

    }

    static void random (int marks ){
        int num = 56;
        System.out.println(num );
        System.out.println(marks );

//        in simple language scoping means you can access only this veriables in specific functions
    }
}
