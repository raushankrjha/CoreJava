import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;

public class results1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					results1 frame = new results1();
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
	public results1() {
		setTitle("RESULTS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewResults = new JButton("NEW RESULTS");
		btnNewResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				newresult obj=new newresult();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnNewResults);
		
		JButton btnViewMarksheet = new JButton("VIEW MARKSHEET");
		menuBar.add(btnViewMarksheet);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Student obj=new Student();
				obj.setVisible(true);
			}
		});
		menuBar.add(btnBack);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		
		JLabel lblResultsPanel = new JLabel("RESULTS PANEL");
		lblResultsPanel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultsPanel.setForeground(Color.GREEN);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMinimum(30);
		progressBar.setStringPainted(true);
		progressBar.setBackground(new Color(169, 169, 169));
		progressBar.setValue(40);
		progressBar.setIndeterminate(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(164)
					.addComponent(label)
					.addContainerGap(122, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(lblResultsPanel)
					.addGap(64))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addComponent(label)
					.addGap(38)
					.addComponent(lblResultsPanel)
					.addGap(86)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
