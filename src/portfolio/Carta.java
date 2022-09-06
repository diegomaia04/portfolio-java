package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Carta extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblFace;
	private JLabel lblNipe;
	private JLabel lblNipeCentro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carta dialog = new Carta();
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
	public Carta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Carta.class.getResource("/img/icons8-cartas-64.png")));
		setTitle("Carta");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 461);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(SystemColor.text);
		panel.setBounds(170, 49, 220, 323);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblFace = new JLabel("");
		lblFace.setBackground(SystemColor.text);
		lblFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblFace.setFont(new Font("Arial", Font.BOLD, 22));
		lblFace.setOpaque(true);
		lblFace.setBounds(11, 11, 27, 20);
		panel.add(lblFace);

		lblNipe = new JLabel("");
		lblNipe.setBackground(SystemColor.text);
		lblNipe.setOpaque(true);
		lblNipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNipe.setFont(new Font("Arial", Font.BOLD, 32));
		lblNipe.setBounds(11, 35, 27, 37);
		panel.add(lblNipe);

		lblNipeCentro = new JLabel("");
		lblNipeCentro.setBackground(SystemColor.text);
		lblNipeCentro.setFont(new Font("Arial", Font.BOLD, 90));
		lblNipeCentro.setBounds(40, 45, 160, 250);
		panel.add(lblNipeCentro);

		JButton btnCarta = new JButton("Carta");
		btnCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortearCarta();
			}
		});
		btnCarta.setBounds(39, 70, 89, 23);
		getContentPane().add(btnCarta);

		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton.setBounds(39, 241, 85, 21);
		getContentPane().add(btnNewButton);

	}// fim do construtor

	void sortearCarta() {
		String[] nipes = { "♥", "♦", "♣", "♠" };
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "JJ" };
		Random carta = new Random();
		int indiceFace = carta.nextInt(faces.length);
		int indiceNipe = carta.nextInt(nipes.length);
		// exibir carta
		lblFace.setText(faces[indiceFace]);
		lblNipe.setText(nipes[indiceNipe]);

		// trocar a cor
		if (indiceNipe == 0 || indiceNipe == 1) {
			lblFace.setForeground(Color.RED);
			lblNipe.setForeground(Color.RED);
			lblNipeCentro.setForeground(Color.RED);
		} else {
			lblFace.setForeground(Color.BLACK);
			lblNipe.setForeground(Color.BLACK);
			lblNipeCentro.setForeground(Color.BLACK);
		}

		// Exibir imagens Valete, Dama e Rei
		if (indiceFace == 10) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/valete.png")));
		} else {
			lblNipeCentro.setIcon(null);
			lblNipeCentro.setText("  " + nipes[indiceNipe]);

		}
		if (indiceFace == 11) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/dama.png")));
		} else {
			lblNipeCentro.setText("  " + nipes[indiceNipe]);

		}
		if (indiceFace == 12) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/rei.png")));
		} else {
			lblNipeCentro.setText("  " + nipes[indiceNipe]);
		}
		if (indiceFace == 13) {
			lblNipeCentro.setIcon(new ImageIcon(Carta.class.getResource("/img/Joker.png")));
		} else {
			lblNipeCentro.setText("  " + nipes[indiceNipe]);
		}

	}

	void limpar() {
		lblNipe.setText(null);
		lblFace.setText(null);
		lblNipeCentro.setText(null);
		lblNipeCentro.setIcon(null);

	}

}// fim do codigo
