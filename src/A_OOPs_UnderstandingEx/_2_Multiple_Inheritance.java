package A_OOPs_UnderstandingEx;

/*
this is about how to manage multiple inheritance case :
if i've two interfaces which i'm implementing in main class then is there any error occured?

so in this multiple inheritance case since both methods are same hi() in interfaces
so we've to over-riding the method
*/

public class _2_Multiple_Inheritance {} // this is just for naming purpose

class Main implements parent, child{
    public static void main(String[] args) {
        Main obj = new Main();
        obj.hi();

        // now the question is how do we short this error out ?
        // ans : by overriding those methods that we wanted to call. like i've overridden below.
    }
    @Override
    public void hi() {
        child.super.hi();
    }
}

interface parent{
    default void hi(){
        System.out.println("this is parent");
    }
}
interface child{
    default void hi(){
        System.out.println("this is child");
    }
}