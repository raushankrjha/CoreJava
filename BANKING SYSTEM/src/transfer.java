import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class transfer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7AC;
	private JTextField textField_7DATE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					transfer frame = new transfer();
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
	public transfer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\java project\\JAVA IMAGES\\1495592108_letter_R_blue.png"));
		setTitle("withdraw");
		setResizable(false);
		setLocationRelativeTo(this);
		setBounds(100, 100, 842, 585);
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
		btnTransfer.setForeground(new Color(0, 0, 255));
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
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 3), "TRANSFER_WINDOW", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(65, 105, 225)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterDesiredAccount = new JLabel("Enter Desired Account No:");
		lblEnterDesiredAccount.setBounds(346, 162, 127, 14);
		contentPane.add(lblEnterDesiredAccount);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(346, 203, 127, 14);
		contentPane.add(lblDate);
		
		JLabel lblAccountNo = new JLabel("Account No:");
		lblAccountNo.setBounds(346, 243, 127, 14);
		contentPane.add(lblAccountNo);
		
		JLabel lblCustomersName = new JLabel("Customer's Name:");
		lblCustomersName.setBounds(346, 290, 127, 14);
		contentPane.add(lblCustomersName);
		
		JLabel lblTransactionMode = new JLabel("Balance:");
		lblTransactionMode.setBounds(346, 337, 127, 14);
		contentPane.add(lblTransactionMode);
		
		JLabel lblDepositeMode = new JLabel("Destination Account Number?:");
		lblDepositeMode.setBounds(346, 381, 148, 14);
		contentPane.add(lblDepositeMode);
		
		JButton btnRefreshFields = new JButton("Refresh Fields");
		btnRefreshFields.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592156_old-view-refresh.png"));
		btnRefreshFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7AC.setText(null);
				
				
			}
		});
		btnRefreshFields.setBounds(520, 473, 148, 47);
		contentPane.add(btnRefreshFields);
		
		JButton btnSaveTransaction = new JButton("Transfer Balance");
		btnSaveTransaction.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592114_checkmark-r.png"));
		btnSaveTransaction.setBounds(671, 473, 157, 47);
		contentPane.add(btnSaveTransaction);
		
		JButton btnNewButton = new JButton("Generate Details");
		btnNewButton.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592154_Synchronize.png"));
		btnNewButton.setBounds(700, 162, 128, 51);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(520, 159, 170, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(520, 200, 170, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(520, 240, 170, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(520, 287, 170, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(520, 334, 170, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(520, 378, 170, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTransferAmount = new JLabel("Transfer Amount:");
		lblTransferAmount.setBounds(346, 421, 127, 14);
		contentPane.add(lblTransferAmount);
		
		textField_6 = new JTextField();
		textField_6.setBounds(520, 418, 170, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCheckDetails = new JButton("Check Details");
		btnCheckDetails.setBounds(706, 333, 110, 23);
		contentPane.add(btnCheckDetails);
		
		JLabel lblAccountNumber = new JLabel("ACCOUNT NUMBER :");
		lblAccountNumber.setBounds(387, 41, 110, 14);
		contentPane.add(lblAccountNumber);
		
		JLabel lblDate_1 = new JLabel("DATE :");
		lblDate_1.setBounds(387, 77, 123, 36);
		contentPane.add(lblDate_1);
		
		textField_7AC = new JTextField();
		textField_7AC.setBounds(542, 38, 140, 20);
		contentPane.add(textField_7AC);
		textField_7AC.setColumns(10);
		
		textField_7DATE = new JTextField();
		textField_7DATE.setText("");
		textField_7DATE.setBounds(542, 85, 142, 20);
		contentPane.add(textField_7DATE);
		textField_7DATE.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\search_book-512.png"));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSearch.setBounds(695, 37, 133, 47);
		contentPane.add(btnSearch);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\rat8.png"));
		lblNewLabel.setBounds(40, 12, 271, 134);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 144, 1, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 144, 842, -17);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 151, 855, 14);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\Untitled.png"));
		lblNewLabel_1.setBounds(50, 162, 335, 277);
		contentPane.add(lblNewLabel_1);
		String mode[]={"cash","check"};
	}

}
