import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Some message", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is some question?", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is some warning.", "title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is some error", "title", JOptionPane.ERROR_MESSAGE);

        // Show confirm dialog; Yes: 0, No: 1, Cancel: 2, Close (X) button: -1
//        int ans = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "Code Title", JOptionPane
//        .YES_NO_CANCEL_OPTION);
//        System.out.println(ans);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println(name);

        /* Fully Customizable Button */
        String[] responses = {"No, you're awesome", "Thank You!", "*Blush*"}; // Will be on YES, NO, CANCEL here in
        // that order
        ImageIcon icon = new ImageIcon("images/50px-thumb.jpg");
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret message", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}