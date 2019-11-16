package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class sample {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
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
	public sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.PINK);
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSelect_1 = new JButton(new ImageIcon("C://Users/USER/Desktop/my downloads/logs.png"));
		btnSelect_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelect_1.setBounds(0, 27, 169, 195);
		frame.getContentPane().add(btnSelect_1);
		
		txtUserName = new JTextField();
		txtUserName.setBackground(Color.WHITE);
		txtUserName.setText("User name");
		txtUserName.setBounds(326, 27, 86, 20);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("password");
		txtPassword.setBounds(326, 61, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JCheckBox chckbxReminder = new JCheckBox("Reminder");
		chckbxReminder.setFont(new Font("Tahoma", Font.ITALIC, 11));
		chckbxReminder.setBounds(268, 109, 97, 23);
		frame.getContentPane().add(chckbxReminder);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(193, 165, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(326, 165, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		JLabel label = new JLabel("");
		label.setBounds(217, 31, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblUserName = new JLabel("User  name");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setBackground(new Color(255, 255, 255));
		lblUserName.setBounds(227, 27, 77, 20);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(237, 64, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("C://Users/USER/Desktop/my downloads/submit.png"));
		btnNewButton_1.setBounds(203, 199, 162, 52);
		frame.getContentPane().add(btnNewButton_1);
	}
}
