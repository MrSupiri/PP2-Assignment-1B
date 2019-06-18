import javax.swing.*;
import java.awt.*;

class BrighterDemoTwo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color color = new Color(50, 100, 150);
        Color brighterColor = color.brighter();
        frame.getContentPane().setBackground(brighterColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
