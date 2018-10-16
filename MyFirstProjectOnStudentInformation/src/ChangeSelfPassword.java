import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ChangeSelfPassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ChangeSelfPassword() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 234);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEnterNewPassword = new JLabel("Enter New Password");
		lblEnterNewPassword.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel lblReenterPassword = new JLabel("Re-Enter Password");
		lblReenterPassword.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		passwordField = new JPasswordField();
		
		passwordField_1 = new JPasswordField();
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pass=String.copyValueOf(passwordField.getPassword());
				String repass=String.copyValueOf(passwordField_1.getPassword());
				if(pass.equals(repass))
						{
							String query="update login set password=? where username=?";
							int flag=0;
							try
							{
								PreparedStatement ps=DBInfo.con.prepareStatement(query);
								ps.setString(1, pass);
								ps.setString(2, repass);
								flag=ps.executeUpdate();
							}
							catch(Exception e1)
							{
								e1.printStackTrace();
							}
							
							if(flag==0)
							{
								JOptionPane.showMessageDialog(getParent(), "Not Updated", "ERROR!!", JOptionPane.ERROR_MESSAGE);
							}
							if(flag!=0)
							{
								JOptionPane.showMessageDialog(getParent(), "Updated Successfully","SUCCESS", JOptionPane.INFORMATION_MESSAGE);
								dispose();
							}
						}
				else
				{
					JOptionPane.showMessageDialog(getParent(), "Password doesn't match", "ERROR!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setIcon(new ImageIcon("H:\\Pics\\lock-open-blue.png"));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblReenterPassword)
								.addComponent(lblEnterNewPassword))
							.addGap(56)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField_1)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(177)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(btnSave))))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterNewPassword))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblReenterPassword)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
