import java.awt.*;

class BrighterDemo {
    public static void main(String[] args) {
        Color color = new Color(50, 100, 150);
        Color brighterColor = color.brighter();
        System.out.printf("Red : %s\nBlue : %s\nGreen %s", brighterColor.getRed(), brighterColor.getBlue(), brighterColor.getGreen());
    }
}