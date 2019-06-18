import java.awt.*;

class PerimeterTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(35, 50);
        double perimeter = rectangle.getHeight() * 2 + rectangle.getWidth() * 2;
        System.out.println("The perimeter is "+ perimeter);
        System.out.println("Expected perimeter is "+ 170);
    }
}