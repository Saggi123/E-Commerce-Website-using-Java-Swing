package ecommerce;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CartPanel extends JFrame {
    double totalprice;
    public CartPanel() {
        super("Cart");
       totalprice=0;
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        String[] columnNames = {"ID", "Price"};
        JTable table = new JTable(new DefaultTableModel(columnNames, 0));

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "sagnik");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cart1");

            while (rs.next()) {
                int id = rs.getInt("id");
                double price = rs.getDouble("price");
                totalprice+=price;
                Object[] row = {id,price};
                ((DefaultTableModel) table.getModel()).addRow(row);
            }
            JLabel totalPriceLabel = new JLabel("Total Price: "+totalprice);
            totalPriceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            add(totalPriceLabel);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try
            {
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "sagnik");
                PreparedStatement st=(PreparedStatement) conn.prepareStatement("SET SQL_SAFE_UPDATES=0");
                st.executeUpdate();
                PreparedStatement st1=(PreparedStatement) conn.prepareStatement("Delete From cart1");
                st1.executeUpdate();
                JOptionPane.showMessageDialog(checkoutButton,"Your Total Bill is Rs"+totalprice);
                itemlist frame=new itemlist();
                frame.setVisible(true);
                setVisible(false);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            }
        });
        add(checkoutButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CartPanel frame = new CartPanel();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
