import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Set layout to BorderLayout with grid gap of 10
        frame.setLayout(new BorderLayout(10, 10));
        frame.setVisible(true);

       /* -------------------- Main Panels -------------------- */
        JPanel northPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        northPanel.setBackground(Color.RED);
        westPanel.setBackground(Color.GREEN);
        eastPanel.setBackground(Color.YELLOW);
        southPanel.setBackground(Color.MAGENTA);
        centerPanel.setBackground(Color.BLUE);

        northPanel.setPreferredSize(new Dimension(100, 100));
        westPanel.setPreferredSize(new Dimension(100, 100));
        eastPanel.setPreferredSize(new Dimension(100, 100));
        southPanel.setPreferredSize(new Dimension(100, 100));
        centerPanel.setPreferredSize(new Dimension(100, 100));

        /* -------------------- Sub Panels -------------------- */

        JPanel northSubPanel = new JPanel();
        JPanel westSubPanel = new JPanel();
        JPanel eastSubPanel = new JPanel();
        JPanel southSubPanel = new JPanel();
        JPanel centerSubPanel = new JPanel();

        northSubPanel.setBackground(Color.black);
        westSubPanel.setBackground(Color.darkGray);
        eastSubPanel.setBackground(Color.gray);
        southSubPanel.setBackground(Color.lightGray);
        centerSubPanel.setBackground(Color.white);

        // Set center panel layout to BorderLayout since that where we're adding sub-panels
        centerPanel.setLayout(new BorderLayout());

        northSubPanel.setPreferredSize(new Dimension(50, 50));
        westSubPanel.setPreferredSize(new Dimension(50, 50));
        eastSubPanel.setPreferredSize(new Dimension(50, 50));
        southSubPanel.setPreferredSize(new Dimension(50, 50));
        centerSubPanel.setPreferredSize(new Dimension(50, 50));

        centerPanel.add(northSubPanel, BorderLayout.NORTH);
        centerPanel.add(westSubPanel, BorderLayout.WEST);
        centerPanel.add(eastSubPanel, BorderLayout.EAST);
        centerPanel.add(southSubPanel, BorderLayout.SOUTH);
        centerPanel.add(centerSubPanel, BorderLayout.CENTER);

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(centerPanel, BorderLayout.CENTER);
    }
}