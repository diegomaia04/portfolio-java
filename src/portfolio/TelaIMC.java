package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class TelaIMC extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtResultado;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIMC frame = new TelaIMC();
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
	public TelaIMC() {
		setTitle("C\u00E1lculo do IMC");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaIMC.class.getResource("/img/imcfavicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc.png")));
		lblStatus.setBounds(0, 0, 159, 425);
		contentPane.add(lblStatus);

		JLabel lblNewLabel_1 = new JLabel("PESO");
		lblNewLabel_1.setBounds(291, 57, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtPeso = new JTextField();
		txtPeso.setBounds(291, 82, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("ALTURA");
		lblNewLabel_2.setBounds(291, 113, 46, 14);
		contentPane.add(lblNewLabel_2);

		txtAltura = new JTextField();
		txtAltura.setBounds(291, 142, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setToolTipText("Calcular IMC");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setBorderPainted(false);
		btnCalcular.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/balance.png")));
		btnCalcular.setBounds(189, 342, 64, 64);
		contentPane.add(btnCalcular);

		JButton bntLimpar = new JButton("");
		bntLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpar();
			}
		});
		bntLimpar.setContentAreaFilled(false);
		bntLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bntLimpar.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/eraser.png")));
		bntLimpar.setToolTipText("Limpar");
		bntLimpar.setBorderPainted(false);
		bntLimpar.setBounds(291, 342, 64, 64);
		contentPane.add(bntLimpar);

		JLabel lblNewLabel_3 = new JLabel("Seu IMC \u00E9");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(193, 243, 137, 36);
		contentPane.add(lblNewLabel_3);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(291, 252, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		// uso da biblioteca Atxy2k
		RestrictedTextField validar = new RestrictedTextField(txtPeso, "0123456789.");
		validar.setLimit(4);

		RestrictedTextField validar1 = new RestrictedTextField(txtAltura, "0123456789.");
		validar1.setLimit(4);

	}// fim do construtor

	// meteodo usado para calcular o IMC

	void calcular() {

		// validação
		if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o peso");
			txtPeso.requestFocus();
		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a altura");
			txtAltura.requestFocus();
		} else {

			// lógica principal

			// variavies
			double peso, altura, imc;

			// Formatador
			DecimalFormat formatador = new DecimalFormat("#0.00");

			// entrada
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());

			// procesamneto
			imc = peso / (altura * altura);

			// resultado
			txtResultado.setText(String.valueOf(formatador.format(imc)));
			// Status
			if (imc < 17) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc1.png")));
			} else if (imc < 18.5) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc2.png")));
			} else if (imc < 25) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc3.png")));
			} else if (imc < 30) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc4.png")));
			} else if (imc < 35) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc5.png")));
			} else if (imc < 40) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc6.png")));
			} else if (imc > 40) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc7.png")));
			}

		}
	}

	// Metodo usado para limpar os campos selecionados para fazer o calculo do IMC

	void Limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtResultado.setText(null);
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc.png")));
		txtPeso.requestFocus(); 
		

	}

} // fim do codigo
