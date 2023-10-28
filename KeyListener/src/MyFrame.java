import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        // Set background to JFrame
        this.getContentPane().setBackground(Color.darkGray);


        icon =  new ImageIcon("images/rocket.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
//        label.setBackground(Color.RED);
//        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a key is typed, Uses KeyChar, char output
        int offset = 5;
        switch (e.getKeyChar()) {

            case 'h':
                label.setLocation(label.getX() - offset, label.getY());
                break;
            case 'j':
                label.setLocation(label.getX(), label.getY() + offset);
                break;
            case 'k':
                label.setLocation(label.getX(), label.getY() - offset);
                break;
            case 'l':
                label.setLocation(label.getX() + offset, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Invoked when a physical key is pressed down. Uses KeyCode, int output

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
