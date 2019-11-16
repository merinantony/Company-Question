package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calculater {

	private JFrame frame;
	private JTextField textField;
double num1;
double num2;
double result;
String op;
String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculater window = new Calculater();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculater");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 11, 385, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setForeground(new Color(0, 0, 0));
		button.setBounds(21, 80, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(120, 80, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBackground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(219, 80, 89, 23);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBackground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBounds(21, 114, 89, 23);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBackground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBounds(120, 114, 89, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBackground(Color.WHITE);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBounds(219, 114, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBackground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setBounds(21, 148, 89, 23);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBackground(Color.WHITE);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setBounds(120, 148, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBackground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setBounds(219, 148, 89, 23);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setBackground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setBounds(21, 188, 89, 23);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.setBackground(Color.WHITE);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.setBounds(120, 188, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.setBackground(Color.WHITE);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
				result=num1+num2;
				ans=String.format("%d.2f", result);
				textField.setText(ans);
				}
				if(op=="-")
				{
				result=num1-num2;
				ans=String.format("%d.2f", result);
				textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%d.2f", result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%d.2f", result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%d.2f", result);
					textField.setText(ans);
				}
				
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_11.setBounds(219, 188, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setBackground(new Color(255, 255, 204));
		button_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_12.setBounds(335, 120, 89, 23);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Number=textField.getText()+button_12.getText();
				//textField.setText(Number);
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.setBackground(new Color(255, 255, 204));
		button_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_13.setBounds(335, 154, 89, 23);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Number=textField.getText()+button_13.getText();
			//	textField.setText(Number);
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.setBackground(new Color(255, 255, 204));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Number=textField.getText()+button_14.getText();
			//	textField.setText(Number);
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_14.setBounds(335, 188, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.setBackground(new Color(255, 255, 204));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Number=textField.getText()+button_15.getText();
				//textField.setText(Number);
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_15.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(255, 255, 204));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnC.setBounds(69, 228, 89, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnB.setBackground(new Color(255, 255, 204));
		btnB.setBounds(194, 228, 89, 23);
		frame.getContentPane().add(btnB);
		
		JButton button_16 = new JButton("%");
		button_16.setBackground(new Color(255, 255, 204));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Number=textField.getText()+button_16.getText();
				//textField.setText(Number);
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_16.setBounds(335, 80, 89, 23);
		frame.getContentPane().add(button_16);
	}
}
