package chapter15;

// Tests class JFileChooserDemo.
import java.io.IOException;
import javax.swing.JFrame;

public class JFileChooserTest {
    public static void main(String[] args) throws IOException {
        JFileChooserDemo application = new JFileChooserDemo();
        application.setTitle("My First Java App");
        application.setSize(400, 400);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}
