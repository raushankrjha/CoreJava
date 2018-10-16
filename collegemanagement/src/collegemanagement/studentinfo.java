package collegemanagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class studentinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentinfo frame = new studentinfo();
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
	public studentinfo() {
		setTitle("Student Registration");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(this);
		setResizable(true);
		setBounds(100, 100, 721, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		
		JLabel lblEnrollNo = new JLabel("enroll no:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblStudentName = new JLabel("Student name:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblRollNo = new JLabel("Roll no:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		
		JLabel lblGender = new JLabel("Gender:");
		
		JLabel lblBranch = new JLabel("Branch");
		
		JLabel lblSem = new JLabel("sem-");
		
		JLabel lblYearOfAdmission = new JLabel("year of admission:");
		
		JLabel lblMobileNo = new JLabel("mobile no:");
		
		JLabel lblEmailId = new JLabel("Email ID:");
		
		JLabel lblPostalAdress = new JLabel("Postal Adress:");
		
		JLabel lblCourse = new JLabel("COURSE:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		
		Integer dd[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		JComboBox comboBox = new JComboBox(dd);
		
		Integer mm[]={1,2,3,4,5,6,7,8,9,10,11,12};
		JComboBox comboBox_1 = new JComboBox(mm);
		Integer yy[]={1997,1998,1999,2000,2001,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017};
		JComboBox comboBox_2 = new JComboBox(yy);
		String gen[]={"select","male","female"};
		JComboBox comboBox_3 = new JComboBox(gen);
		String cr[]={"Btech---","MBA---","BBA---"};
		JComboBox comboBox_4 = new JComboBox(cr);
		String br[]={"c.s","ME","EE","ECE","AE","IT"};
		JComboBox comboBox_5 = new JComboBox(br);
		Integer sm[]={1,2,3,4,5,6,7,8};
		JComboBox comboBox_6 = new JComboBox(sm);
		Integer yy1[]={1997,1998,1999,2000,2001,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017};
		JComboBox comboBox_7 = new JComboBox(yy1);
		
		JButton btnReset_1 = new JButton("RESET");
		btnReset_1.addActionListener(new ActionListener() {
			public JLabel textField_5;

			public void actionPerformed(ActionEvent arg0)
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
			    JLabel textField_6 = null;
			    textField_6.setText(null);
			    textArea.setText(null);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				comboBox_5.setSelectedIndex(0);
				comboBox_6.setSelectedIndex(0);
				comboBox_7.setSelectedIndex(0);
			}
		});
		
		JButton btnLoginNow_1 = new JButton("LOGIN NOW");
		btnLoginNow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblPassword = new JLabel("password:");
		
		JLabel lblConfirmPassword = new JLabel("confirm password:");
		
		 JTextField  textField_5 = new JTextField();
		  JTextField textField_6 = new JTextField();
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
            {
				String enroll=textField.getText();
				String name=textField_1.getText();
				String roll=textField_2.getText();
				String mobile=textField_3.getText();
				String emailid=textField_4.getText();
				String password=textField_5.getText();
				String cpassword=textField_6.getText();
				int d1=(int) comboBox.getSelectedItem();
				int m1=(int) comboBox_1.getSelectedItem();
				int y1=(int) comboBox_2.getSelectedItem();
				String dob=d1+"/"+m1+"/"+y1;
				String gender=(String)comboBox_3.getSelectedItem();
				String course=(String)comboBox_4.getSelectedItem();
				String branch =(String)comboBox_5.getSelectedItem();
				
				Connection con=DBInfo.con;
				String query="Insert into studentregistration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				int i=0;
				try
				{
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, enroll);
					ps.setString(2, name);
					ps.setString(3, roll);
					ps.setString(4, dob);
					ps.setString(5, gender);
					ps.setString(6, course);
					ps.setString(7, branch);
					ps.setString(10, mobile);
					ps.setString(11, emailid);
					ps.setString(12, password);
					ps.setString(13, cpassword);
					i=ps.executeUpdate();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				if(i==1)
				{
					JOptionPane.showMessageDialog(studentinfo.this,"Record Inserted");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
					comboBox.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
					comboBox_2.setSelectedIndex(0);
					comboBox_3.setSelectedIndex(0);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
					comboBox_6.setSelectedIndex(0);
					comboBox_7.setSelectedIndex(0);
					
					
				}
				if(i==0)
				{
					JOptionPane.showMessageDialog(studentinfo.this,"Registration Failed!!");
				}
            }});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(336)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(178)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblConfirmPassword)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblEnrollNo)
												.addComponent(lblStudentName)
												.addComponent(lblDob, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
												.addComponent(lblGender)
												.addComponent(lblMobileNo)
												.addComponent(lblPostalAdress, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
												.addComponent(lblRollNo, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
												.addComponent(lblCourse)
												.addComponent(lblBranch, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEmailId)
												.addComponent(lblYearOfAdmission, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblPassword)
											.addGap(42)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblSem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(194))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(24)
											.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 258, Short.MAX_VALUE))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
												.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
												.addComponent(textField, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
											.addGap(250))
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(btnSave)
													.addGap(18)
													.addComponent(btnReset_1))
												.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnLoginNow_1)))))))
					.addGap(91))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel)
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnrollNo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStudentName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRollNo)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDob)
							.addGap(18)
							.addComponent(lblGender))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCourse)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBranch)
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSem, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYearOfAdmission)
						.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMobileNo)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmailId)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(lblPostalAdress, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(lblPassword)
							.addGap(28))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConfirmPassword)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnReset_1)
						.addComponent(btnLoginNow_1)
						.addComponent(btnSave)))
		);
		         contentPane.setLayout(gl_contentPane);
				contentPane.setBackground(Color.gray);
	}
}
