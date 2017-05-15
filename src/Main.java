import javax.swing.*;
import java.awt.*;

/**
 * Initialization
 */
public class Main {

    public static JFrame frame = new JFrame();

    public static void main(String args[]) {
        Display.ImageA = Display.convertImage("src/imageA.png");
        Display.ImageB = Display.convertImage("src/imageB.png");
        initDisplay();
    }

    private static void initDisplay() {
        Display display = new Display();
        display.setPreferredSize(new Dimension(1080, 675));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1080, 675);
        frame.setVisible(true);
        frame.add(display);
        frame.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
    }
}
