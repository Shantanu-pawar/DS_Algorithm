package Design_Patterns.Structural.A2_Facade;

// Subsystem 1
class Inventory {
    public boolean isAvailable(String product) {
        // Check warehouse database for product availability.
        return true;
    }
}

// Subsystem 2
class Payment {
    public boolean processPayment(String orderID) {
        // this function will check if payment Process completed?.
        return true;
    }
}

// Subsystem 3
class Shipping {
    public void shipProduct(String product) {
        System.out.println("\nyou're product is shipped at 12-02-2001 11:32:04MM ");
    }
}

// Facade
class OrderServiceFacade {
    private Inventory inventory = new Inventory();
    private Payment payment = new Payment();
    private Shipping shipping = new Shipping();

    public boolean placeOrder(String productID) {
        if (!inventory.isAvailable(productID)) return false;
        if (!payment.processPayment(productID)) return false;
        shipping.shipProduct(productID);
        return true;
    }
}

class ex1 {
    public static void main(String[] args) {

        OrderServiceFacade orderService = new OrderServiceFacade();
        boolean orderPlaced = orderService.placeOrder("1234");
        System.out.println("Order placed successfully: " + orderPlaced);
    }
}