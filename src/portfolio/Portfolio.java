package portfolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
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
	public Portfolio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
				txtData.setText(formatador.format(data));
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/img/pc.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de projetos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 590, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton.setToolTipText("IMC");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/img/imc (2).png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formulário IMC
				TelaIMC telaIMC = new TelaIMC();
				telaIMC.setVisible(true);
			}
		});
		btnNewButton.setBounds(120, 25, 86, 72);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Sobre");
		btnNewButton_1.setBorderPainted(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no botão
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(354, 280, 147, 45);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorderPainted(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Calculadora da m\u00E9dia");
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/media.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(23, 25, 75, 72);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBorderPainted(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnNewButton_3.setToolTipText("Temperatura");
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/img/termometro.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura conversao = new ConversaoTemperatura();
				conversao.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(216, 25, 72, 76);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setToolTipText("Hello World");
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/img/hello.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no botão
				Hello hello = new Hello();
				hello.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(279, 190, 81, 64);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnNewButton_5.setToolTipText("Porcentagem");
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/img/percentage.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoPorcentagem porcentagem = new CalculoPorcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(294, 25, 86, 76);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_6.setToolTipText("APP");
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/img/app.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppServico servico = new AppServico();
				servico.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(390, 25, 86, 76);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_7.setToolTipText("Gas");
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/img/gas.png")));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(23, 107, 98, 77);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnNewButton_8.setIcon(new ImageIcon(Portfolio.class.getResource("/img/livro.png")));
		btnNewButton_8.setToolTipText("Eleitor");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(132, 111, 74, 77);
		contentPane.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dado dado = new dado();
				dado.setVisible(true);
			}
		});
		btnNewButton_9.setToolTipText("dado");
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setIcon(new ImageIcon(Portfolio.class.getResource("/img/dado.png")));
		btnNewButton_9.setBounds(216, 111, 72, 73);
		contentPane.add(btnNewButton_9);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 328, 576, 64);
		contentPane.add(panel);
		panel.setLayout(null);

		txtData = new JTextField();
		txtData.setEditable(false);
		txtData.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtData.setBounds(213, 10, 277, 32);
		panel.add(txtData);
		txtData.setColumns(10);
		{

		}

		JButton btnNewButton_10 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_10.setToolTipText("tabuada");
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_10.setIcon(new ImageIcon(Portfolio.class.getResource("/img/calculadora.png")));
		btnNewButton_10.setBounds(294, 111, 86, 73);
		contentPane.add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});

		JButton btnNewButton_11 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_11.setToolTipText("CEP");
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setContentAreaFilled(false);
		btnNewButton_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cep cep = new cep();
				cep.setVisible(true);

			}
		});
		btnNewButton_11.setIcon(new ImageIcon(Portfolio.class.getResource("/img/casa.png")));
		btnNewButton_11.setBounds(390, 111, 98, 73);
		contentPane.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnNewButton_12.setToolTipText("tempo");
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setContentAreaFilled(false);
		btnNewButton_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_12.setIcon(new ImageIcon(Portfolio.class.getResource("/img/tempo.png")));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppNovo appnovo = new AppNovo();
				appnovo.setVisible(true);

			}
		});
		btnNewButton_12.setBounds(23, 194, 75, 60);
		contentPane.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculadoraNova calculadoranova = new CalculadoraNova();
				calculadoranova.setVisible(true);

			}
		});
		btnNewButton_13.setIcon(new ImageIcon(Portfolio.class.getResource("/img/calendar.png")));
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_13.setToolTipText("calendario");
		btnNewButton_13.setBounds(119, 190, 87, 69);
		contentPane.add(btnNewButton_13);
		JButton btnNewButton_12_1 = new JButton("");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);
			}
		});
		btnNewButton_12_1.setIcon(new ImageIcon(Portfolio.class.getResource("/img/icons8-cartas-64.png")));
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_12_1.setToolTipText("Carta");
		btnNewButton_12_1.setContentAreaFilled(false);
		btnNewButton_12_1.setBorderPainted(false);
		btnNewButton_12_1.setBounds(213, 194, 75, 60);
		contentPane.add(btnNewButton_12_1);

	}
}// fim do construtor e do codigo
