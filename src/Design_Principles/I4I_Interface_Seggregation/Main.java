package Design_Principles.I4I_Interface_Seggregation;


interface BathTub {
    void bathtub();
}

interface Room{
    void room();
}

class PremiumUser implements BathTub, Room{
    @Override
    public void bathtub(){
        System.out.println("premium user's can use bathtub");
    }
    @Override
    public void room(){
        System.out.println("premium user's have access to the room");
    }
}

class RegularUser implements Room{
    @Override
    public void room() {
        System.out.println("this is regular user only have access to room.!");
    }
}

public class Main {
    public static void main(String[] args) {

        PremiumUser premium = new PremiumUser();
        premium.bathtub();
        premium.room();

        RegularUser regular = new RegularUser();
        regular.room();
    }
}
