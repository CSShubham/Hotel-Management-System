import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Connection;
import net.proteanit.sql.*;


public class Rooms extends JFrame {
    Rooms(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel l1 = new JLabel("Availability");
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setForeground(Color.WHITE);
        l1.setBounds(60, 15, 200, 19);
        panel.add(l1);

        JLabel name = new JLabel("Status");
        name.setBounds(380,15,120,19);
        name.setFont(new Font("Tahoma",Font.BOLD,18));
        name.setForeground(Color.WHITE);
        panel.add(name);

        JLabel price = new JLabel("Price");
        price.setBounds(270,15,80,19);
        price.setFont(new Font("Tahoma",Font.BOLD,18));
        price.setForeground(Color.WHITE);
        panel.add(price);

         JLabel bed = new JLabel("Type");
        bed.setBounds(470,15,80,19);
        bed.setFont(new Font("Tahoma",Font.BOLD,18));
        bed.setForeground(Color.WHITE);
        panel.add(bed);




       

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(650, 200, 200, 200);
        panel.add(label);

     


        JButton back = new JButton("BACK");
        back.setBounds(400,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("serif",Font.BOLD,18));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
        
            }

        });       

        JTable table = new JTable();
        table.setBounds(20,40,550,400);
        table.setBackground(new java.awt.Color(3,45,48));
        table.setForeground(java.awt.Color.white);
        panel.add(table);

        

       

        try {
            conn c = new conn();
            String RoomInfo = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            // Check if data is loaded
            if (table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No data found in the room table.");
            } else {
                System.out.println("Rows loaded: " + table.getRowCount());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            e.printStackTrace();
        }

        setLayout(null);
        setLocation(400,100);
        setSize(900,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Rooms();
    }
    
}
