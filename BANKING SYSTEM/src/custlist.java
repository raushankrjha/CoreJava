import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;

public class custlist extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					custlist frame = new custlist();
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
	public custlist() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\java project\\JAVA IMAGES\\1495592108_letter_R_blue.png"));
		setTitle("cust_list");
		setResizable(false);
		setLocationRelativeTo(this);
		setBounds(100, 100, 835, 300);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnProfile = new JButton("PROFILE");
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				accountant obj=new accountant();
				obj.setVisible(true);
			}
		});
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				accountant obj=new accountant();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnNewButton);
		menuBar.add(btnProfile);
		
		JButton btnTransaction = new JButton("TRANSACTION");
		btnTransaction.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				transactionhistory obj=new transactionhistory();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnTransaction);
		
		JButton btnViewBalance = new JButton("VIEW BALANCE");
		btnViewBalance.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				viewbalance obj=new viewbalance();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnViewBalance);
		
		JButton btnCustlist = new JButton("CUST_LIST");
		btnCustlist.setForeground(new Color(0, 0, 205));
		btnCustlist.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCustlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				custlist obj=new custlist();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnCustlist);
		
		JButton btnWithdrow = new JButton("WITHDROW");
		btnWithdrow.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWithdrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				withdrow obj=new withdrow();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnWithdrow);
		
		JButton btnDeposite = new JButton("DEPOSITE");
		btnDeposite.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDeposite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				deposite obj=new deposite();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnDeposite);
		
		JButton btnTransfer = new JButton("TRANSFER");
		btnTransfer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			  transfer obj=new transfer();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnTransfer);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				login obj=new login();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnLogout);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 3), "CUSTOMER'S_LIST", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(65, 105, 225)));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 861, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 223, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
