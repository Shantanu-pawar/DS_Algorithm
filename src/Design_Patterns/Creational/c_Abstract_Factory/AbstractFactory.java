package Design_Patterns.Creational.c_Abstract_Factory;

interface Phone {
    void brand();
}

class Iphone implements Phone {
    @Override
    public void brand() {
        System.out.println("Iphone 16");
    }
}

class Android implements Phone {
    @Override
    public void brand() {
        System.out.println("Android:MIUI 11");
    }
}

// now similarly we've created this interface for major factories
interface PhoneFactory {
    Phone createPhone();
}

class AndroidPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Android();
    }
}

class IPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}

class AbstractFactory {
    public static void main(String[] args) {
        PhoneFactory androidPhoneFactory = new AndroidPhoneFactory();
        Phone androidPhone = androidPhoneFactory.createPhone();
        androidPhone.brand();
    }
}