import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button1.setBounds(10, 76, 250, 263);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(59, 76, 201, 263);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBounds(108, 76, 152, 263);
		contentPane.add(button3);
		
		JButton button4 = new JButton("4");
		button4.setBounds(10, 126, 250, 213);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBounds(59, 126, 201, 213);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBounds(108, 126, 152, 213);
		contentPane.add(button6);
		
		JButton button7 = new JButton("7");
		button7.setBounds(10, 176, 250, 163);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBounds(59, 176, 201, 163);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBounds(108, 176, 152, 163);
		contentPane.add(button9);
		
		JButton buttonMas = new JButton("+");
		buttonMas.setBounds(157, 76, 103, 263);
		contentPane.add(buttonMas);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.setBounds(157, 126, 103, 213);
		contentPane.add(buttonMinus);
		
		JButton buttonEntre = new JButton("/");
		buttonEntre.setBounds(157, 176, 103, 163);
		contentPane.add(buttonEntre);
		
		JButton buttonPor = new JButton("*");
		buttonPor.setBounds(157, 226, 103, 113);
		contentPane.add(buttonPor);
		
		JButton button0 = new JButton("0");
		button0.setBounds(10, 226, 250, 113);
		contentPane.add(button0);
		
		JButton buttonComa = new JButton(".");
		buttonComa.setBounds(59, 226, 201, 113);
		contentPane.add(buttonComa);
		
		JButton buttonC = new JButton("C");
		buttonC.setBounds(108, 226, 152, 113);
		contentPane.add(buttonC);
		
		textField = new JTextField();
		textField.setFont(new Font("Gulim", Font.PLAIN, 11));
		textField.setText("00.00");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 207, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.setBounds(10, 276, 250, 63);
		contentPane.add(buttonPlusMinus);
		
		JButton buttonResultado = new JButton("=");
		buttonResultado.setBounds(118, 276, 142, 63);
		contentPane.add(buttonResultado);
	}
}
