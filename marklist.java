package swing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class marklist {

protected static final JComboBox ComboBox = null;
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
private JTextField textField_12;
private JTextField textField_13;
private JTable table;
private JTable table_1;
private KeyEvent evt;
private Object textArea;

double num;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
marklist window = new marklist();
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
public marklist() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("Mark List");
frame.getContentPane().setBackground(new Color(51, 51, 153));
frame.setBounds(100, 100, 831, 518);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(Color.GRAY);
panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
panel.setBounds(10, 25, 380, 289);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblStudentid = new JLabel("Student_ID");
lblStudentid.setBounds(10, 34, 65, 14);
panel.add(lblStudentid);

textField = new JTextField();
textField.setBounds(79, 31, 86, 20);
panel.add(textField);
textField.setColumns(10);

JLabel lblFirstName = new JLabel("First Name");
lblFirstName.setBounds(10, 71, 65, 14);
panel.add(lblFirstName);

textField_1 = new JTextField();
textField_1.setBounds(79, 68, 86, 20);
panel.add(textField_1);
textField_1.setColumns(10);

JLabel lblSurname = new JLabel("Surname");
lblSurname.setBounds(10, 105, 65, 14);
panel.add(lblSurname);

textField_2 = new JTextField();
textField_2.setBounds(79, 102, 86, 20);
panel.add(textField_2);
textField_2.setColumns(10);

JLabel lblCourseCode = new JLabel("Course Code");
lblCourseCode.setBounds(10, 137, 65, 14);
panel.add(lblCourseCode);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"    -Select-", "110A", "111B", "112C", "113D", "114E", "115F"}));
comboBox.setBounds(79, 133, 84, 20);
panel.add(comboBox);

JSeparator separator = new JSeparator();
separator.setBounds(10, 162, 161, 2);
panel.add(separator);

JLabel lblTotalScore = new JLabel("Total Score");
lblTotalScore.setBounds(10, 180, 65, 14);
panel.add(lblTotalScore);

textField_3 = new JTextField();
textField_3.setBounds(79, 177, 86, 20);
panel.add(textField_3);
textField_3.setColumns(10);

JLabel lblAverage = new JLabel("Average");
lblAverage.setBounds(10, 210, 46, 14);
panel.add(lblAverage);

textField_4 = new JTextField();
textField_4.setBounds(79, 208, 86, 20);
panel.add(textField_4);
textField_4.setColumns(10);

JLabel lblRanking = new JLabel("Ranking");
lblRanking.setBounds(10, 242, 46, 14);
panel.add(lblRanking);

textField_5 = new JTextField();
textField_5.setBounds(79, 239, 86, 20);
panel.add(textField_5);
textField_5.setColumns(10);

JLabel lblMaths = new JLabel("Maths");
lblMaths.setBounds(195, 34, 46, 14);
panel.add(lblMaths);

textField_6 = new JTextField();
textField_6.addKeyListener(new KeyAdapter() {

@Override
public void keyTyped(KeyEvent evt) {
char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                   
}
}
});
textField_6.setBounds(249, 31, 86, 20);
panel.add(textField_6);
textField_6.setColumns(10);

JLabel lblEnglish = new JLabel("English");
lblEnglish.setBounds(195, 71, 46, 14);
panel.add(lblEnglish);

textField_7 = new JTextField();
textField_7.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(java.awt.event.KeyEvent evt) {
        char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    
    
	}});
textField_7.setBounds(249, 68, 86, 20);
panel.add(textField_7);
textField_7.setColumns(10);

JLabel lblBiology = new JLabel("Biology");
lblBiology.setBounds(195, 105, 46, 14);
panel.add(lblBiology);

textField_8 = new JTextField();
textField_8.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(java.awt.event.KeyEvent evt) {
        char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
	
});
textField_8.setBounds(249, 102, 86, 20);
panel.add(textField_8);
textField_8.setColumns(10);

JLabel lblComputer = new JLabel("Computer");
lblComputer.setBounds(195, 137, 52, 14);
panel.add(lblComputer);

textField_9 = new JTextField();
textField_9.addKeyListener(new KeyAdapter() {
	@Override
	
		public void keyTyped(java.awt.event.KeyEvent evt) {
	        char num=evt.getKeyChar();
	        if(!(Character.isDigit(num))
	                ||(num==KeyEvent.VK_BACK_SPACE)
	                ||(num==KeyEvent.VK_DELETE)) {
	            evt.consume();
	        }
	    }
		
	});
textField_9.setBounds(249, 134, 86, 20);
panel.add(textField_9);
textField_9.setColumns(10);

JLabel lblChemistryl = new JLabel("Chemistry");
lblChemistryl.setBounds(195, 167, 52, 14);
panel.add(lblChemistryl);

textField_10 = new JTextField();
textField_10.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(java.awt.event.KeyEvent evt) {
        char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
	
});
textField_10.setBounds(249, 162, 86, 20);
panel.add(textField_10);
textField_10.setColumns(10);

JLabel lblPhysics = new JLabel("Physics");
lblPhysics.setBounds(195, 197, 46, 14);
panel.add(lblPhysics);

textField_11 = new JTextField();
textField_11.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(java.awt.event.KeyEvent evt) {
        char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
	
});
textField_11.setBounds(249, 193, 86, 20);
panel.add(textField_11);
textField_11.setColumns(10);

JLabel lblTamil = new JLabel("Tamil");
lblTamil.setBounds(195, 227, 46, 14);
panel.add(lblTamil);

textField_12 = new JTextField();
textField_12.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(java.awt.event.KeyEvent evt) {
        char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
	
});
textField_12.setBounds(249, 224, 86, 20);
panel.add(textField_12);
textField_12.setColumns(10);

JLabel lblMalayalam = new JLabel("Malayalam");
lblMalayalam.setBounds(195, 252, 52, 14);
panel.add(lblMalayalam);

textField_13 = new JTextField();
textField_13.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(java.awt.event.KeyEvent evt) {
        char num=evt.getKeyChar();
        if(!(Character.isDigit(num))
                ||(num==KeyEvent.VK_BACK_SPACE)
                ||(num==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
	
});
textField_13.setBounds(249, 255, 86, 20);
panel.add(textField_13);
textField_13.setColumns(10);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(100, 149, 237));
panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
panel_1.setBounds(400, 25, 405, 323);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JTextArea textArea_1 = new JTextArea();
textArea_1.setBounds(10, 21, 385, 264);
panel_1.add(textArea_1);
JButton btnClear = new JButton("clear");
btnClear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	
	textArea_1.setText("");
	}
});
btnClear.setBounds(165, 289, 89, 23);
panel_1.add(btnClear);

table_1 = new JTable();
table_1.setModel(new DefaultTableModel(
new Object[][] {
{"Student_ID", "Course", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},

},
new String[] {
"Student_ID", "Course", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"
}
));
table_1.setBounds(10, 359, 795, 64);
frame.getContentPane().add(table_1);

JButton btnNewButton = new JButton("Add Report");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	double total,avg;
	double t1 = Double.parseDouble(textField_6.getText());
    double t2 = Double.parseDouble(textField_7.getText());
    double t3 = Double.parseDouble(textField_8.getText());
    double t4 = Double.parseDouble(textField_9.getText());
    double t5 = Double.parseDouble(textField_10.getText());
    double t6 = Double.parseDouble(textField_11.getText());
    double t7 = Double.parseDouble(textField_12.getText());
    double t8 = Double.parseDouble(textField_13.getText());
    total = t1+t2+t3+t4+t5+t6+t7+t8;
    String c = String.format("%.2f", total);
    textField_3.setText(c);
    avg = total/8;
    String a = String.format("%.2f", avg);
    textField_4.setText(a);
    if(total>700)
    {
        textField_5.setText("1");
    }
    else if(total>600 && total<700)
    {
        textField_5.setText("2");
    }
    else if(total>500 && total<600)
    {
        textField_5.setText("3");
    }
    else if(total>300 && total<500)
    {
        textField_5.setText("4");
    }
    else if(total>100 && total<300)
    {
        textField_5.setText("5");
    }
    else
    {
        textField_5.setText("Fail");
    }
DefaultTableModel model=(DefaultTableModel)table_1.getModel();
model.addRow(new String[] {
textField.getText(),
(String)comboBox.getSelectedItem(),
textField_6.getText(),
textField_7.getText(),
textField_8.getText(),
textField_9.getText(),
textField_10.getText(),
textField_11.getText(),
textField_12.getText(),
textField_13.getText(),
textField_3.getText(),
textField_4.getText(),
textField_5.getText(),

});

}
});
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
btnNewButton.setForeground(new Color(0, 128, 0));
btnNewButton.setBackground(new Color(255, 255, 255));
btnNewButton.setBounds(150, 446, 89, 23);
frame.getContentPane().add(btnNewButton);

JButton btnNewButton_1 = new JButton("Delete");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model=(DefaultTableModel)table_1.getModel();
        try
        {
            int rownum = table_1.getSelectedRow();
            model.removeRow(rownum);
        }
        catch(Exception msg)
        {
            JOptionPane.showMessageDialog(null,"Please choose the particular row");
        }


	}
});
btnNewButton_1.setForeground(new Color(255, 0, 0));
btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
btnNewButton_1.setBounds(249, 446, 82, 23);
frame.getContentPane().add(btnNewButton_1);

JButton btnNewButton_2 = new JButton("Show report");
btnNewButton_2.addActionListener(new ActionListener() {


public void actionPerformed(ActionEvent e) {
textArea_1.append("Student Record\n"
+"Student Name:\t\t"+textField_1.getText()+" "+textField_2.getText()
+"\n=========================================================="
+"\nMath:\t\t"+textField_6.getText()
+"\nEnglish:\t\t"+textField_7.getText()
+"\nBiology:\t\t"+textField_8.getText()
+"\nComputer:\t\t"+textField_9.getText()
+"\nChemistry:\t\t"+textField_10.getText()
+"\nPhysics:\t\t"+textField_11.getText()
+"\nThamil:\t\t"+textField_12.getText()
+"\nMalayalam:\t\t"+textField_13.getText()
+"\n======================================================="
+"\nTotal Score:\t\t"+textField_3.getText()
+"\nAverage:\t\t"+textField_4.getText()
+"\nRanking:\t\t"+textField_5.getText());

}
});
btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
btnNewButton_2.setForeground(new Color(0, 0, 139));
btnNewButton_2.setBounds(341, 446, 98, 23);
frame.getContentPane().add(btnNewButton_2);

JButton btnNewButton_3 = new JButton("Exit");
btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		frame=new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
		System.exit(0);
		
		}}
});
btnNewButton_3.setForeground(new Color(255, 0, 0));
btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
btnNewButton_3.setBounds(449, 446, 89, 23);
frame.getContentPane().add(btnNewButton_3);

JButton btnNewButton_4 = new JButton("Reset");
btnNewButton_4.addActionListener(new ActionListener() {
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
		textField_9.setText(null);
		textField_10.setText(null);
		textField_11.setText(null);
		textField_12.setText(null);
		textField_13.setText(null);
		comboBox.setSelectedIndex(0);



	}
});
btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
btnNewButton_4.setForeground(new Color(147, 112, 219));
btnNewButton_4.setBounds(548, 446, 89, 23);
frame.getContentPane().add(btnNewButton_4);


}
}


