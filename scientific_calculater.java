package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class scientific_calculater {

	private JFrame frame;
	private JTextField txtStandard;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result;
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
					scientific_calculater window = new scientific_calculater();
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
	public scientific_calculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Scientific Calculater");
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 872, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 851, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 284, 414);
				textField.setBounds(0,32,257,36);
				}
		});
		mnNewMenu.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 546, 414);
				textField.setBounds(0, 32, 519, 36);
			}
		});
		mnNewMenu.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 860, 414);
				textField.setBounds(0, 32, 519, 36);
			}
		});
		mnNewMenu.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}}
		});
		mnNewMenu.add(mntmExit);
		
		textField = new JTextField();
		textField.setBounds(0, 32, 519, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("B");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String b=null;
                if(textField.getText().length()>0)
                {
                StringBuilder srb=new StringBuilder(textField.getText());
                srb.deleteCharAt(textField.getText().length()-1);
                b=srb.toString();
                textField.setText(b);
			}}
				
					
		});
		button.setBounds(0, 80, 45, 35);
		frame.getContentPane().add(button);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnCe.setBounds(46, 79, 54, 36);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}}
			
		);
		btnC.setBounds(102, 80, 58, 35);
		frame.getContentPane().add(btnC);
		
		
		JButton btnR = new JButton("+/-");
		btnR.setBounds(162, 80, 54, 35);
		frame.getContentPane().add(btnR);
		
		JButton btnSin = new JButton("Root");
		btnSin.setBounds(217, 80, 58, 35);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sqrt(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("L");
		btnSinh.setBounds(278, 80, 58, 35);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnSinh);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(0, 125, 45, 36);
		frame.getContentPane().add(button_1);
		
		JButton btnNewButton = new JButton("8");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);
			}
		});
		btnNewButton.setBounds(46, 126, 54, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMod = new JButton("Sinh");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnMod.setBounds(404, 79, 65, 36);
		frame.getContentPane().add(btnMod);
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.setBounds(102, 126, 58, 35);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+btnNewButton_1.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.setBounds(162, 126, 54, 36);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";	
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("%");
		btnNewButton_3.setBounds(218, 125, 58, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnPi = new JButton("Pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=3.14*num1;
                textField.setText(String.valueOf(num1));
			}
		});
		btnPi.setBounds(278, 125, 58, 36);
		frame.getContentPane().add(btnPi);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(341, 125, 60, 36);
		frame.getContentPane().add(btnCos);
		
		JButton btnInx = new JButton("Inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInx.setBounds(479, 125, 54, 36);
		frame.getContentPane().add(btnInx);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(0, 172, 45, 35);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(46, 173, 54, 34);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setBounds(102, 171, 59, 36);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("*");
		button_5.setBounds(162, 172, 54, 35);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		frame.getContentPane().add(button_5);
		
		JButton btnx = new JButton("1/x");
		btnx.setBounds(217, 172, 56, 35);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setBounds(278, 172, 58, 35);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="X^Y";
			}
		});
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tan(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(343, 172, 58, 35);
		frame.getContentPane().add(btnTan);
		
		JButton btnNewButton_4 = new JButton("Tanh");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_4.setBounds(404, 172, 65, 35);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Mod");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		btnNewButton_5.setBounds(479, 80, 54, 35);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setBounds(404, 125, 65, 36);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		frame.getContentPane().add(btnCosh);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC_1.setBounds(479, 172, 54, 35);
		frame.getContentPane().add(btnC_1);
		
		JButton button_6 = new JButton("1");
		button_6.setBounds(0, 218, 45, 36);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(46, 218, 54, 36);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(102, 219, 58, 34);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_9.setBounds(162, 218, 54, 36);
		frame.getContentPane().add(button_9);
		
		JButton btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
                num1=Math.pow(num1, 2);
                textField.setText(String.valueOf(num1));
				
			}
		});
		btnX.setBounds(278, 218, 58, 35);
		frame.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                double cbr=((num1/num2) *100);
                textField.setText(String.valueOf(cbr));
			}
		});
		btnCbr.setBounds(343, 218, 58, 36);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRand = new JButton("Rund");
		btnRand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.round(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnRand.setBounds(404, 218, 65, 36);
		frame.getContentPane().add(btnRand);
		
		JButton btnpi = new JButton("2*p");
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=3.14*num1*2;
                textField.setText(String.valueOf(num1));
			}
		});
		btnpi.setBounds(479, 218, 54, 36);
		frame.getContentPane().add(btnpi);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(0, 265, 98, 35);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton(".");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(102, 264, 58, 36);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_12.setBounds(162, 265, 54, 34);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
				result=num1+num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="-")
				{
				result=num1-num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="*")
				{
				result=num1*num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="/")
				{
				result=num1/num2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="X^Y")
				{
				result=Math.pow(num1,num2);
				ans=String.format("%.2f",result);
				textField.setText(String.valueOf(ans));
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(String.valueOf(ans));
				}
				}
				
		});
		button_13.setBounds(217, 218, 58, 82);
		frame.getContentPane().add(button_13);
		
		JButton btnX_1 = new JButton("X^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
                num1=Math.pow(num1, 3);
                textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(277, 264, 59, 36);
		frame.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(343, 265, 58, 35);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnHex.setBounds(404, 265, 65, 35);
		frame.getContentPane().add(btnHex);
		
		JButton btnOct = new JButton("Oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnOct.setBounds(479, 264, 54, 36);
		frame.getContentPane().add(btnOct);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(553, 32, 288, 274);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(154, 166, -110, -107);
		panel.add(layeredPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 268, 252);
		panel_1.setBackground(new Color(245, 222, 179));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("CURRENCY CONVERTER");
		lblCurrencyConverter.setBounds(10, 11, 248, 40);
		lblCurrencyConverter.setFont(new Font("Jokerman", Font.BOLD, 17));
		lblCurrencyConverter.setLabelFor(frame);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(45, 62, 158, 28);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "IND", "CHINA"}));
		panel_1.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 113, 158, 28);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel con = new JLabel("");
		con.setBounds(45, 166, 158, 30);
		con.setBackground(new Color(255, 255, 255));
		panel_1.add(con);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(10, 207, 102, 34);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("IND"))
				{
					
					String c=String.format("Rs%.2f",bp*IND );
					con.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USA"));
				{
					
					String c=String.format("$%.2f",bp*USA );
					con.setText(c);
				}
				if(comboBox.getSelectedItem().equals("CHINA"));
				{
					
					String c=String.format("$%.2f",bp*CHINA );
					con.setText(c);
				}		
				}
					
			
		});
		panel_1.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
			}
		});
		btnClear.setBounds(129, 207, 117, 34);
		panel_1.add(btnClear);
		
		JButton btnSin_1 = new JButton("sin");
		btnSin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sin(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSin_1.setBounds(346, 79, 60, 36);
		frame.getContentPane().add(btnSin_1);
		
		
	}
	protected static Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
