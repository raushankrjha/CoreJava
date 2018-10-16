import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class viewnotice extends JFrame {

	private JPanel contentPane;
	int flag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewnotice frame = new viewnotice();
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
	public viewnotice() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 529, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(106, 90, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAllNotice = new JLabel("ALL NOTICE");
		
		JLabel lblNotice = new JLabel("NOTICE:");
		lblNotice.setFont(new Font("Tahoma", Font.BOLD, 13));
	
		
		JTextArea textArea = new JTextArea();
JLabel lblBranch = new JLabel("BRANCH:");
lblBranch.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JComboBox comboBox = new JComboBox(GetValues.getBranch());
			
		
		JButton btnShowNotice = new JButton("SHOW NOTICE");
		btnShowNotice.setForeground(new Color(0, 0, 205));
		btnShowNotice.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnShowNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{

				String notice=textArea.getText();
				String query="select * from notice where branch=?";
				try
				{
					PreparedStatement ps=DBInfo.con.prepareStatement(query);
					ps.setString(4, notice);
					ResultSet res=ps.executeQuery();
					if(res!=null)
					{
						while (res.next()) 
						{
							textArea.setText(res.getString(4));
							flag=1;
							break;
						}
						
					}
					else
					{
						flag=0;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				if(flag==0)
				{
					JOptionPane.showMessageDialog(viewnotice.this,"NO NOTICE FOR SELECTED BRANCH","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});	
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(206)
							.addComponent(lblAllNotice))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(96)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblBranch)
								.addComponent(lblNotice))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(129, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(225, Short.MAX_VALUE)
					.addComponent(btnShowNotice)
					.addGap(173))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(lblAllNotice)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBranch)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(btnShowNotice)
							.addGap(57))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(102)
							.addComponent(lblNotice)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
