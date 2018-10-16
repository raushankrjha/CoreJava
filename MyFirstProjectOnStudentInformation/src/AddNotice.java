import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Dimension;

public class AddNotice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public JComboBox comboBox_2;
	public static void main(String[] args)
	{
		new AddNotice().setVisible(true);
	}

	public AddNotice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\JAVA IMAGES\\fees.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 647, 488);
		setSize(new Dimension(616, 551));
		
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNoticeTable = new JLabel("NOTICE TABLE");
		
		JLabel lblDate = new JLabel("Date:");
		
		JLabel lblSubject = new JLabel("Course");
		
		JLabel lblBranch = new JLabel("Branch");
		
		JLabel lblNotice = new JLabel("Notice");
		Date d=new Date();
		textField = new JTextField(String.valueOf(d));
		textField.setEditable(false);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox(GetValues.getCourse());
		
		JComboBox comboBox_1 = new JComboBox(GetValues.getBranch());
		
		TextArea textArea = new TextArea();
		//textArea.setLineWrap(true);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String date=textField.getText();
				String course=(String)comboBox.getSelectedItem();
				String branch=(String)comboBox_1.getSelectedItem();
				String uploadedby=(String)comboBox_2.getSelectedItem();
				String notice=textArea.getText();
				String query="insert into notice values(?,?,?,?,?)";
				Connection con=DBInfo.con;
				int flag=0;
				try
				{
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, date);
					ps.setString(2, course);
					ps.setString(3, branch);
					ps.setString(4, notice);
					ps.setString(5, uploadedby);
					flag=ps.executeUpdate();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				
				}
				if(flag==1)
				{
					JOptionPane.showMessageDialog(AddNotice.this,"Notice Added!!","Added",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(AddNotice.this,"Notice not Added!!"," No Added",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				comboBox.setSelectedItem(null);
				comboBox_2.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				textArea.setText(null);
			}
		});
		
		JButton btnViewAllNotices = new JButton("VIEW ALL NOTICES");
		btnViewAllNotices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
			}
		});
		
		JLabel lblUploadBy = new JLabel("Upload by:");
		
		comboBox_2 = new JComboBox(GetValues.getfacultyregistration());
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(273)
							.addComponent(lblNoticeTable))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(157)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSubject)
										.addComponent(lblBranch)
										.addComponent(lblNotice))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(comboBox_1, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(comboBox, Alignment.LEADING, 0, 177, Short.MAX_VALUE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblUploadBy)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(200)
							.addComponent(btnSubmit)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnReset)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnViewAllNotices)))
					.addContainerGap(103, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNoticeTable)
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubject, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBranch, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNotice, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUploadBy)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSubmit)
						.addComponent(btnReset)
						.addComponent(btnViewAllNotices))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
