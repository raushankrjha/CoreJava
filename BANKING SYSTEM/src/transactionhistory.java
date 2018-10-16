import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class transactionhistory extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAC;
	private JTextField textFieldDATE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					transactionhistory frame = new transactionhistory();
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
	public transactionhistory() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\java project\\JAVA IMAGES\\1495592108_letter_R_blue.png"));
		setTitle("TRANSACTION_HISTORY");
		setResizable(false);
		setLocationRelativeTo(this);
		setBounds(100, 100, 837, 400);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnProfile = new JButton("PROFILE");
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				accountant obj1=new accountant();
				obj1.setVisible(true);
			}
		});
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				accountant obj2=new accountant();
				obj2.setVisible(true);
			}
		});
		menuBar.add(btnHome);
		menuBar.add(btnProfile);
		
		JButton btnTransaction = new JButton("TRANSACTION");
		btnTransaction.setForeground(new Color(0, 0, 255));
		btnTransaction.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				transactionhistory obj3=new transactionhistory();
				obj3.setVisible(true);
			}
		});
		menuBar.add(btnTransaction);
		
		JButton btnViewBalance = new JButton("VIEW BALANCE");
		btnViewBalance.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				viewbalance obj4=new viewbalance();
				obj4.setVisible(true);
			}
		});
		menuBar.add(btnViewBalance);
		
		JButton btnCustlist = new JButton("CUST_LIST");
		btnCustlist.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCustlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				custlist obj5=new custlist();
				obj5.setVisible(true);
			}
		});
		menuBar.add(btnCustlist);
		
		JButton btnWithdrow = new JButton("WITHDROW");
		btnWithdrow.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWithdrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				withdrow obj6=new withdrow();
				obj6.setVisible(true);
			}
		});
		menuBar.add(btnWithdrow);
		
		JButton btnDeposite = new JButton("DEPOSITE");
		btnDeposite.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDeposite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				deposite obj7=new deposite();
				obj7.setVisible(true);
			}
		});
		menuBar.add(btnDeposite);
		
		JButton btnTransfer = new JButton("TRANSFER");
		btnTransfer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			  transfer obj8=new transfer();
				obj8.setVisible(true);
			}
		});
		menuBar.add(btnTransfer);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
				login obj9=new login();
				obj9.setVisible(true);
				
			}
		});
		menuBar.add(btnLogout);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 3), "TRANSACTION_HISTORY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(65, 105, 225)));
		setContentPane(contentPane);
		
		JLabel lblAccountNumber = new JLabel("ACCOUNT NUMBER :");
		
		JLabel lblDate = new JLabel("DATE :");
		
		textFieldAC = new JTextField();
		textFieldAC.setColumns(10);
		
		textFieldDATE = new JTextField();
		textFieldDATE.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\search_book-512.png"));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\rat8.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAccountNumber)
								.addComponent(lblDate))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(4)
									.addComponent(textFieldAC, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addComponent(textFieldDATE, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addGap(63))
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(21)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblAccountNumber)
									.addComponent(textFieldAC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblDate)
									.addComponent(textFieldDATE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(41)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(177, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
