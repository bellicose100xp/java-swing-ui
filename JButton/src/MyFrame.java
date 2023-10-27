import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    public JButton button;
    public JLabel label;

    public MyFrame() {
        ImageIcon icon = new ImageIcon("images/finger-30x50px.png");
        ImageIcon icon2 = new ImageIcon(("images/face-thumb-100x100.png"));

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("button");
        button.setFocusable(false);  // Gets rid of the box outside the button text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(1); // Distance of label from the image (icon)
        button.setForeground(Color.MAGENTA);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        label.setVisible(!label.isVisible());
    }
}
