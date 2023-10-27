import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);


        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);


        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); // Bottom - first layer
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER); // Bottom of label1 - Same layer, next component goes behind
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER); // Top of label1 since DRAG layer goes on top of all other JLayers

        /* Same as above, helpful in case you don't remember which layer goes on top */
        layeredPane.add(label1, Integer.valueOf(0)); // Bottom - first layer
        layeredPane.add(label2, Integer.valueOf(0)); // Bottom of label1 - Same layer, next component goes behind
        layeredPane.add(label3, Integer.valueOf(4)); // Top of label1 since DRAG layer goes on top of all other JLayers

        JFrame frame = new JFrame();
        frame.add(layeredPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}