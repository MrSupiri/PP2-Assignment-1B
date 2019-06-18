import java.awt.*;

class PerimeterArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 6);
        System.out.println("The area is "+ rectangle.getWidth() * rectangle.getHeight());
        System.out.printf("Height: %f \nWidth: %f", rectangle.getWidth(), rectangle.getHeight());

        Rectangle rectangleTwo = new Rectangle(11, 10);
        System.out.printf("The perimeter is %f", 2 * rectangleTwo.getWidth() + 2 * rectangleTwo.getHeight());
        System.out.printf("\nHeight: %f\nWidth: %f", rectangleTwo.getWidth(), rectangleTwo.getHeight());
    }
}