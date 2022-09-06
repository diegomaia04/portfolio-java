package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dado frame = new dado();
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
	public dado() {
		setTitle("Jogo do dado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(dado.class.getResource("/img/dado.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblD = new JLabel("");
		lblD.setIcon(new ImageIcon(dado.class.getResource("/img/face1.png")));
		lblD.setToolTipText("dado");
		lblD.setBounds(149, 10, 126, 124);
		contentPane.add(lblD);

		JButton btnlancar = new JButton("Jogar");
		btnlancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortear();
			}
		});
		btnlancar.setBounds(149, 275, 105, 37);
		contentPane.add(btnlancar);
	}// fim do construtor

	// sortear os dados

	void sortear() {
		Random random = new Random();
		int dado = random.nextInt(6);
		// Dica para verificar o número sorteado

		switch (dado) {
		case 0:
			lblD.setIcon(new ImageIcon(dado.class.getResource("/img/face1.png")));
			break;
		case 1:
			lblD.setIcon(new ImageIcon(dado.class.getResource("/img/face2.png")));
			break;
		case 2:
			lblD.setIcon(new ImageIcon(dado.class.getResource("/img/face3.png")));
			break;
		case 3:
			lblD.setIcon(new ImageIcon(dado.class.getResource("/img/face4.png")));
			break;
		case 4:
			lblD.setIcon(new ImageIcon(dado.class.getResource("/img/face5.png")));
			break;
		case 5:
			lblD.setIcon(new ImageIcon(dado.class.getResource("/img/face6.png")));
			break;
		}
	}

}// fim do codigo
