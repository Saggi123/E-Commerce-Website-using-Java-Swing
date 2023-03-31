package ecommerce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class itemlist extends JFrame {

	private JPanel contentPane;
	private JTextField txtSizeM;
	private JTextField txtSizeL;
	private JTextField txtSizeS;
	private JTextField textField;
	private JTextField txtSizeM_1;
	private JTextField txtSizeS_1;
	private JTextField txtRs;
	private JTextField txtRs_1;
	private JTextField txtRs_2;
	private JTextField txtRs_3;
	private JTextField txtRs_4;
	private JTextField txtRs_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					itemlist frame = new itemlist();
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
	public itemlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(1650,1480);
		setBounds(100, 100, 1138, 946);
		contentPane = new JPanel();
		//contentPane.setBackground(Color.red);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 128, 0));
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(29, 112, 1053, 723);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(25, 39, 290, 308);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\img1.jpg"));
		lblNewLabel_1.setBounds(8, 10, 186, 246);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton_1_1 = new JButton("ADD TO CART1");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1_1.setBounds(87, 266, 107, 32);
		panel_2.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "sagnik");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,1);
					st.setInt(2,750);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1_1,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		txtSizeM = new JTextField();
		txtSizeM.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSizeM.setHorizontalAlignment(SwingConstants.CENTER);
		txtSizeM.setForeground(new Color(255, 255, 255));
		txtSizeM.setText("SIZE: M");
		txtSizeM.setBackground(new Color(0, 0, 0));
		txtSizeM.setBounds(214, 12, 70, 32);
		panel_2.add(txtSizeM);
		txtSizeM.setColumns(10);
		
		txtRs = new JTextField();
		txtRs.setText("Rs 750");
		txtRs.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs.setForeground(Color.WHITE);
		txtRs.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs.setColumns(10);
		txtRs.setBackground(Color.BLACK);
		txtRs.setBounds(214, 54, 70, 32);
		panel_2.add(txtRs);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1.setBounds(381, 39, 290, 308);
		panel_1.add(panel_2_1);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART2");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setBounds(93, 266, 107, 32);
		panel_2_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "sagnik");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,2);
					st.setInt(2,850);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JLabel lblNewLabel_1_2 = new JLabel("\r\n");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\img2.jpg"));
		lblNewLabel_1_2.setBounds(3, 17, 186, 246);
		panel_2_1.add(lblNewLabel_1_2);
		
		txtSizeL = new JTextField();
		txtSizeL.setText("SIZE: L");
		txtSizeL.setHorizontalAlignment(SwingConstants.CENTER);
		txtSizeL.setForeground(Color.WHITE);
		txtSizeL.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSizeL.setColumns(10);
		txtSizeL.setBackground(Color.BLACK);
		txtSizeL.setBounds(211, 18, 70, 32);
		panel_2_1.add(txtSizeL);
		
		txtRs_1 = new JTextField();
		txtRs_1.setText("Rs 850");
		txtRs_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_1.setForeground(Color.WHITE);
		txtRs_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_1.setColumns(10);
		txtRs_1.setBackground(Color.BLACK);
		txtRs_1.setBounds(211, 63, 70, 32);
		panel_2_1.add(txtRs_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1_1.setBounds(735, 39, 290, 308);
		panel_1.add(panel_2_1_1);
		
		JButton btnNewButton_2 = new JButton("ADD TO CART3");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBackground(new Color(0, 128, 0));
		btnNewButton_2.setBounds(80, 266, 107, 32);
		panel_2_1_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "sagnik");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,3);
					st.setInt(2,500);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_2,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JLabel lblNewLabel_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\img3.jpg"));
		lblNewLabel_1_1.setBounds(7, 16, 187, 246);
		panel_2_1_1.add(lblNewLabel_1_1);
		
		txtSizeS = new JTextField();
		txtSizeS.setText("SIZE: S");
		txtSizeS.setHorizontalAlignment(SwingConstants.CENTER);
		txtSizeS.setForeground(Color.WHITE);
		txtSizeS.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSizeS.setColumns(10);
		txtSizeS.setBackground(Color.BLACK);
		txtSizeS.setBounds(212, 15, 70, 32);
		panel_2_1_1.add(txtSizeS);
		
		txtRs_2 = new JTextField();
		txtRs_2.setText("Rs 500");
		txtRs_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_2.setForeground(Color.WHITE);
		txtRs_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_2.setColumns(10);
		txtRs_2.setBackground(Color.BLACK);
		txtRs_2.setBounds(212, 57, 70, 32);
		panel_2_1_1.add(txtRs_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2.setBounds(25, 382, 290, 308);
		panel_1.add(panel_2_2);
		
		JButton btnNewButton_3 = new JButton("ADD TO CART4");
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBackground(new Color(0, 128, 0));
		btnNewButton_3.setBounds(89, 266, 107, 32);
		panel_2_2.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "sagnik");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,4);
					st.setInt(2,950);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_3,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JLabel lblNewLabel_1_3 = new JLabel("\r\n");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\img4.jpg"));
		lblNewLabel_1_3.setBounds(7, 12, 186, 246);
		panel_2_2.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setText("SIZE: L");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		textField.setBounds(212, 15, 70, 32);
		panel_2_2.add(textField);
		
		txtRs_3 = new JTextField();
		txtRs_3.setText("Rs 950");
		txtRs_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_3.setForeground(Color.WHITE);
		txtRs_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_3.setColumns(10);
		txtRs_3.setBackground(Color.BLACK);
		txtRs_3.setBounds(212, 57, 70, 32);
		panel_2_2.add(txtRs_3);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2_1.setBounds(381, 382, 290, 308);
		panel_1.add(panel_2_2_1);
		
		JButton btnNewButton_4 = new JButton("ADD TO CART5");
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4.setBackground(new Color(0, 128, 0));
		btnNewButton_4.setBounds(96, 266, 107, 32);
		panel_2_2_1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "sagnik");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,5);
					st.setInt(2,500);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_4,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		JLabel lblNewLabel_1_4 = new JLabel("\r\n");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\img5.jpg"));
		lblNewLabel_1_4.setBounds(7, 11, 186, 246);
		panel_2_2_1.add(lblNewLabel_1_4);
		
		txtSizeM_1 = new JTextField();
		txtSizeM_1.setText("SIZE: M");
		txtSizeM_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSizeM_1.setForeground(Color.WHITE);
		txtSizeM_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSizeM_1.setColumns(10);
		txtSizeM_1.setBackground(Color.BLACK);
		txtSizeM_1.setBounds(214, 12, 70, 32);
		panel_2_2_1.add(txtSizeM_1);
		
		txtRs_4 = new JTextField();
		txtRs_4.setText("Rs 500");
		txtRs_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_4.setForeground(Color.WHITE);
		txtRs_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_4.setColumns(10);
		txtRs_4.setBackground(Color.BLACK);
		txtRs_4.setBounds(214, 53, 70, 32);
		panel_2_2_1.add(txtRs_4);
		
		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setLayout(null);
		panel_2_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2_2.setBounds(735, 382, 290, 308);
		panel_1.add(panel_2_2_2);
		
		JButton btnNewButton_5 = new JButton("ADD TO CART6");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
							"root", "sagnik");

					PreparedStatement st=(PreparedStatement) connection.prepareStatement("Insert into cart1 values(?,?)");
					st.setInt(1,6);
					st.setInt(2,790);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_5,"Item added to Cart");
				} catch (SQLException ex) {
					throw new RuntimeException(ex);
				}
			}
		});
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.setBackground(new Color(0, 128, 0));
		btnNewButton_5.setBounds(107, 266, 107, 32);
		panel_2_2_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_1_5 = new JLabel("\r\n");
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\img6.jpg"));
		lblNewLabel_1_5.setBounds(9, 12, 186, 246);
		panel_2_2_2.add(lblNewLabel_1_5);
		
		txtSizeS_1 = new JTextField();
		txtSizeS_1.setText("SIZE: S");
		txtSizeS_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSizeS_1.setForeground(Color.WHITE);
		txtSizeS_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSizeS_1.setColumns(10);
		txtSizeS_1.setBackground(Color.BLACK);
		txtSizeS_1.setBounds(214, 13, 70, 32);
		panel_2_2_2.add(txtSizeS_1);
		
		txtRs_5 = new JTextField();
		txtRs_5.setText("Rs 790");
		txtRs_5.setHorizontalAlignment(SwingConstants.CENTER);
		txtRs_5.setForeground(Color.WHITE);
		txtRs_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_5.setColumns(10);
		txtRs_5.setBackground(Color.BLACK);
		txtRs_5.setBounds(214, 55, 70, 32);
		panel_2_2_2.add(txtRs_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 24, 1114, 932);
		panel_3.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(SystemColor.desktop);
		panel.setBounds(29, 20, 1055, 52);
		panel_3.add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MYNTRA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(400, 10, 186, 31);
		panel.add(lblNewLabel);
		JButton viewcart=new JButton("View cart");
		viewcart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
            CartPanel cart=new CartPanel();
			cart.setVisible(true);
			}
		});
		viewcart.setForeground(new Color(0, 0, 0));
		viewcart.setFont(new Font("Tahoma", Font.BOLD, 14));
		viewcart.setBackground(new Color(0, 128, 0));
		viewcart.setBounds(800, 10, 150, 32);
		panel.add(viewcart);

	}
}
