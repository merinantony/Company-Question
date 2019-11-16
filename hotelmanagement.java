package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hotelmanagement {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
double result,num1,num2;
String op;

String ans;
double USA=302.96;
double IND=37.5;
double CHINA=43;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelmanagement window = new hotelmanagement();
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
	public hotelmanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Hotel Management System");
		frame.setBounds(100, 100, 878, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 77, 291, 213);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setBounds(10, 23, 105, 14);
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setBounds(10, 48, 120, 14);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setBounds(10, 73, 105, 14);
		panel.add(lblCheeseBurger);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(10, 108, 246, 1);
		panel.add(panel_6);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDrink.setBounds(20, 117, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblQty.setBounds(139, 117, 46, 14);
		panel.add(lblQty);
		
		JRadioButton rd1 = new JRadioButton("Home Delivery");
		rd1.setBounds(6, 169, 109, 23);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Tax");
		rd2.setBounds(133, 169, 109, 23);
		panel.add(rd2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Coffee", "Pepsi", "Mereenda", "coca-cola"}));
		comboBox.setBounds(20, 142, 76, 20);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(140, 20, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 45, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 77, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(140, 142, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(311, 77, 231, 213);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrencyConverter.setBounds(30, 23, 145, 22);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"India", "USA", "China"}));
		comboBox_1.setBounds(40, 59, 121, 20);
		panel_1.add(comboBox_1);

		textField_11 = new JTextField();
		textField_11.setBounds(40, 108, 121, 20);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rd2.isSelected()==true) {
		               double m = Double.parseDouble(textField_8.getText());
		               double t = (m*18)/100;
		               String s = String.format("%.2f", t);
		               textField_11.setText(s);
		               }
		               double bp = Double.parseDouble(textField_11.getText());
		               if(comboBox_1.getSelectedItem().equals("India"))
		               {
		                   String c = String.format("Rs %.2f", bp*IND);
		                   textField_11.setText(c);
		               }
		               if(comboBox_1.getSelectedItem().equals("China"))
		               {
		                   String c = String.format("Rs %.2f", bp*CHINA);
		                   textField_11.setText(c);
		               }
		               if(comboBox_1.getSelectedItem().equals("USA"))
		               {
		                   String c = String.format("Rs %.2f", bp*USA);
		                   textField_11.setText(c);
		               }}}
			
				/*double bp=Double.parseDouble(textField_8.getText());
				if(comboBox.getSelectedItem().equals("IND"))
				{
					
					String c=String.format("Rs%.2f",bp*IND );
					textField_11.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USA"));
				{
					
					String c=String.format("$%.2f",bp*USA );
					textField_11.setText(c);
				}
				if(comboBox.getSelectedItem().equals("CHINA"));
				{
					
					String c=String.format("$%.2f",bp*CHINA );
					textField_11.setText(c);
				}}		
				}*/
				
			
		);
		btnConvert.setBounds(10, 165, 89, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(null);
			}
		});
		btnClose.setBounds(119, 165, 89, 23);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 240, 240));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(10, 301, 291, 146);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setBounds(10, 22, 94, 14);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeals = new JLabel("Cost of Meals");
		lblCostOfMeals.setBounds(10, 55, 74, 14);
		panel_2.add(lblCostOfMeals);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setBounds(10, 88, 94, 14);
		panel_2.add(lblCostOfDelivery);
		
		textField_3 = new JTextField();
		textField_3.setBackground(UIManager.getColor("Button.background"));
		textField_3.setBounds(129, 16, 86, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(UIManager.getColor("Button.background"));
		textField_4.setColumns(10);
		textField_4.setBounds(129, 52, 86, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(UIManager.getColor("Button.background"));
		textField_5.setColumns(10);
		textField_5.setBounds(129, 85, 86, 20);
		panel_2.add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(311, 301, 231, 146);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 21, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 52, 46, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 89, 46, 14);
		panel_3.add(lblTotal);
		
		textField_6 = new JTextField();
		textField_6.setBackground(UIManager.getColor("Button.background"));
		textField_6.setBounds(77, 11, 86, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(UIManager.getColor("Button.background"));
		textField_7.setBounds(77, 49, 86, 20);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(UIManager.getColor("Button.background"));
		textField_8.setBounds(77, 86, 86, 20);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(552, 77, 291, 370);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 57, 271, 302);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculater", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_9 = new JTextField();
		textField_9.setBounds(10, 11, 231, 38);
		panel_7.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
                if(textField_9.getText().length()>0)
                {
                StringBuilder srb=new StringBuilder(textField_9.getText());
                srb.deleteCharAt(textField_9.getText().length()-1);
                b=srb.toString();
                textField_9.setText(b);
					
			}
			}});
		btnB.setBounds(10, 60, 51, 38);
		panel_7.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_9.setText(null);
			}
		});
		btnC.setBounds(71, 60, 51, 38);
		panel_7.add(btnC);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				op="%";
			}
		});
		button_1.setBounds(132, 60, 51, 38);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				op="+";
			}
		});
		button_2.setBounds(193, 60, 63, 38);
		panel_7.add(button_2);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button.getText();
				textField_9.setText(Number);
			}
		});
		button.setBounds(10, 103, 51, 38);
		panel_7.add(button);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_3.getText();
				textField_9.setText(Number);
			}
		});
		button_3.setBounds(71, 103, 51, 38);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_4.getText();
				textField_9.setText(Number);
			}
		});
		button_4.setBounds(132, 103, 51, 38);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("-");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				op="-";
			}
		});
		button_5.setBounds(193, 103, 63, 38);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_6.getText();
				textField_9.setText(Number);
			}
		});
		button_6.setBounds(10, 147, 51, 38);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_7.getText();
				textField_9.setText(Number);
			}
		});
		button_7.setBounds(71, 147, 51, 38);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_8.getText();
				textField_9.setText(Number);
			}
		});
		button_8.setBounds(132, 147, 51, 38);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				op="*";
			}
		});
		button_9.setBounds(193, 147, 63, 38);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_10.getText();
				textField_9.setText(Number);
			}
		});
		button_10.setBounds(10, 190, 51, 38);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("2");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_11.getText();
				textField_9.setText(Number);
			}
		});
		button_11.setBounds(71, 190, 51, 38);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_12.getText();
				textField_9.setText(Number);
			}
		});
		button_12.setBounds(132, 190, 51, 38);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				op="/";
			}
		});
		button_13.setBounds(193, 190, 63, 38);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("0");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_14.getText();
				textField_9.setText(Number);
			}
		});
		button_14.setBounds(10, 236, 51, 38);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton(".");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_15.getText();
				textField_9.setText(Number);
			}
		});
		button_15.setBounds(71, 236, 51, 38);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("00");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_9.getText()+button_16.getText();
				textField_9.setText(Number);
			}
		});
		button_16.setBounds(132, 236, 51, 38);
		panel_7.add(button_16);
		
		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2=Double.parseDouble(textField_9.getText());
				if(op=="+")
				{
				result=num1+num2;
				ans=String.format("%.2f", result);
				textField_9.setText(ans);
				}
				if(op=="-")
				{
				result=num1-num2;
				ans=String.format("%.2f", result);
				textField_9.setText(ans);
				}
				if(op=="*")
				{
				result=num1*num2;
				ans=String.format("%.2f", result);
				textField_9.setText(ans);
				}
				if(op=="/")
				{
				result=num1/num2;
				ans=String.format("%.2f", result);
				textField_9.setText(ans);
				}
				if(op=="%")
				{
				result=num1%num2;
				ans=String.format("%.2f", result);
				textField_9.setText(ans);
				}
			}
		});
		button_17.setBounds(193, 236, 63, 38);
		panel_7.add(button_17);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setBounds(10, 11, 209, 22);
		panel_8.add(lblNewLabel);
		
		JLabel lblChickenBurger_1 = new JLabel("Chicken Burger");
		lblChickenBurger_1.setBounds(10, 62, 114, 14);
		panel_8.add(lblChickenBurger_1);
		
		JLabel lblChickenBurgerMeat = new JLabel("Chicken Burger Meat");
		lblChickenBurgerMeat.setBounds(10, 99, 144, 14);
		panel_8.add(lblChickenBurgerMeat);
		
		JLabel lblCheeseBurger_1 = new JLabel("Cheese Burger");
		lblCheeseBurger_1.setBounds(10, 136, 81, 14);
		panel_8.add(lblCheeseBurger_1);
		
		JLabel lblThanksForUsing = new JLabel("Thanks for using Job Estimater");
		lblThanksForUsing.setBounds(10, 183, 246, 14);
		panel_8.add(lblThanksForUsing);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(144, 62, 46, 14);
		panel_8.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(144, 99, 46, 14);
		panel_8.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(144, 136, 46, 14);
		panel_8.add(lblNewLabel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(10, 458, 833, 75);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnTotal.setBounds(67, 28, 89, 23);
		panel_5.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReceipt.setBounds(209, 28, 89, 23);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				comboBox.setSelectedIndex(0);
				textField_10.setText(null);
				
				
			}
		});
		btnReset.setBounds(369, 28, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Confirm");
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Cancel",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(537, 28, 89, 23);
		panel_5.add(btnExit);
		
		JLabel lblHotelManagementSystems = new JLabel("Hotel Management Systems");
		lblHotelManagementSystems.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHotelManagementSystems.setBounds(87, 24, 363, 31);
		frame.getContentPane().add(lblHotelManagementSystems);
	}
}
