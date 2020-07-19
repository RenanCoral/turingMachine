import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DefaultCellEditor;

import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.function.IntPredicate;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Point;

public class TuringMachine extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField txtTextfield;
	private JTable table;
	private JTable table_1;
	private JSpinner spinner;
	private DefaultTableModel model;
	private JScrollPane scrollPane;
	private JComboBox<String> cbxEstados;
	private JComboBox<String> cbxLer;
	private JComboBox<String> cbxProEstados;
	private JComboBox<String> cbxEscrever;
	private JComboBox<String> cbxDirecao;
	private String path = "C:\\\\Users\\breno\\eclipse-workspace\\MaquinaTuring";
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException
							| IllegalAccessException e) {
						System.out.println(e);
					}
					TuringMachine frame = new TuringMachine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TuringMachine() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Máquina de Turing");
		setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addTab("M\u00E1quina", null, panel, null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(630, 65));
		panel.add(scrollPane_1);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(new Object[][] { {}, }, new String[] {}));
		table_2.setPreferredSize(new Dimension(680, 60));
		scrollPane_1.setViewportView(table_2);

		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(640, 270));
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setHgap(30);
		panel.add(panel_2);

		JLabel lblOrigem = new JLabel("Origem");
		lblOrigem.setPreferredSize(new Dimension(40, 14));
		panel_2.add(lblOrigem);

		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(14, 0));
		panel_2.add(horizontalStrut_4);

		JLabel lblEscrevendo = new JLabel("Escrevendo");
		lblEscrevendo.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblEscrevendo.setHorizontalTextPosition(SwingConstants.LEFT);
		lblEscrevendo.setHorizontalAlignment(SwingConstants.LEFT);
		lblEscrevendo.setPreferredSize(new Dimension(65, 14));
		panel_2.add(lblEscrevendo);

		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(15, 0));
		panel_2.add(horizontalStrut_6);

		JLabel lblLendo = new JLabel("Lendo");
		lblLendo.setPreferredSize(new Dimension(50, 14));
		panel_2.add(lblLendo);

		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(15, 0));
		panel_2.add(horizontalStrut_7);

		JLabel lblIndo = new JLabel("Indo");
		lblIndo.setPreferredSize(new Dimension(40, 14));
		panel_2.add(lblIndo);

		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(10, 0));
		panel_2.add(horizontalStrut_5);

		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setPreferredSize(new Dimension(50, 14));
		panel_2.add(lblDestino);

		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_11);

		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		panel_2.add(textField_4);
		textField_4.setColumns(10);

		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_12);

		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		horizontalStrut_8.setPreferredSize(new Dimension(520, 0));
		panel_2.add(horizontalStrut_8);

		Component verticalStrut_2 = Box.createVerticalStrut(20);
		panel_2.add(verticalStrut_2);

		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_2.add(verticalStrut_1);

		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnExecutar);

		JButton btnLimparFita = new JButton("Limpar Fita");
		panel_2.add(btnLimparFita);

		JButton btnAbrirArquivo = new JButton("Abrir Arquivo");
		btnAbrirArquivo.setPreferredSize(new Dimension(100, 25));
		panel_2.add(btnAbrirArquivo);

		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		horizontalStrut_9.setPreferredSize(new Dimension(250, 0));
		panel_2.add(horizontalStrut_9);

		JPanel ProgramInsertion = new JPanel();
		FlowLayout flowLayout = (FlowLayout) ProgramInsertion.getLayout();
		tabbedPane.addTab("Inser\u00E7\u00E3o de programas", null, ProgramInsertion, null);
		tabbedPane.setEnabledAt(1, true);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(20);
		flowLayout_1.setHgap(25);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.setPreferredSize(new Dimension(640, 100));
		ProgramInsertion.add(panel_1);

		JLabel lblNewLabel = new JLabel("Estado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblNewLabel);

		spinner = new JSpinner();
		spinner.setPreferredSize(new Dimension(90, 25));
		panel_1.add(spinner);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(80, 0));
		panel_1.add(horizontalStrut);

		JLabel lblNewLabel_1 = new JLabel("Valores de entrada");
		panel_1.add(lblNewLabel_1);

		txtTextfield = new JTextField();
		txtTextfield.setColumns(20);
		txtTextfield.setHorizontalAlignment(SwingConstants.CENTER);
		txtTextfield.setPreferredSize(new Dimension(68, 25));
		panel_1.add(txtTextfield);

		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(640, 230));
		ProgramInsertion.add(scrollPane);

		model = new DefaultTableModel();

		table = new JTable(model);
		table.setPreferredSize(new Dimension(640, 225));
		scrollPane.setViewportView(table);

		JButton btnGerarTabela = new JButton("Gerar Tabela");
		btnGerarTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valorSpinner = (int) spinner.getValue();

				if (model.getColumnCount() == 0) {
					model.addColumn("Estados");
					model.addColumn("Ler");
					model.addColumn("Proximo Estado");
					model.addColumn("Escrever");
					model.addColumn("Direção");

					TableColumn tbcEstado = table.getColumnModel().getColumn(0);
					TableColumn tbcLer = table.getColumnModel().getColumn(1);
					TableColumn tbcProEstado = table.getColumnModel().getColumn(2);
					TableColumn tbcEscrever = table.getColumnModel().getColumn(3);
					TableColumn tbcDirecao = table.getColumnModel().getColumn(4);

					cbxEstados = new JComboBox<String>();
					cbxLer = new JComboBox<String>();
					cbxProEstados = new JComboBox<String>();
					cbxEscrever = new JComboBox<String>();
					cbxDirecao = new JComboBox<String>();

					cbxDirecao.addItem("Esquerda");
					cbxDirecao.addItem("Direita");
					tbcDirecao.setCellEditor(new DefaultCellEditor(cbxDirecao));

//					 model.addRow(new Object[0]);
//					if (txtTextfield.getText().isEmpty())
//						JOptionPane.showMessageDialog(null, "Deve-se ter valores para gerar tabela");
					//
					if (valorSpinner < 0) {
						JOptionPane.showMessageDialog(null, "Apenas valores positivos");
					}

					String[] split = txtTextfield.getText().split(",");
					System.out.println("i: " + valorSpinner);
					System.out.println("j: " + split.length);

					model.addRow(new String[] { ">", ">", "Q0", ">", "Direita" });

					for (int i = 0; i < valorSpinner; i++) {

						cbxEscrever.addItem(split[i]);
						cbxLer.addItem(split[i]);
						cbxProEstados.addItem("Q" + i);
						if (valorSpinner - 1 == i) {
							cbxProEstados.addItem("Final");
							cbxEscrever.addItem(split[i + 1]);
							cbxLer.addItem(split[i + 1]);
							cbxLer.addItem(split[i + 2]);
						}
						tbcProEstado.setCellEditor(new DefaultCellEditor(cbxProEstados));
						tbcEscrever.setCellEditor(new DefaultCellEditor(cbxEscrever));
						tbcLer.setCellEditor(new DefaultCellEditor(cbxLer));

						for (int j = 0; j < split.length; j++) {
							if (split.length - 1 != j) {
								model.addRow(new String[] { "Q" + i });
							}
//							cbxLer.addItem(split[j]);
//							if(split.length -1== j)
//							if(split[j]!=split[j+1]) {
//								if(split.length-2==j)
//								cbxLer.addItem(split[j+1]);
//							}	
//							tbcLer.setCellEditor(new DefaultCellEditor(cbxLer));

						}
					}

				} else
					JOptionPane.showMessageDialog(null, "RECRIAR TABELA");
			}
		});
		btnGerarTabela.setPreferredSize(new Dimension(100, 25));
		panel_1.add(btnGerarTabela);

		Component horizontalStrut_1 = Box.createHorizontalStrut(5);
		horizontalStrut_1.setFont(new Font("Blackadder ITC", Font.PLAIN, 12));
		panel_1.add(horizontalStrut_1);

		JButton btnNovaLinha = new JButton("Nova Linha");
		btnNovaLinha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[0]);
			}
		});
		btnNovaLinha.setPreferredSize(new Dimension(100, 25));
		btnNovaLinha.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnNovaLinha);

		Component horizontalStrut_2 = Box.createHorizontalStrut(5);
		panel_1.add(horizontalStrut_2);

		JButton btnExcluirLinha = new JButton("Excluir Linha");
		btnExcluirLinha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < model.getRowCount(); i++) {
					System.out.println("A linha selecionada é " + i);
					if (table.isRowSelected(i)) {
						model.removeRow(i);
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Precisa selecionar uma linha antes de excluir!");
						break;
					}
				}
			}
		});
		btnExcluirLinha.setPreferredSize(new Dimension(100, 25));
		panel_1.add(btnExcluirLinha);

		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setPreferredSize(new Dimension(100, 25));
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Nada ainda implementado!");
				for (int i = 0; i < table.getRowCount(); i++) {
					for (int j = 0; j < table.getColumnCount(); j++) {

						if (model.getValueAt(i, j) == null) {
							JOptionPane.showMessageDialog(null, "Os campos devem estar preenchido!");

						} else {
							try {
								gravarArquivo(path, (String) model.getValueAt(i, j));
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}
				}

			}
		});

		Component horizontalStrut_3 = Box.createHorizontalStrut(5);
		panel_1.add(horizontalStrut_3);
		panel_1.add(btnConcluir);

	}

	public static void gravarArquivo(String Path, String write) throws IOException {
		FileOutputStream arq = null;
		PrintStream ps = null;

		try {
			File file = new File("Multiplicacao.txt");
			arq = new FileOutputStream(file);

			try {
				ps = new PrintStream(arq);
				ps.println(write);
			} finally {
				if (ps != null)
					ps.close();
			}
		} finally {
			if (arq != null)
				arq.close();
		}
	}
}
