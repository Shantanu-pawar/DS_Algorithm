package I0I_Concepts_Arr_Strings.Exception_Handling;

public class runtimeException {
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        try{
            int c = a/b;
            System.out.println(c);

        }catch (Exception e){
            System.out.println(e);
        }


        for (int i = 0; i < 10; i++)
            System.out.print(i + " ");

    }
}