package Questions_nd_CONCEPTS.PAINDING.exception_Handling;// By default Unchecked Exceptions are forwarded in calling chain (propagated).

class code08_propagation_of_unchecked_exception{
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }

  public static void main(String args[]){
      code08_propagation_of_unchecked_exception obj = new code08_propagation_of_unchecked_exception();
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  