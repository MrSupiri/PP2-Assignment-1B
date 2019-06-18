import java.awt.*;

class AreaTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 30);
        double area = rectangle.getHeight() * rectangle.getWidth();
        System.out.println("The area is " + area);
        System.out.println("Expected area is "+ 300);
    }
}