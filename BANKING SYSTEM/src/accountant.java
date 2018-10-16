import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JComboBox;

public class accountant extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldacno;
	private JTextField textField_1date;
	private JTextField textField_2name;
	private JTextField textField_3no;
	private JTextField textField_6nation;
	private JTextField textField_7mbl;
	private JTextField textField_9email;
	private JTextField textField_10sign;
	JTextArea textArea ;
	JComboBox comboBoxtype,comboBox_2year,comboBox_1month,comboBoxdate,comboBoxgender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accountant frame = new accountant();
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
	public accountant() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\java project\\JAVA IMAGES\\1495592108_letter_R_blue.png"));
		setTitle("Accountant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 567);
		setLocationRelativeTo(this);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnProfile = new JButton("PROFILE");
		btnProfile.setForeground(new Color(0, 0, 255));
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				accountant obj=new accountant();
				obj.setVisible(true);
			}
		});
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
		menuBar.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				login obj=new login();
				obj.setVisible(true);
			}
		});
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 0), 3), "PROFILE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(65, 105, 225)));
		setContentPane(contentPane);
		
		JLabel lblAcNo = new JLabel("ACCOUNT NUMBER   :");
		
		JLabel lblDate = new JLabel("DATE        :");
		
		textFieldacno = new JTextField();
		textFieldacno.setColumns(10);
		Date d=new Date();
		textField_1date = new JTextField(String.valueOf(d));
		textField_1date.setColumns(10);
		
		
		
		JSeparator separator = new JSeparator();
		
		JLabel lblName = new JLabel("NAME                :");
		
		JLabel lblDob = new JLabel("DOB                  :");
		
		JLabel lblNationalities = new JLabel("NATIONALITIES:");
		
		JLabel lblGender = new JLabel("GENDER           :");
		
		JLabel lblAdress = new JLabel("ADRESS           :");
		
		JLabel lblAcNo_1 = new JLabel("   A/C NO:");
		
		JLabel lblAcType = new JLabel("   A/C TYPE:");
		
		JLabel lblMobileNo = new JLabel("   MOBILE NO:");
		
		JLabel lblEmailId = new JLabel("   EMAIL ID:");
		
		JLabel lblSign = new JLabel("   SIGN:");
		
		textField_2name = new JTextField();
		textField_2name.setEditable(false);
		textField_2name.setColumns(10);
		
		textField_3no = new JTextField();
		textField_3no.setEditable(false);
		textField_3no.setColumns(10);
		
		textField_6nation = new JTextField();
		textField_6nation.setEditable(false);
		textField_6nation.setColumns(10);
		
		textField_7mbl = new JTextField();
		textField_7mbl.setEditable(false);
		
		textField_7mbl.setColumns(10);
		
		textField_9email = new JTextField();
		textField_9email.setEditable(false);
		textField_9email.setColumns(10);
		
		textField_10sign = new JTextField();
		textField_10sign.setEditable(false);
		textField_10sign.setColumns(10);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495592154_Synchronize.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				//set editable true
				textField_1date.setEditable(true);
				textField_2name.setEditable(true);
				textField_6nation.setEditable(true);
				textField_7mbl.setEditable(true);
				textField_9email.setEditable(true);
				textField_10sign.setEditable(true);
				textArea.setEditable(true);
				
			}
		});
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\1495591998_save_accept.png"));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				JOptionPane.showMessageDialog(null,"saved");
			}
		});
		
		JLabel lblNewLabel = new JLabel("");  
		lblNewLabel.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\rat8.png"));
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		String gen[]={"--Select--","Male","Female"};
		JComboBox comboBoxgender = new JComboBox(gen);    
		String dd[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		JComboBox comboBoxdate = new JComboBox(dd);
		String mm[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox comboBox_1month = new JComboBox(mm);
		String yy[]={"1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
		JComboBox comboBox_2year = new JComboBox(yy);
		String type[]={"--Select--","Saving","Current"};
		JComboBox comboBoxtype = new JComboBox(type);
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String acno=textFieldacno.getText();
				String date=textField_1date.getText();
				String name=textField_2name.getText();
				String d1=(String)comboBoxdate.getSelectedItem();
				String m1=(String)comboBox_1month.getSelectedItem();
				String y1=(String)comboBox_2year.getSelectedItem();
				String dob=d1+"/"+m1+"/"+y1;
				
				String nation=textField_6nation.getText();
				String gender=(String)comboBoxgender.getSelectedItem();
				String adress=textArea.getText();
				String ac1no=textField_3no.getText();
				String type=(String)comboBoxtype.getSelectedItem();
				String mobile=textField_7mbl.getText();
				String email=textField_9email.getText();
				String sign=textField_10sign.getText();
				
				String query="select * from profile where account=?";
				java.sql.Connection con=DBInfo.con;
				int flag=0;
				try 
				{
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, acno);
					
					
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
					
					
					textField_2name.setText(name);
					comboBox_1month.setSelectedIndex(0);
					comboBoxdate.setSelectedIndex(0);
					comboBox_2year.setSelectedIndex(0);
					textField_6nation.setText(nation);
					comboBoxgender.setSelectedIndex(0);
					textArea.setText(adress);
					textFieldacno.setText(ac1no);
					comboBoxtype.setSelectedIndex(0);
					textField_7mbl.setText(mobile);
					textField_9email.setText(email);
					textField_10sign.setText(sign);
				}
				else
				{
					JOptionPane.showMessageDialog(accountant.this,"wrong Usernname OR password","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
				
			
		});
		btnSearch.setIcon(new ImageIcon("E:\\java project\\JAVA IMAGES\\search_book-512.png"));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(32, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAcNo)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldacno, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(8)
									.addComponent(lblDate)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_1date, 119, 119, 119)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(10)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblDob)
												.addComponent(lblNationalities)
												.addComponent(lblGender)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(lblName))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(lblAdress)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(comboBoxdate, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(comboBox_1month, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(comboBox_2year, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addComponent(textField_6nation, Alignment.LEADING)
											.addComponent(textField_2name, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
											.addComponent(comboBoxgender, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAcType)
										.addComponent(lblAcNo_1)
										.addComponent(lblMobileNo)
										.addComponent(lblEmailId)
										.addComponent(lblSign))
									.addGap(41)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBoxtype, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textField_9email)
											.addComponent(textField_7mbl)
											.addComponent(textField_10sign)
											.addComponent(textField_3no, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnUpdate)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAcNo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldacno, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDate)
								.addComponent(textField_1date, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName)
						.addComponent(textField_3no, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAcNo_1))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDob)
						.addComponent(lblAcType)
						.addComponent(comboBoxdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1month, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxtype, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNationalities)
						.addComponent(textField_6nation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7mbl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMobileNo))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender)
						.addComponent(lblEmailId)
						.addComponent(textField_9email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxgender, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_10sign, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSign)
						.addComponent(lblAdress)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnUpdate)
						.addComponent(btnSave))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
