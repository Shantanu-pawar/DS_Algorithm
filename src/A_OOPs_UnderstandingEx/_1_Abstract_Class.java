package A_OOPs_UnderstandingEx;

public class _1_Abstract_Class {
    public static void main(String[] args) {
        Circle circle = new Circle(2.2);
        System.out.println(circle.length());

        Rectangle rectangle = new Rectangle(23);
        System.out.println(rectangle.parameters());

    }
}


abstract class Shape{
    abstract double length();
    abstract double parameters();
}

class Circle extends Shape{

    double radius;

    public Circle(double radius) { // constructors for setting the obj
        this.radius = radius;
    }

    @Override
    double length(){
        // finding diameter
        return radius * 2;
    }

    @Override
    double parameters(){
        System.out.println("this is radius of circle");
        return radius;
    }
}

class Rectangle extends Shape{
    private double height;

    public Rectangle(double height) {
        this.height = height;
    }

    @Override
    double length(){
        return height * 4;
    }

    @Override
    double parameters(){
        System.out.println("this is height : ");
        return height;
    }
}
