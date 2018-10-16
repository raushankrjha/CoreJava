import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.print.DocFlavor.STRING;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage frame = new Loginpage();
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
	public Loginpage()
	{
		setTitle("LOGIN PAGE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA IMAGES\\home.png"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(false);
		setBounds(100, 100, 450, 320);
		setLocationRelativeTo(this);
		setSize(new Dimension(560, 461));
		setSize(new Dimension(560, 397));
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		contentPane.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		contentPane.setForeground(new Color(0, 0, 205));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLoginPage = new JLabel("");
		lblLoginPage.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblLoginPage.setForeground(new Color(30, 144, 255));
		lblLoginPage.setBackground(new Color(0, 0, 255));
		lblLoginPage.setIcon(new ImageIcon("H:\\Pics\\home.jpg"));
		
		JLabel lblUserIdenrollNofaculity = new JLabel("User ID(enroll no/faculity id):");
		lblUserIdenrollNofaculity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserIdenrollNofaculity.setForeground(new Color(0, 0, 205));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setForeground(new Color(0, 0, 255));
		
		JLabel lblUsertype = new JLabel("UserType:");
		lblUsertype.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsertype.setForeground(new Color(0, 0, 205));
		String ut[]={"select","Admin","Student"};
		JComboBox comboBox = new JComboBox(ut);
		comboBox.setForeground(new Color(0, 0, 205));
		comboBox.setBackground(new Color(192, 192, 192));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setIcon(new ImageIcon("H:\\JAVA IMAGES\\now.png"));
		btnLogin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBackground(new Color(192, 192, 192));
		btnLogin.setForeground(new Color(0, 0, 205));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String enroll=textField.getText();
				String userid=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				String type=(String)comboBox.getSelectedItem();
				
				
				Connection con=DBInfo.con;
				int flag=0;
				
				
				if(type.equalsIgnoreCase("admin"))
				{
					String query="select * from facultyregistration where userid=? and password=?";
					try
					{
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, userid);
						ps.setString(2, password);
						ResultSet res=ps.executeQuery();
						while(res.next())
						{
							flag=1;
							break;
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					if(flag==1)
					{
						Admin a=new Admin("Admin page",userid);
						a.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(Loginpage.this, "wrong username or password","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
				if(type.equalsIgnoreCase("student"))
				{
					String query="select * from studentregistration where enroll=? and password=?";
					try
					{
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1,enroll);
						ps.setString(2, password);
						ResultSet res=ps.executeQuery();
						while(res.next())
						{
							flag=1;
							break;
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					if(flag==1)
					{
					Student s=new Student("Student page",enroll);
						s.setVisible(true);dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(Loginpage.this, "wrong username or password","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		
		JButton btnReset = new JButton("RESET");
		btnReset.setIcon(new ImageIcon("H:\\JAVA IMAGES\\now.png"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(new Color(119, 136, 153));
		btnReset.setForeground(new Color(0, 0, 205));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				textField.setText(null);
				passwordField.setText(null);
				comboBox.setSelectedIndex(0);
			}
		});
		
		JLabel lblDesigndevlopedByEr = new JLabel("Design&devloped by Er Rjha&Ashutosh");
		lblDesigndevlopedByEr.setForeground(Color.BLACK);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(170, Short.MAX_VALUE)
					.addComponent(lblDesigndevlopedByEr, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUserIdenrollNofaculity)
						.addComponent(lblPassword)
						.addComponent(lblUsertype))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnLogin)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnReset)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, 0, 100, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
							.addContainerGap(183, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(273, Short.MAX_VALUE)
					.addComponent(lblLoginPage, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(212))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLoginPage, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsertype)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserIdenrollNofaculity)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnReset))
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addComponent(lblDesigndevlopedByEr))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
