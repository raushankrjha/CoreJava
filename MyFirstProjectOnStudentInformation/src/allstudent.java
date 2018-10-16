import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class allstudent extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public allstudent() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAllstudent = new JLabel("ALL STUDENT NAME");
		lblAllstudent.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAllstudent.setForeground(new Color(0, 0, 255));
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setForeground(new Color(75, 0, 130));
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblBranch = new JLabel("BRANCH");
		lblBranch.setForeground(new Color(75, 0, 130));
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox comboBox = new JComboBox(GetValues.getCourse());
		comboBox.setBackground(new Color(106, 90, 205));
		
		JComboBox comboBox_1 = new JComboBox(GetValues.getBranch());
		
		JButton btnStudentName = new JButton("STUDENT NAME");
		btnStudentName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
			}
		});
		btnStudentName.setForeground(new Color(75, 0, 130));
		btnStudentName.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnStudentMobileNo = new JButton("STUDENT MOBILE NO");
		btnStudentMobileNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
			}
		});
		btnStudentMobileNo.setForeground(new Color(75, 0, 130));
		btnStudentMobileNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(99)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBranch)
									.addGap(18)
									.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCourse)
									.addGap(18)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(23))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(82)
							.addComponent(btnStudentName)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnStudentMobileNo)))
					.addContainerGap(88, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(139, Short.MAX_VALUE)
					.addComponent(lblAllstudent)
					.addGap(134))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblAllstudent)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCourse)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBranch)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnStudentName)
						.addComponent(btnStudentMobileNo))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
