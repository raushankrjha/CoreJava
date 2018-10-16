import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.xml.bind.helpers.ParseConversionEventImpl;

import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class StudentRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4,textfield9;
	private JPasswordField passwordField;
	public JFileChooser chooser;
	private JTextField textField_5;

	
	
	public StudentRegistration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA IMAGES\\images1.jpg"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setResizable(false);
		setBounds(100, 100, 684, 671);
		setSize(new Dimension(952, 714));
		setLocationRelativeTo(this);
		
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		
		JLabel lblEnrollNo = new JLabel("Enroll no:");
		lblEnrollNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnrollNo.setForeground(new Color(0, 0, 0));
		
		JLabel lblStudentName = new JLabel("Student Name:");
		lblStudentName.setForeground(new Color(0, 0, 0));
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblRollNo = new JLabel("Roll No:");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRollNo.setForeground(new Color(0, 0, 0));
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setForeground(new Color(0, 0, 0));
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGender.setForeground(new Color(0, 0, 0));
		
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCourse.setForeground(new Color(0, 0, 0));
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBranch.setForeground(new Color(0, 0, 0));
		
		JLabel lblSem = new JLabel("Sem:");
		lblSem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSem.setForeground(new Color(0, 0, 0));
		
		JLabel lblYearOfAdmission = new JLabel("Year Of Admission:");
		lblYearOfAdmission.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblYearOfAdmission.setForeground(new Color(0, 0, 0));
		
		JLabel lblMobileNo = new JLabel("Mobile No:");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMobileNo.setForeground(new Color(0, 0, 0));
		
		JLabel lblEmailId = new JLabel("Email ID:");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmailId.setForeground(new Color(0, 0, 0));
		
		JLabel lblPostalAdress = new JLabel("Postal Adress:");
		lblPostalAdress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPostalAdress.setForeground(new Color(0, 0, 0));
		
		JLabel lblChoosePassword = new JLabel("Choose Password:");
		lblChoosePassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChoosePassword.setForeground(new Color(0, 0, 0));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.textHighlightText);
		
		passwordField = new JPasswordField();
		String dd[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		JComboBox comboBox = new JComboBox(dd);
		String mm[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox comboBox_1 = new JComboBox(mm);
		
		String yy[]={"1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
		JComboBox comboBox_2 = new JComboBox(yy);
		String gen[]={"select","male","female"};
		JComboBox comboBox_3 = new JComboBox(gen);
		
		JComboBox comboBox_4 = new JComboBox(GetValues.getCourse());
		comboBox_4.insertItemAt("select",0);
		
		comboBox_4.setSelectedIndex(0);
		
		JComboBox comboBox_5 = new JComboBox(GetValues.getBranch());
		comboBox_5.insertItemAt("select",0);
		comboBox_5.setSelectedIndex(0);
		String sm[]={"1","2","3","4","5","6","7","8"};
		JComboBox comboBox_6 = new JComboBox(sm);
		String yy1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
		JComboBox comboBox_7 = new JComboBox(yy1);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setForeground(new Color(148, 0, 211));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String enroll=textField.getText();
				String name=textField_1.getText();
				String roll=textField_2.getText();
				String d1=(String) comboBox.getSelectedItem();
				String m1=(String) comboBox_1.getSelectedItem();
				String y1=(String) comboBox_2.getSelectedItem();
				String dob=d1+"/"+m1+"/"+y1;
				String gender=(String)comboBox_3.getSelectedItem();
				String course=(String)comboBox_4.getSelectedItem();
				String branch =(String)comboBox_5.getSelectedItem();
				String sem=(String) comboBox_6.getSelectedItem();
				String yoa=(String)comboBox_7.getSelectedItem();
				String mobile=textField_3.getText();
				String emailid=textField_4.getText();
				String address=textArea.getText();
				char p[]=passwordField.getPassword();
				String pass=p.toString();
				
				
				
				String query="insert into studentregistration values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
				Connection con=DBInfo.con;
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
					ps.setString(8, sem);
					ps.setString(9, yoa);
					ps.setString(10, mobile);
					ps.setString(11, emailid);
					ps.setString(12, emailid);
					ps.setString(13, pass);
					i=ps.executeUpdate();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				if(i==1)
				{
					JOptionPane.showMessageDialog(StudentRegistration.this,"Record Inserted");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
					passwordField.setText(null);
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
					JOptionPane.showMessageDialog(StudentRegistration.this,"Registration Failed!!");
				}
            }});
			
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(138, 43, 226));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				passwordField.setText(null);
				textArea.setText(null);
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
		
		JLabel lblNewLabel = new JLabel("New Student Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(new Color(75, 0, 130));
		
		JLabel lblNewLabel_1 = new JLabel("Student Information\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		
		JLabel lblAcedmi = new JLabel("Accedamic Details");
		lblAcedmi.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAcedmi.setForeground(new Color(0, 0, 205));
		
		JButton btnChoosePhoto = new JButton("Choose Photo");
		JFileChooser chooser=new JFileChooser();
		
		btnChoosePhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int result=chooser.showOpenDialog(null);
				File fileobj=chooser.getSelectedFile();
				if(result==JFileChooser.APPROVE_OPTION){
					textField_5.setText("You choose"+fileobj.getPath());
					
				}
				else if(result==JFileChooser.CANCEL_OPTION)
				{
					textField_5.setText("You clicked cancel");
				}
				
				
			}
		});
		btnChoosePhoto.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnChoosePhoto.setForeground(new Color(0, 0, 0));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(56, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(24)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblEnrollNo)
													.addComponent(lblStudentName)
													.addComponent(lblEmailId)
													.addComponent(lblPostalAdress))
												.addGap(10)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
															.addComponent(textField_4, 155, 155, Short.MAX_VALUE)
															.addComponent(textField_1, 155, 155, Short.MAX_VALUE)
															.addGroup(gl_contentPane.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textArea)))
														.addGap(6))
													.addComponent(textField, 155, 155, 155))
												.addGap(18)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(lblDob)
																.addGap(18)
																.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
															.addComponent(lblYearOfAdmission))
														.addGap(6)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(18)
																.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																	.addComponent(lblMobileNo)
																	.addComponent(lblRollNo)
																	.addComponent(btnChoosePhoto)))
															.addGroup(gl_contentPane.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
													.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblGender)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
													.addComponent(textField_2, 155, 155, 155)
													.addComponent(textField_3, 155, 155, 155)))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btnSave)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnReset)
												.addPreferredGap(ComponentPlacement.RELATED)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(236)
											.addComponent(lblBranch)
											.addGap(29)
											.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(33)
											.addComponent(lblSem)
											.addGap(18)
											.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblChoosePassword)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(38)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblCourse)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lblAcedmi))))
							.addGap(138))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(335))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnrollNo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYearOfAdmission)
						.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRollNo)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDob)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMobileNo)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmailId)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGender)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnChoosePhoto)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(lblPostalAdress))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addGap(48)
					.addComponent(lblAcedmi)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCourse)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBranch)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSem)
						.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChoosePassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(155)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnReset))
					.addGap(103))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setBackground(SystemColor.activeCaption);
	}
}
