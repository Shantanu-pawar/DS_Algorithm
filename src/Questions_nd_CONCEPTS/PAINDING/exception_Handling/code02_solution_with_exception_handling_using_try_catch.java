package Questions_nd_CONCEPTS.PAINDING.exception_Handling;

public class code02_solution_with_exception_handling_using_try_catch{
  public static void main(String args[]){
   try{
      int data=50/0;
  
   }catch(ArithmeticException e){System.out.println(e);}
   
   System.out.println("rest of the code...");  //THIS WILL RUN
}
}