package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class Sobre extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
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
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/download2.png")));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		getContentPane().setForeground(Color.GRAY);
		setTitle("Sobre");
		setModal(true);
		setBounds(100, 100, 501, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Diego Maia Fernandes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(125, 10, 198, 35);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estudante de TI _ projetos");
		lblNewLabel_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		lblNewLabel_1.setBounds(125, 41, 184, 30);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Sobre.class.getResource("/img/download2.png")));
		lblNewLabel_2.setBounds(-3, 75, 211, 178);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Sobre.class.getResource("/img/download.png")));
		lblNewLabel_3.setBounds(243, 94, 222, 131);
		getContentPane().add(lblNewLabel_3);

	}
}
