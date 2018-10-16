import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tictactoe1 extends JFrame 
{
	
	public String whoseTurn="X";
	
	private JPanel contentPane;
	public JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe1 frame = new Tictactoe1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void determineWhoseTurn() 
	{
		
		if(whoseTurn.equalsIgnoreCase("X"))
		{
			whoseTurn="O";
		}
		else
		{
			whoseTurn="X";
		}
	}
	private void xWins()
	{
		JOptionPane.showMessageDialog(this," First player Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
	}
	public void oWins()
	{
		JOptionPane.showMessageDialog(this," Second player Wins","Winner",JOptionPane.INFORMATION_MESSAGE);
	}
	public void determineIfWin()
	{
		String one=btnNewButton.getText();
		String two=btnNewButton_1.getText();
		String three=btnNewButton_3.getText();
		String four=btnNewButton_4.getText();
		String five=btnNewButton_5.getText();
		String six=btnNewButton_6.getText();
		String seven=btnNewButton_7.getText();
		String eight=btnNewButton_8.getText();
		String nine=btnNewButton_9.getText();
		//Winnining code\
		
		if(one.equalsIgnoreCase("x") && two.equalsIgnoreCase("x")&&three.equalsIgnoreCase("x"))
		{
			xWins();
		}
		
	if(four.equalsIgnoreCase("x") && five.equalsIgnoreCase("x") && six.equalsIgnoreCase("x"))
	{
		xWins();
	}
	if(seven.equalsIgnoreCase("x") && eight.equalsIgnoreCase("x") && nine.equalsIgnoreCase("x"))
	{
		xWins();
	}
	if(two.equalsIgnoreCase("x") && five.equalsIgnoreCase("x") && eight.equalsIgnoreCase("x"))
	{
		xWins();
	}
	if(three.equalsIgnoreCase("x")&& six.equalsIgnoreCase("x") && nine.equalsIgnoreCase("x"))
	{
		xWins();
	}
	if(one.equalsIgnoreCase("x") && five.equalsIgnoreCase("x") && nine.equalsIgnoreCase("x"))
	{
		xWins();
	}
	if(three.equalsIgnoreCase("x") && five.equalsIgnoreCase("x") && seven.equalsIgnoreCase("x"))
	{
		xWins();
	}
	
	
	
	//if o wins
	if(one.equalsIgnoreCase("o") && two.equalsIgnoreCase("o")&&three.equalsIgnoreCase("o"))
	{
		oWins();
	}
	
if(four.equalsIgnoreCase("o") && five.equalsIgnoreCase("o") && six.equalsIgnoreCase("o"))
{
	oWins();
}
if(seven.equalsIgnoreCase("o") && eight.equalsIgnoreCase("o") && nine.equalsIgnoreCase("o"))
{
	oWins();
}
if(two.equalsIgnoreCase("o") && five.equalsIgnoreCase("o") && eight.equalsIgnoreCase("o"))
{
	oWins();
}
if(three.equalsIgnoreCase("o")&& six.equalsIgnoreCase("o") && nine.equalsIgnoreCase("o"))
{
	oWins();
}
if(one.equalsIgnoreCase("o") && five.equalsIgnoreCase("o") && nine.equalsIgnoreCase("o"))
{
	oWins();
}
if(three.equalsIgnoreCase("o") && five.equalsIgnoreCase("o") && seven.equalsIgnoreCase("o"))
{
	oWins();
}

}
	public Tictactoe1() 
	{
		//Designed & Developed By Rjha
		setTitle("TicTacToe");
		setLocationRelativeTo(this);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 3, 1));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.WHITE);
		
	 btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				btnNewButton.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton.setForeground(Color.red);
					
				}else
				{
					btnNewButton.setForeground(Color.blue);
				}
					
				
				determineWhoseTurn();
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		 btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				btnNewButton_1.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_1.setForeground(Color.red);
					
				}else
				{
					btnNewButton_1.setForeground(Color.blue);
				}
				determineWhoseTurn();
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(Color.WHITE);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBackground(Color.WHITE);
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				btnNewButton_3.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_3.setForeground(Color.red);
					
				}else
				{
					btnNewButton_3.setForeground(Color.blue);
				}
				determineWhoseTurn();
			}
		});
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(41)
					.addComponent(btnNewButton_2))
				.addComponent(btnNewButton_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(Color.WHITE);
		
		 btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnNewButton_4.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_4.setForeground(Color.red);
					
				}else
				{
					btnNewButton_4.setForeground(Color.blue);
				}
				determineWhoseTurn();
			}
		});
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
					.addGap(11))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(Color.WHITE);
		
		 btnNewButton_5 = new JButton("");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				btnNewButton_5.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_5.setForeground(Color.red);
					
				}else
				{
					btnNewButton_5.setForeground(Color.blue);
				}
				determineWhoseTurn();
				
			}
		});
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.WHITE);
		
	 btnNewButton_6 = new JButton("");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnNewButton_6.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_6.setForeground(Color.red);
					
				}else
				{
					btnNewButton_6.setForeground(Color.blue);
				}
				determineWhoseTurn();
				
			}
		});
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
					.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
		);
		panel_6.setLayout(gl_panel_6);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBackground(Color.WHITE);
		
		 btnNewButton_7 = new JButton("");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnNewButton_7.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_7.setForeground(Color.red);
					
				}else
				{
					btnNewButton_7.setForeground(Color.blue);
				}
				determineWhoseTurn();
			
			}
		});
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_7.createSequentialGroup()
					.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
		);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(Color.WHITE);
		
		 btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnNewButton_8.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_8.setForeground(Color.red);
					
				}else
				{
					btnNewButton_8.setForeground(Color.blue);
				}
				determineWhoseTurn();
				
			}
		});
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_8.createSequentialGroup()
					.addComponent(btnNewButton_8, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_8, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
		);
		panel_8.setLayout(gl_panel_8);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		
		 btnNewButton_9 = new JButton("");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				btnNewButton_9.setText(whoseTurn);
if(whoseTurn.equalsIgnoreCase("X"))
					
				{
					btnNewButton_9.setForeground(Color.red);
					
				}else
				{
					btnNewButton_9.setForeground(Color.blue);
				}
					determineWhoseTurn();
					
			}
		});
		
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_9, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_9.createSequentialGroup()
					.addComponent(btnNewButton_9, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
		);
		panel_9.setLayout(gl_panel_9);
		
		JLabel lblNewLabel = new JLabel("Place Holder forStores");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
	}
	
}
