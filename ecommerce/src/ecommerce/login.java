package ecommerce;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(35, 10, 751, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setBounds(337, 28, 105, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name:");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(191, 106, 123, 54);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password:");
		lblNewLabel_2_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(191, 189, 111, 54);
		panel.add(lblNewLabel_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(321, 106, 294, 54);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(SystemColor.window);
		textArea_1.setBounds(321, 189, 294, 54);
		panel.add(textArea_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBounds(315, 334, 147, 45);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 751, 403);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\1913.jpg"));

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=textArea.getText();
				String password=textArea_1.getText();
                try
				{
					Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "sagnik");
					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Select username,password from user where username=? and password=?");
				    st.setString(1,username);
					st.setString(2,password);
					ResultSet rs=st.executeQuery();

					if(rs.next())
					{
                       itemlist item1=new itemlist();
					   item1.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton,"Wrong Username or Password");
					}
				}

				catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});

	}

}
