import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("images/face.png");
    Point imageCorner;
    Point prevPt;

    public DragPanel() {

        imageCorner = new Point(0, 0);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    /**
     * Paints the image to the screen.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the image on the panel at the specified coordinates
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
            System.out.println(prevPt);
        }

    }

    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();

            imageCorner.translate((int) (currentPt.getX() - prevPt.getX()), (int) (currentPt.getY() - prevPt.getY()));

            prevPt = currentPt;
            repaint();
        }
    }
}
