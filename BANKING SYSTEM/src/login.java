import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldusername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\java project\\JAVA IMAGES\\1495592108_letter_R_blue.png"));
		setBackground(new Color(0, 139, 139));
		setTitle("login page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(this);
		setBounds(100, 100, 735, 471);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) 
			{
				accountant obj=new accountant();
				obj.setVisible(true);
			}
		});
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 3, true), "LOGIN_PAGE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		
		JLabel lblUsername = new JLabel("USERNAME     :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblPassword = new JLabel("PASSWORD     :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String username=textFieldusername.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				Connection con=DBInfo.con;
				int flag=0;
				
				String query="select * from login where username=? and password=?";
				try 
				{
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, username);
					ps.setString(2, password);
					ResultSet res=ps.executeQuery();
					while(res.next())
					{
						flag=1;
						break;
					}
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				if(flag==1)
				{
					login l=new login();
					l.setVisible(false);
					accountant a=new accountant();
					a.setVisible(true);
					
				}
				else
				{
					JOptionPane.showMessageDialog(login.this,"wrong Usernname OR password","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592114_checkmark-r.png"));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				textFieldusername.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592174_Synchronize.png"));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\rat8.png"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\MAIN.png"));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495591319_R.png"));
		
		passwordField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addComponent(label)
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPassword)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
									.addGap(55))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(103)
										.addComponent(btnReset)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btnLogin)
										.addGap(55))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblUsername)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textFieldusername, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
										.addGap(55)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(lblNewLabel)
							.addGap(140))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUsername)
								.addComponent(textFieldusername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)))
					.addGap(46))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReset))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
