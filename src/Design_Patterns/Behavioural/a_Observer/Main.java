package Design_Patterns.Behavioural.a_Observer;

import java.util.ArrayList;
import java.util.List;

// Subject interface representing the object being observed
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject class representing the stock market
class StockMarket implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}

// Observer interface representing the observer
interface Observer {
    void update(double stockPrice);
}

// Concrete Observer class representing a user tracking stock prices
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name + " received update: Stock price is now $" + stockPrice);
    }
}

// Client code demonstrating the Observer pattern
public class Main {
    public static void main(String[] args) {
        // Create the stock market subject
        StockMarket stockMarket = new StockMarket();

        // Create users (observers)
        User user1 = new User("John");
        User user2 = new User("Alice");

        // Register users as observers
        stockMarket.addObserver(user1);
        stockMarket.addObserver(user2);

        // Set the stock price (change in state)
        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(105.75);
    }
}
