import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextArea;

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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Font;

public class updatestudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5,textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public JTextArea textArea;
	public JComboBox comboBox_6;
	int flag=0;
	private JTextField textField_4;
	private JTextField textField_9;
	private JTextField textField_10;

	
	
 public void reset()
 {

		textField.setText(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_3.setText(null); 
		textField_5.setText(null);
		textField_7.setText(null);
		textField_8.setText(null);
		textField_6.setText(null);
		textField_4.setText(null);
		textField_6.setText(null);
		textField_9.setText(null);
		textField_10.setText(null);
		textArea.setText(null);
	 
 }
	/**
	 * Create the frame.
	 */
	public updatestudent() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA IMAGES\\people.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		setResizable(true);
		setBounds(100, 100, 684, 671);
		setSize(new Dimension(548, 712));
		setLocationRelativeTo(this);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentRegistration = new JLabel("SEARCH STUDENT");
		lblStudentRegistration.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentRegistration.setForeground(new Color(0, 0, 255));
		lblStudentRegistration.setBackground(new Color(72, 61, 139));
		
		JLabel lblEnrollNo = new JLabel("Enroll no:");
		lblEnrollNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblStudentName = new JLabel("Student Name:");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblRollNo = new JLabel("Roll No:");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblSem = new JLabel("Sem:");
		
		JLabel lblYearOfAdmission = new JLabel("Year Of Admission:");
		lblYearOfAdmission.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblMobileNo = new JLabel("Mobile No:");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblEmailId = new JLabel("Email ID:");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblPostalAdress = new JLabel("Postal Adress:");
		lblPostalAdress.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField_1 = new JTextField();
		
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		Integer dd[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		Integer mm[]={1,2,3,4,5,6,7,8,9,10,11,12};
		Integer yy[]={1997,1998,1999,2000,2001,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017};
		Integer yy1[]={1997,1998,1999,2000,2001,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017};
		
		JButton btnSave = new JButton("SEARCH");
		btnSave.setForeground(new Color(0, 0, 205));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String userid=textField.getText();
				String query="select * from studentregistration where enroll=?";
				int flag=0;
				try
				{
					PreparedStatement ps=DBInfo.con.prepareStatement(query);
					ps.setString(1, userid);
					ResultSet res=ps.executeQuery();
					while(res.next())
					{
						textField_1.setText(res.getString(2));
						textField_2.setText(res.getString(3));
						textField_3.setText(res.getString(4));
						textField_5.setText(res.getString(10));
						textField_7.setText(res.getString(9));
						textField_8.setText(res.getString(11));
						textField_9.setText(res.getString(8));
						textField_4.setText(res.getString(6));
						textField_10.setText(res.getString(7));
						
						textArea.setText(res.getString(12));
						
						flag=1;
						break;
						
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
            }});
			
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(0, 0, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				reset();
				
			}
		});
		
		JButton btnLoginNow = new JButton("UPDATE");
		btnLoginNow.setForeground(new Color(0, 0, 255));
		btnLoginNow.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(new Color(0, 0, 255));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String userid=textField.getText();
				String query="delete from studentregistration where enroll=?";
				try
				{
					PreparedStatement ps=DBInfo.con.prepareStatement(query);
					ps.setString(1, userid);
					ps.executeUpdate();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(updatestudent.this, "Record Deleted!!");
				reset();
				}
		});
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(49)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEnrollNo)
								.addComponent(lblMobileNo)
								.addComponent(lblStudentName)
								.addComponent(lblRollNo)
								.addComponent(lblDob)
								.addComponent(lblPostalAdress)
								.addComponent(lblYearOfAdmission)
								.addComponent(lblCourse)
								.addComponent(lblEmailId)
								.addComponent(lblBranch))
							.addGap(61)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_8, Alignment.LEADING)
									.addComponent(textField_5, Alignment.LEADING)
									.addComponent(textField_2, Alignment.LEADING)
									.addComponent(textField_1, Alignment.LEADING)
									.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
									.addComponent(textField_3, Alignment.LEADING)
									.addComponent(lblStudentRegistration, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField_7, Alignment.LEADING)
										.addComponent(textField_10, Alignment.LEADING))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblSem)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(120)
							.addComponent(btnSave)
							.addGap(18)
							.addComponent(btnReset)
							.addGap(18)
							.addComponent(btnDelete)
							.addGap(10)
							.addComponent(btnLoginNow)))
					.addGap(80))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStudentRegistration)
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnrollNo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRollNo)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDob)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMobileNo)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lblEmailId)
							.addGap(18)
							.addComponent(lblCourse)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSem)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBranch))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblYearOfAdmission)
							.addGap(47)
							.addComponent(lblPostalAdress))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnReset)
						.addComponent(btnDelete)
						.addComponent(btnLoginNow))
					.addContainerGap(141, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setBackground(Color.CYAN);
	}
}
