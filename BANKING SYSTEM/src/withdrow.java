import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class withdrow extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textfield_4;
	JComboBox comboBox;
	private JTextField textField_4acno;
	private JTextField textField_4date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					withdrow frame = new withdrow();
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
	public withdrow() {
		setTitle("WITHDROW");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\java project\\JAVA IMAGES\\1495592108_letter_R_blue.png"));
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
		setBounds(100, 100, 842, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 3), "WITHDRAW_WINDOW", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccountNo = new JLabel("Account No:");
		lblAccountNo.setBounds(342, 213, 137, 22);
		contentPane.add(lblAccountNo);
		
		JLabel lblCustomersName = new JLabel("Customer's Name:");
		lblCustomersName.setBounds(342, 260, 137, 30);
		contentPane.add(lblCustomersName);
		
		JLabel lblTransactionMode = new JLabel("Transaction Mode:");
		lblTransactionMode.setBounds(342, 301, 137, 24);
		contentPane.add(lblTransactionMode);
		
		JLabel lblDepositeMode = new JLabel("Withdrow Amount:");
		lblDepositeMode.setBounds(342, 336, 163, 20);
		contentPane.add(lblDepositeMode);
		
		JButton btnRefreshFields = new JButton("Refresh Fields");
		btnRefreshFields.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592156_old-view-refresh.png"));
		btnRefreshFields.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRefreshFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField_2.setText(null);
				textField_3.setText(null);
				textfield_4.setText(null);
				comboBox.setSelectedItem(null);
				
			}
		});
		btnRefreshFields.setBounds(512, 382, 136, 35);
		contentPane.add(btnRefreshFields);
		
		JButton btnSaveTransaction = new JButton("Save Transaction");
		btnSaveTransaction.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592114_checkmark-r.png"));
		btnSaveTransaction.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSaveTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			JOptionPane.showMessageDialog(null,"withdraw sucessfull","withdraw sucessfull", JOptionPane.INFORMATION_MESSAGE);
			textField_2.setText(null);
			textField_3.setText(null);
			textfield_4.setText(null);
			comboBox.setSelectedItem(null);
			
			}
		});
		btnSaveTransaction.setBounds(658, 382, 154, 35);
		contentPane.add(btnSaveTransaction);
		btnRefreshFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
			}
		});
		Date d=new Date();
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(499, 214, 170, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(499, 265, 170, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textfield_4 = new JTextField();
		textfield_4.setBounds(499, 336, 170, 20);
		contentPane.add(textfield_4);
		textfield_4.setColumns(10);
		String mode[]={"cash","check"};
		 comboBox = new JComboBox(mode);
		comboBox.setBounds(499, 303, 170, 20);
		contentPane.add(comboBox);
		
		JLabel lblAccountNumber = new JLabel("ACCOUNT NUMBER :");
		lblAccountNumber.setBounds(410, 31, 130, 17);
		contentPane.add(lblAccountNumber);
		
		JLabel lblDate_1 = new JLabel("DATE :");
		lblDate_1.setBounds(410, 74, 46, 31);
		contentPane.add(lblDate_1);
		
		textField_4acno = new JTextField();
		textField_4acno.setBounds(526, 29, 166, 20);
		contentPane.add(textField_4acno);
		textField_4acno.setColumns(10);
		
		textField_4date = new JTextField();
		textField_4date.setText("");
		textField_4date.setBounds(526, 79, 173, 20);
		contentPane.add(textField_4date);
		textField_4date.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSearch.setBounds(713, 27, 89, 35);
		contentPane.add(btnSearch);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 152, 806, 11);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\rat8.png"));
		lblNewLabel.setBounds(66, 11, 334, 141);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\Untitled.png"));
		label.setBounds(42, 200, 239, 224);
		contentPane.add(label);
	}
}
