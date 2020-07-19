import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;

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
    private String path = "C:\\\\Users\\breno\\OneDrive\\Documents\\Teoria da Computacao\\turingMachine\\Arquivo";
    private DefaultTableModel model;

    public window() {
        add(rootPanel);
        setVisible(true);
        setTitle("Máquina de Turing");
        setSize(825, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createUIComponents() {

        model =new DefaultTableModel ();
        create = new JTable(model );

        //create.setFillsViewportHeight(true);
        //create.setShowHorizontalLines(true);
        create.setGridColor(Color.blue);
        create.setRowSelectionAllowed(true);

//        concluirButton = new JButton(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Concluir isso vai ser bobeira!");
//            }
//        });
//
    //        excluirLinhaButton = new JButton(new AbstractAction() {
    //            @Override
    //            public void actionPerformed(ActionEvent actionEvent) {
    //
    //                int valorCombobox = (Integer) spinner1.getValue();
    //
    //                for (int i = 0; i<valorCombobox ; i++){
    //                    if (create.isCellSelected(i,(valorCombobox*2))){
    //                        System.out.println("Linha selecionada " + i);
    //
    //                    }
    //                }
    //
    //            }
    //        });

        novaLinhaButton = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                model.addRow(new Object[0]);
            }
        });

        gerarTextoButton =  new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int valorCombobox = (Integer) spinner1.getValue();

                if (textField1.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Deve ter valores de entrada para gerar tabela!");
//                else if (valorCombobox < 1)
//                    JOptionPane.showMessageDialog(null, "Deve pelo menos ter 1 estado!");
//                else if (!textField1.getText().equals("→,φ,*"))
//                    JOptionPane.showMessageDialog(null, "Valores de entrada desconhecidos!");

                else {

                    model.addColumn("Estados");
                    model.addColumn("Ler");
                    model.addColumn("Proximo Estado");
                    model.addColumn("Escrever");
                    model.addColumn("Direcao");


                    create.setRowSelectionAllowed(true);
                    String[] pEstados = { "Q","Da","Fly"};
                    JComboBox cbxProEstados = new JComboBox(pEstados);
                    TableColumn tbcProEstados = create.getColumnModel().getColumn(2);
                    tbcProEstados.setCellEditor(new DefaultCellEditor(cbxProEstados));

                    String split[] = textField1.getText().split(",");
                    model.addRow(new String[] {"→","→"});
                    for (int i=0; i<valorCombobox; i++){

                        cbxProEstados.addItem("Q"+i);
                        if (valorCombobox-1 == i)
                            cbxProEstados.addItem("Final");
//                        tbcProEstados.setCellEditor(new DefaultCellEditor(cbxProEstados));
                        for (int j=0; j<split.length; j ++){
                            model.addRow(new String[]{"Q" + i,split[j+1]});

                        }
                    }
                }


            } });


//    public static void gravarArquivo (String Path) throws IOException {
//        FileOutputStream arq = null;
//        PrintStream ps = null;
//
//        try{
//            File file = new File("Arquivo.txt");
//            arq = new FileOutputStream(file);
//
//            try{
//                ps = new PrintStream(arq);
//                ps.println("Toma la");
//            }finally {
//                if (ps!=null)
//                    ps.close();
//            }
//        } finally {
//            if (arq!=null)
//                arq.close();
//        }
//    }
}}
