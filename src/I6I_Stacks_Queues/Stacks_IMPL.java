package I6I_Stacks_Queues;

public class Stacks_IMPL {
    public static class Stack {

        int st []= new int[10];
        int ind=0;

        void push (int n){
            if (ind == 10){
                System.out.println ("overflow");
            }
            else {
                st[ind]=n;
                ind++;
            }
        }
        void pop (){
            if (ind == 0)
                System.out.println ("underflow");

            else {
                ind--;
                System.out.println("popped : " + st[ind]);
            }
        }
        boolean isEmpty (){
            if (ind == 0){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack ();
        st.pop();

        for (int i =0;i< 10 ;i++) st.push(i);

        st.push(0);
        for (int i =0;i< 10 ;i++) st.pop();

        System.out.println(st.isEmpty());
    }
}

