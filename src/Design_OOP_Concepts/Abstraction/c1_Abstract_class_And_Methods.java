package Design_OOP_Concepts.Abstraction;

abstract class Bank{
    public abstract void bankInterestRate();
}

class SBI extends Bank{
    @Override
    public void bankInterestRate() {
        System.out.println("SBI has 5.6% interest rate");;
    }
}

class PunjabNational extends Bank{
    @Override
    public void bankInterestRate(){
        System.out.println("Punjab has 7.43% interest rates");
    }
}

// statement : find the different banks interest rates using abstract classes
public class c1_Abstract_class_And_Methods {
    public static void main(String[] args) {

        Bank pnb = new PunjabNational();
        pnb.bankInterestRate();

        Bank sbi = new SBI();
        sbi.bankInterestRate();
    }
}

