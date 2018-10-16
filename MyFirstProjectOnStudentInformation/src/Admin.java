import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;

public class Admin extends JFrame {

	private JPanel contentPane;
	static String id;
    
	
	public Admin(String title,String userid) 
	{
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA IMAGES\\admin.png"));
		id=userid;
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 750, 485);
		setSize(new Dimension(1366, 738));
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(UIManager.getBorder("Button.border"));
		setContentPane(contentPane);
		
		JButton btnRegisterANew = new JButton("NEW STUDENT REGISTRATION");
		btnRegisterANew.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnRegisterANew.setIcon(new ImageIcon("H:\\Pics\\126.png"));
		btnRegisterANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				StudentRegistration obj=new StudentRegistration();
				obj.setVisible(true);
			}
		});
		contentPane.setLayout(new GridLayout(3, 3, 3, 3));
		contentPane.add(btnRegisterANew);
		
		JButton btnViewupdatedeleteAStudent = new JButton("View/Update/Delete a Student");
		btnViewupdatedeleteAStudent.setIcon(new ImageIcon("H:\\Pics\\search_book-512.png"));
		btnViewupdatedeleteAStudent.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnViewupdatedeleteAStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				updatestudent obj=new updatestudent();
				obj.setVisible(true);
			}
		});
		contentPane.add(btnViewupdatedeleteAStudent);
		
		JButton btnUploadANew = new JButton("Upload a new notice");
		btnUploadANew.setIcon(new ImageIcon("H:\\Pics\\update-512.png"));
		btnUploadANew.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnUploadANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AddNotice notice=new AddNotice();
				notice.setVisible(true);
			}
		});
		contentPane.add(btnUploadANew);
		
		JButton btnViewupdatedeleteANotice = new JButton("View/Update/Delete a notice");
		btnViewupdatedeleteANotice.setIcon(new ImageIcon("H:\\Pics\\Book-Update-4.jpg"));
		btnViewupdatedeleteANotice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnViewupdatedeleteANotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				deletenotice obj=new deletenotice();
				obj.setVisible(true);
			}
		});
		contentPane.add(btnViewupdatedeleteANotice);
		
		JButton btnSearchAnyStudents = new JButton("Search Any Students");
		btnSearchAnyStudents.setIcon(new ImageIcon("H:\\Pics\\51601-book-search-interface-symbol.png"));
		btnSearchAnyStudents.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnSearchAnyStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ViewStudent obj=new ViewStudent();
				obj.setVisible(true);
				
			}
		});
		contentPane.add(btnSearchAnyStudents);
		
		JButton btnSearchAnyNotice = new JButton("Search Any Notice");
		btnSearchAnyNotice.setIcon(new ImageIcon("H:\\Pics\\search_book-512.png"));
		btnSearchAnyNotice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnSearchAnyNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				viewnotice obj=new viewnotice();
				obj.setVisible(true);
			}
		});
		contentPane.add(btnSearchAnyNotice);
		
		JButton btnChangeSelfPassword = new JButton("Change Self Password");
		btnChangeSelfPassword.setIcon(new ImageIcon("H:\\Pics\\lock_password_protection_secure_key-256.png"));
		btnChangeSelfPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnChangeSelfPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{ 
				new ChangeSelfPassword().setVisible(true);
				
			}
		});
		contentPane.add(btnChangeSelfPassword);
		
		JButton btnNewButton = new JButton("LOG OUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
				Loginpage obj=new Loginpage();
				
				obj.setVisible(true);
				
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setForeground(Color.BLACK);
		contentPane.add(btnNewButton);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
	}
}
