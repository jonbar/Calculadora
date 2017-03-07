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
import java.awt.TextField;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	boolean hamartarra = false;
	boolean suma = false;
	boolean resta = false;
	boolean division = false;
	boolean multiplicar = false;
	double num1;
	double num2;

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
		setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 246, 364);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button1.getText());
			}
		});
		button1.setBounds(10, 76, 42, 42);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button2.getText());
			}
		});
		button2.setBounds(59, 76, 42, 42);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//TODO
				textField.setText(textField.getText() + button3.getText());
			}
		});
		button3.setBounds(108, 76, 42, 42);
		contentPane.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button4.getText());
			}
		});
		button4.setBounds(10, 126, 42, 42);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button5.getText());
			}
		});
		button5.setBounds(59, 126, 41, 41);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button6.getText());
			}
		});
		button6.setBounds(108, 126, 41, 41);
		contentPane.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button7.getText());
			}
		});
		button7.setBounds(10, 176, 42, 42);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button8.getText());
			}
		});
		button8.setBounds(59, 176, 42, 42);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button9.getText());
			}
		});
		button9.setBounds(108, 176, 42, 42);
		contentPane.add(button9);
		
		JButton buttonMas = new JButton("+");
		buttonMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				hamartarra = false;
				suma = true;
			}
		});
		buttonMas.setBounds(157, 76, 62, 42);
		contentPane.add(buttonMas);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				hamartarra = false;
			}
		});
		buttonMinus.setBounds(157, 126, 62, 42);
		contentPane.add(buttonMinus);
		
		JButton buttonEntre = new JButton("/");
		buttonEntre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				hamartarra = false;
			}
		});
		buttonEntre.setBounds(157, 176, 62, 42);
		contentPane.add(buttonEntre);
		
		JButton buttonPor = new JButton("*");
		buttonPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				hamartarra = false;
			}
		});
		buttonPor.setBounds(157, 226, 62, 42);
		contentPane.add(buttonPor);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(textField.getText() + button0.getText());
			}
		});
		button0.setBounds(10, 226, 42, 42);
		contentPane.add(button0);
		
		JButton buttonComa = new JButton(".");
		buttonComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				if (hamartarra == false){
					textField.setText(textField.getText() + buttonComa.getText());
					hamartarra = true;
				}
			}
		});
		buttonComa.setBounds(59, 226, 42, 42);
		contentPane.add(buttonComa);
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.setText(null);
				hamartarra = false;
			}
		});
		buttonC.setBounds(108, 226, 42, 42);
		contentPane.add(buttonC);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Gulim", Font.PLAIN, 11));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 207, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				textField.getText();
				
				
			}
		});
		buttonPlusMinus.setBounds(10, 276, 98, 42);
		contentPane.add(buttonPlusMinus);
		
		JButton buttonResultado = new JButton("=");
		buttonResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				
				if (suma == true){
					Double resultado = num1 + num2;
					textField.setText(resultado.toString());
				}
			}
		});
		buttonResultado.setBounds(118, 276, 101, 42);
		contentPane.add(buttonResultado);
	}
}
