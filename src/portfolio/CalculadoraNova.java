package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CalculadoraNova extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtX;
	private JLabel lblNewLabel_1;
	private JTextField txtY;
	private JButton btnNewButton;
	private JLabel lblTransformarMsmesesEm;
	private JTextField txtM;
	private JTextField txtA;
	private JLabel lblNewLabel_2;
	private JButton btnCalcular;
	private JLabel lblTransformarAnoEm;
	private JTextField txtW;
	private JLabel lblNewLabel_3;
	private JTextField txtQ;
	private JButton btnTransformar;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraNova frame = new CalculadoraNova();
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
	public CalculadoraNova() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraNova.class.getResource("/img/calendar.png")));
		setTitle("convers\u00E3o de datas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Transformar meses em dias");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 10, 219, 23);
		contentPane.add(lblNewLabel);

		txtX = new JTextField();
		txtX.setBounds(10, 33, 50, 38);
		contentPane.add(txtX);
		txtX.setColumns(10);

		lblNewLabel_1 = new JLabel("em M\u00EAs/meses");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblNewLabel_1.setBounds(70, 43, 180, 13);
		contentPane.add(lblNewLabel_1);

		txtY = new JTextField();
		txtY.setEditable(false);
		txtY.setBounds(136, 33, 68, 38);
		contentPane.add(txtY);
		txtY.setColumns(10);

		btnNewButton = new JButton("converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtX.getText().equals(" ")) {
					JOptionPane.showMessageDialog(null, "Informe os dias");
					txtX.requestFocus();
				} else {

					converter();
				}
			}
		});
		btnNewButton.setBounds(226, 32, 133, 38);
		contentPane.add(btnNewButton);

		lblTransformarMsmesesEm = new JLabel("Transformar M\u00EAs/meses em Ano");
		lblTransformarMsmesesEm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransformarMsmesesEm.setBounds(10, 95, 219, 23);
		contentPane.add(lblTransformarMsmesesEm);

		txtM = new JTextField();
		txtM.setColumns(10);
		txtM.setBounds(10, 127, 50, 38);
		contentPane.add(txtM);

		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setColumns(10);
		txtA.setBounds(136, 127, 68, 38);
		contentPane.add(txtA);

		lblNewLabel_2 = new JLabel("em Ano");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_2.setBounds(81, 139, 180, 13);
		contentPane.add(lblNewLabel_2);

		btnCalcular = new JButton("calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtM.getText().equals(" ")) {
					JOptionPane.showMessageDialog(null, "Informe os meses");
					txtM.requestFocus();
				} else {

					calcular();
				}
			}
		});
		btnCalcular.setBounds(226, 127, 133, 38);
		contentPane.add(btnCalcular);

		lblTransformarAnoEm = new JLabel("Transformar Ano em dias");
		lblTransformarAnoEm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransformarAnoEm.setBounds(10, 195, 219, 23);
		contentPane.add(lblTransformarAnoEm);

		txtW = new JTextField();
		txtW.setColumns(10);
		txtW.setBounds(10, 240, 50, 38);
		contentPane.add(txtW);

		lblNewLabel_3 = new JLabel("Em dias");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_3.setBounds(70, 252, 180, 13);
		contentPane.add(lblNewLabel_3);

		txtQ = new JTextField();
		txtQ.setEditable(false);
		txtQ.setColumns(10);
		txtQ.setBounds(136, 240, 68, 38);
		contentPane.add(txtQ);

		btnTransformar = new JButton("transformar");
		btnTransformar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtQ.getText().equals(" ")) {
					JOptionPane.showMessageDialog(null, "Informe os anos");
					txtQ.requestFocus();
				} else {

					transformar();
				}
			}
		});
		btnTransformar.setBounds(226, 240, 133, 38);
		contentPane.add(btnTransformar);

		btnNewButton_1 = new JButton("limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(10, 288, 75, 40);
		contentPane.add(btnNewButton_1);

		// biblioteca para validar apenas numeros e limitar os campos.

		RestrictedTextField validar = new RestrictedTextField(txtM);
		RestrictedTextField validar1 = new RestrictedTextField(txtA);
		validar.setOnlyNums(true);
		validar1.setOnlyNums(true);
		validar1.setLimit(4);

		RestrictedTextField validar2 = new RestrictedTextField(txtX);
		RestrictedTextField validar3 = new RestrictedTextField(txtY);
		validar2.setOnlyNums(true);
		validar3.setOnlyNums(true);

		RestrictedTextField validar4 = new RestrictedTextField(txtX);
		RestrictedTextField validar5 = new RestrictedTextField(txtY);
		validar4.setOnlyNums(true);
		validar5.setOnlyNums(true);

	}// fim do construtor

	void calcular() {
		// variavies
		double m, a;
		// entrada
		m = Double.parseDouble(txtM.getText());
		// processamneto
		a = (m / 1.2) / 100;
		// saida
		// JOptionPane.showMessageDialog(null, "em Anos " + a, ,
		// JOptionPane.DEFAULT_OPTION)
		txtA.setText(String.valueOf(a));
	}

	void converter() {
		// variavies
		double x, y;
		// entrada
		x = Double.parseDouble(txtX.getText());
		// processamneto
		y = x * 3;
		// saida
		// JOptionPane.showMessageDialog(null, "Mês ou meses " + y,
		// JOptionPane.DEFAULT_OPTION);
		txtY.setText(String.valueOf(y));
	}

	void transformar() {
		// variavies
		double w, q;
		// entrada
		w = Double.parseDouble(txtW.getText());
		// processamneto
		q = w * 365;
		// saida
		// JOptionPane.showMessageDialog(null, "Mês ou meses " + y,
		// JOptionPane.DEFAULT_OPTION);
		txtQ.setText(String.valueOf(q));
	}

	void limpar() {
		txtX.setText(null);
		txtY.setText(null);
		txtM.setText(null);
		txtA.setText(null);
		txtQ.setText(null);
		txtW.setText(null);

	}

}// fim do codigo
