package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppNovo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtM;
	private JTextField txtS;
	private JTextField txtMi;
	private JTextField txtH;
	private JTextField txtX;
	private JTextField txtY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppNovo frame = new AppNovo();
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
	public AppNovo() {
		setTitle("Convers\u00E3o de Tempo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AppNovo.class.getResource("/img/tempo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Convers\u00E3o de minutos a segundos");
		lblNewLabel.setBounds(10, 10, 200, 24);
		contentPane.add(lblNewLabel);

		txtM = new JTextField();
		txtM.setBounds(10, 44, 48, 34);
		contentPane.add(txtM);
		txtM.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("X 60");
		lblNewLabel_1.setBounds(68, 48, 37, 24);
		contentPane.add(lblNewLabel_1);

		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setBounds(116, 44, 48, 34);
		contentPane.add(txtS);
		txtS.setColumns(10);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtM.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe o minuto");
					txtM.requestFocus();
				} else

					calcular();
			}
		});
		btnNewButton.setBounds(204, 50, 101, 21);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("Convers\u00E3o de minuto a Hora");
		lblNewLabel_2.setBounds(10, 102, 183, 24);
		contentPane.add(lblNewLabel_2);

		txtMi = new JTextField();
		txtMi.setBounds(10, 136, 48, 34);
		contentPane.add(txtMi);
		txtMi.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("/ 60");
		lblNewLabel_3.setBounds(70, 146, 45, 13);
		contentPane.add(lblNewLabel_3);

		txtH = new JTextField();
		txtH.setEditable(false);
		txtH.setColumns(10);
		txtH.setBounds(116, 136, 48, 34);
		contentPane.add(txtH);

		JButton btnNewButton_1 = new JButton("CalcularH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMi.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe o minuto");
					txtMi.requestFocus();
				} else

					calcularH();
			}
		});
		btnNewButton_1.setBounds(204, 142, 101, 21);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_4 = new JLabel("Convers\u00E3o de Hora a segundo");
		lblNewLabel_4.setBounds(10, 184, 183, 24);
		contentPane.add(lblNewLabel_4);

		txtX = new JTextField();
		txtX.setColumns(10);
		txtX.setBounds(10, 218, 48, 34);
		contentPane.add(txtX);

		JLabel lblNewLabel_3_1 = new JLabel("X 3600");
		lblNewLabel_3_1.setBounds(70, 228, 45, 13);
		contentPane.add(lblNewLabel_3_1);

		txtY = new JTextField();
		txtY.setEditable(false);
		txtY.setColumns(10);
		txtY.setBounds(116, 218, 48, 34);
		contentPane.add(txtY);

		JButton btnNewButton_2 = new JButton("CalcularS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtX.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe a hora");
					txtX.requestFocus();
				} else

					calcularS();
			}
		});
		btnNewButton_2.setBounds(204, 224, 101, 21);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Limpar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_3.setBounds(10, 280, 85, 21);
		contentPane.add(btnNewButton_3);
		// biblioteca para validar apenas numeros e limitar os campos.

		RestrictedTextField validar = new RestrictedTextField(txtM);

		validar.setOnlyNums(true);

		RestrictedTextField validar2 = new RestrictedTextField(txtMi);

		validar2.setOnlyNums(true);

		RestrictedTextField validar4 = new RestrictedTextField(txtX);

		validar4.setOnlyNums(true);

	}// fim do construtor

	// meteodo para calcular de minutos a segundos
	void calcular() {

		// variavies
		double segundo, minuto;
		// entrada
		minuto = Double.parseDouble(txtM.getText());
		// processamento
		segundo = minuto * 60;
		// saida
		txtS.setText(String.valueOf(segundo));
	}

	// conversão de minutos a Hora
	void calcularH() {

		// variaveis
		double minuto, hora;
		// entrada
		minuto = Double.parseDouble(txtMi.getText());
		// processamneto
		hora = minuto / 60;
		// saida
		txtH.setText(String.valueOf(hora));
	}

	// conversão de Hora a segundo
	void calcularS() {
		// variaveis
		double hora, segundo;
		// entrada
		hora = Double.parseDouble(txtX.getText());
		// processamento
		segundo = hora * 3600;
		// saida
		txtY.setText(String.valueOf(segundo));
	}

	// botao limpar
	void limpar() {
		txtM.setText(null);
		txtS.setText(null);
		txtH.setText(null);
		txtMi.setText(null);
		txtX.setText(null);
		txtY.setText(null);
	}

}// fim do codigo
