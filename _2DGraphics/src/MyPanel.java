import javax.swing.*;
import java.awt.*;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Font;

class MyPanel extends JPanel {
    Image image;

    public MyPanel() {
        image = new ImageIcon("images/dude.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;


        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.BLUE);
        g2D.drawLine(0, 0, 500, 500);

        g2D.drawImage(image, 250, 250, 240, 240, null);

        g2D.setStroke(new BasicStroke(4));
        g2D.setPaint(Color.MAGENTA);
        g2D.drawRect(50, 180, 100, 200);
        g2D.setPaint(Color.PINK);
        g2D.fillRect(52, 182, 96, 196);

        g2D.setPaint(Color.ORANGE);
        g2D.fillOval(200, 100, 100, 100);

        g2D.fillPolygon(new int[]{100, 100, 200 }, new int[]{50, 150, 150}, 3);

        g2D.setPaint(Color.BLACK);
        g2D.setFont(new Font("Consolas", Font.BOLD, 30));
        g2D.drawString("U R A WINNER", 250, 100);


    }
}
