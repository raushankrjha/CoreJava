import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

public class viewbalance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3ACNO;
	private JTextField textField_4DATE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewbalance frame = new viewbalance();
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
	public viewbalance() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\java project\\JAVA IMAGES\\1495592108_letter_R_blue.png"));
		setTitle("VIEW BALANCE");
		setFont(new Font("Dialog", Font.BOLD, 10));
		setResizable(false);
		setLocationRelativeTo(this);
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
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			
			{
				accountant obj=new accountant();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnHome);
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
		btnViewBalance.setForeground(new Color(0, 0, 255));
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
		setBounds(100, 100, 837, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 3), "VIEW_BALANCE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(65, 105, 225)));
		setContentPane(contentPane);
		
		
		JLabel lblAcNo = new JLabel("ACCOUNT NO    :");
		
		JLabel lblCustomerName = new JLabel("CUSTOMER NAME  :");
		
		JLabel lblCurrent = new JLabel("");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnBack = new JButton("REFRESH FIELDS>>");
		btnBack.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592156_old-view-refresh.png"));
		
		JLabel lblCurrentBalance = new JLabel("CURRENT BALANCE:");
		
		JLabel lblAccountNumber = new JLabel("ACCOUNT NUMBER :");
		
		JLabel lblDate = new JLabel("DATE :");
		
		textField_3ACNO = new JTextField();
		textField_3ACNO.setColumns(10);
		
		textField_4DATE = new JTextField();
		textField_4DATE.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\search_book-512.png"));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\rat8.png"));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\Untitled.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGap(22)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblAcNo, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCustomerName))
											.addGap(39))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblCurrentBalance, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_1, Alignment.TRAILING)
										.addComponent(textField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
										.addComponent(textField_2, Alignment.TRAILING))
									.addGap(154))
								.addComponent(lblCurrent, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAccountNumber)
										.addComponent(lblDate))
									.addGap(27)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_4DATE)
										.addComponent(textField_3ACNO, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
									.addGap(18)
									.addComponent(btnSearch))
								.addComponent(separator, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 799, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(629)
							.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(22)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_3ACNO, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblAccountNumber))
								.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblDate)
									.addComponent(textField_4DATE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(54))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(btnSearch)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAcNo, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCustomerName))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCurrentBalance))
							.addGap(18)
							.addComponent(btnBack))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addComponent(lblCurrent, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
