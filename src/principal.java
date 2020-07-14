import javax.swing.*;

public class principal extends JFrame {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException |
                IllegalAccessException e) {
            System.out.println(e);
        }
        new window().setVisible(true);
    }
}
