import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class window extends JFrame {
    private JPanel rootPanel;
    private JTabbedPane maquina;
    private JSpinner spinner1;
    private JTextField textField1;
    private JButton gerarTextoButton;
    private JButton novaLinhaButton;
    private JButton excluirLinhaButton;
    private JButton concluirButton;
    private JTable create;
    private JTable inputs;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JScrollPane scrollPane1;

    public window() {
        add(rootPanel);
        setVisible(true);
        setTitle("Máquina de Turing");
        setSize(825, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createUIComponents() {
        JTable table1 = new JTable(5, 5);
        Font font = new Font("Verdana", Font.PLAIN, 12);
        table1.setFont(font);
        table1.setRowHeight(15);
        TableColumn colunaDirecao = table1.getColumnModel().getColumn(4);
        JComboBox<String> direcao = new JComboBox<>();
        direcao.addItem("Direita");
        direcao.addItem("Esquerda");
        colunaDirecao.setCellEditor(new DefaultCellEditor(direcao));

        add(new JScrollPane(table1));
    }
}
