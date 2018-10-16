import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class deposite extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2acno2;
	private JTextField textField_3csname;
	private JTextField textField_4amount;
	public JComboBox comboBox;
	private JTextField textField_5ACNO;
	private JTextField textField_5DATE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deposite frame = new deposite();
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
	public deposite() {
		setResizable(false);
		setLocationRelativeTo(this);
		setBounds(100, 100, 859, 514);
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
		
		JButton btnLogin = new JButton("HOME");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				accountant obj=new accountant();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnLogin);
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
		btnDeposite.setForeground(new Color(0, 0, 255));
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
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 3), "DEPOSITE_WINDOW", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(65, 105, 225)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterDesiredAccount = new JLabel("Enter Desired Account No:");
		lblEnterDesiredAccount.setBounds(365, 172, 127, 14);
		contentPane.add(lblEnterDesiredAccount);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(365, 203, 122, 14);
		contentPane.add(lblDate);
		
		JLabel lblAccountNo = new JLabel("Account No:");
		lblAccountNo.setBounds(365, 237, 122, 14);
		contentPane.add(lblAccountNo);
		
		JLabel lblCustomersName = new JLabel("Customer's Name:");
		lblCustomersName.setBounds(365, 271, 122, 14);
		contentPane.add(lblCustomersName);
		
		JLabel lblTransactionMode = new JLabel("Transaction Mode:");
		lblTransactionMode.setBounds(365, 316, 122, 14);
		contentPane.add(lblTransactionMode);
		
		JLabel lblDepositeMode = new JLabel("Deposite Amount:");
		lblDepositeMode.setBounds(365, 358, 122, 14);
		contentPane.add(lblDepositeMode);
		
		JButton btnRefreshFields = new JButton("Refresh Fields");
		btnRefreshFields.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592156_old-view-refresh.png"));
		btnRefreshFields.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRefreshFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField.setText(null);
				textField_2acno2.setText(null);
				textField_3csname.setText(null);
				textField_4amount.setText(null);
				comboBox.setSelectedItem(null);
				
			}
		});
		btnRefreshFields.setBounds(491, 414, 159, 35);
		contentPane.add(btnRefreshFields);
		
		JButton btnSaveTransaction = new JButton("Save Transaction");
		btnSaveTransaction.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592114_checkmark-r.png"));
		btnSaveTransaction.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSaveTransaction.setBounds(660, 414, 183, 35);
		contentPane.add(btnSaveTransaction);
		btnSaveTransaction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				JOptionPane.showMessageDialog(null, "deposite sucessfull", "Deposite Sucessfully",JOptionPane.INFORMATION_MESSAGE);
				textField.setText(null);
				textField_2acno2.setText(null);
				textField_3csname.setText(null);
				textField_4amount.setText(null);
				comboBox.setSelectedItem(null);
				
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(553, 169, 170, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		Date d=new Date();
		
		textField_1 = new JTextField(String.valueOf(d));
		textField_1.setBounds(553, 200, 170, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2acno2 = new JTextField();
		textField_2acno2.setEditable(false);
		textField_2acno2.setBounds(553, 234, 170, 20);
		contentPane.add(textField_2acno2);
		textField_2acno2.setColumns(10);
		
		textField_3csname = new JTextField();
		textField_3csname.setEditable(false);
		textField_3csname.setBounds(553, 265, 170, 20);
		contentPane.add(textField_3csname);
		textField_3csname.setColumns(10);
		
		textField_4amount = new JTextField();
		textField_4amount.setBounds(553, 355, 170, 20);
		contentPane.add(textField_4amount);
		textField_4amount.setColumns(10);
		String mode[]={"cash","check"};
		comboBox = new JComboBox(mode);
		comboBox.setBounds(553, 313, 170, 20);
		contentPane.add(comboBox);
		
		JLabel lblAccountNumber = new JLabel("ACCOUNT NUMBER :");
		lblAccountNumber.setBounds(435, 30, 148, 26);
		contentPane.add(lblAccountNumber);
		
		JLabel lblDate_1 = new JLabel("DATE :");
		lblDate_1.setBounds(435, 79, 46, 20);
		contentPane.add(lblDate_1);
		
		textField_5ACNO = new JTextField();
		textField_5ACNO.setBounds(540, 33, 170, 20);
		contentPane.add(textField_5ACNO);
		textField_5ACNO.setColumns(10);
		
		textField_5DATE = new JTextField();
		textField_5DATE.setBounds(540, 79, 170, 20);
		contentPane.add(textField_5DATE);
		textField_5DATE.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\search_book-512.png"));
		btnSearch.setBounds(716, 32, 127, 48);
		contentPane.add(btnSearch);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 147, 821, 26);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\rat8.png"));
		lblNewLabel.setBounds(39, 11, 306, 130);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\Untitled.png"));
		lblNewLabel_1.setBounds(67, 169, 324, 251);
		contentPane.add(lblNewLabel_1);
	}
}
