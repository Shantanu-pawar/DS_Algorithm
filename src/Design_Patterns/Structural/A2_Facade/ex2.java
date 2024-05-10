package Design_Patterns.Structural.A2_Facade;

interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw circle.");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw Rectangle.");
    }
}


class ShapeMaker{
    private Shape circle;
    private Shape rectangle;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}

public class ex2 {
    public static void main(String[] args) {
        ShapeMaker s = new ShapeMaker();
        s.drawCircle();

        s.drawRectangle();
    }
}
