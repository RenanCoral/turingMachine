import javax.swing.*;

public class window extends JFrame {
    private JTabbedPane maquina;
    private JTabbedPane programa;
    private JComboBox comboBox1;
    private JPanel rootPanel;
    private JTable tab1;

    public window() {
        add(rootPanel);
        setTitle("Máquina de Turing");
        setSize(400, 500);
    }

}
