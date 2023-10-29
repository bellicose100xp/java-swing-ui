import javax.swing.*;

class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();

    public MyFrame() {
        setTitle("Drag & Drop Demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(dragPanel);
        this.setVisible(true);
    }
}
