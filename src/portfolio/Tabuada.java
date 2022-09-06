package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Tabuada extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTabuada;
	private JTextArea txtArea;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada dialog = new Tabuada();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Tabuada() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tabuada.class.getResource("/img/calculadora.png")));
		setTitle("Tabuada");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 314, 478);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tabuada");
		lblNewLabel.setBounds(35, 27, 59, 14);
		getContentPane().add(lblNewLabel);

		txtTabuada = new JTextField();
		txtTabuada.setBounds(92, 24, 70, 20);
		getContentPane().add(txtTabuada);
		txtTabuada.setColumns(10);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtTabuada.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha o campo");
					txtTabuada.requestFocus();
				} else {
					calcular();
				}
			}
		});
		btnCalcular.setBounds(35, 84, 89, 23);
		getContentPane().add(btnCalcular);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(158, 84, 89, 23);
		getContentPane().add(btnLimpar);

		txtArea = new JTextArea();
		txtArea.setBounds(46, 141, 201, 269);
		getContentPane().add(txtArea);

		RestrictedTextField validar = new RestrictedTextField(txtTabuada);
		validar.setOnlyNums(true);
		
	
	
	}// fim do construtor

	void calcular() {
		// vari�veis + entrada
		int valor = Integer.parseInt(txtTabuada.getText());
		// processamento + sa�da
		for (int i = 1; i < 11; i++) {
			txtArea.append(
					" " + String.valueOf(valor) + " x " + String.valueOf(i) + " = " + String.valueOf(valor * i) + "\n");
		}
		// desabilitar o bot�o
		btnCalcular.setEnabled(false);
	}

	void limpar() {
		txtTabuada.setText(null);
		txtArea.setText(null);
		// habilitar o bot�o
		btnCalcular.setEnabled(true);
	}

}// fim do c�digo
