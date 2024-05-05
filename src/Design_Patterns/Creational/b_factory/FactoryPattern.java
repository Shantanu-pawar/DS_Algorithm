package Design_Patterns.Creational.b_factory;

interface Phone{
    void brandName();
}

class Android implements Phone{
    @Override
    public void brandName() {
        System.out.println("Android::MIUI 8");
    }
}

class Iphone implements Phone{
    @Override
    public void brandName() {
        System.out.println("I-PHONE");
    }
}


// implementing this class so that user don't need to know about inner
//impl of objects
class PhoneFactory {
    public static Phone createPhone(String phoneType){

        switch (phoneType){
            case "android" :
                return new Android();

            case "iphone" :
                return new Iphone();

            default:
                throw new RuntimeException("invalid phone type");
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {

        Phone phone = PhoneFactory.createPhone("iphone");
        phone.brandName();

    }
}