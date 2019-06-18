import java.awt.*;

class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0,0);
        System.out.printf("Location (%s, %s)\n", box.getX(), box.getY());
        System.out.println("Expected location (0,0)");
    }
}
