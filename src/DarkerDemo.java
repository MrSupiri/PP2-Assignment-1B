import javax.swing.*;
import java.awt.*;

class DarkerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color color = Color.red;
        Color darkerColor = color.darker().darker();
        frame.getContentPane().setBackground(darkerColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}