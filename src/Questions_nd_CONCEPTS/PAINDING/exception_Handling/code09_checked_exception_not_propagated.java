package Questions_nd_CONCEPTS.PAINDING.exception_Handling;// By default, Checked Exceptions are not forwarded in calling chain (propagated).

import java.io.IOException;

class code09_checked_exception_not_propagated{}

class TestExceptionPropagation2{
  void m() throws IOException {
    throw new java.io.IOException("device error");//checked exception  
  }  
  void n() throws IOException {
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}  