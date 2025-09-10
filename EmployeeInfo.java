import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Connection;
import net.proteanit.sql.*;

public class EmployeeInfo extends JFrame{
    EmployeeInfo(){
         JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new java.awt.Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel l1 = new JLabel("Name");
        l1.setForeground(java.awt.Color.WHITE);
        l1.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l1.setBounds(50,10,80, 22);
        panel.add(l1);

          JLabel l2 = new JLabel("Age");
        l2.setForeground(java.awt.Color.WHITE);
        l2.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l2.setBounds(170,10, 80, 22);
       
        panel.add(l2);

        
          JLabel l3 = new JLabel("Gender");
        l3.setForeground(java.awt.Color.WHITE);
        l3.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l3.setBounds(270, 10, 80, 22);
        panel.add(l3);
        
        
          JLabel l4 = new JLabel("Job");
        l4.setForeground(java.awt.Color.WHITE);
        l4.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l4.setBounds(400, 10, 80, 22);
        panel.add(l4);
            JLabel l5 = new JLabel("Salary");
        l5.setForeground(java.awt.Color.WHITE);
        l5.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l5.setBounds(530, 10, 80, 22);
        panel.add(l5);

           JLabel l6 = new JLabel("Phone");
        l6.setForeground(java.awt.Color.WHITE);
        l6.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l6.setBounds(640, 10, 80, 22);
        panel.add(l6);

         JLabel l7 = new JLabel("Email");
        l7.setForeground(java.awt.Color.WHITE);
        l7.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l7.setBounds(770, 10, 80, 22);
        panel.add(l7);

          JLabel l8 = new JLabel("Adhar card");
        l8.setForeground(java.awt.Color.WHITE);
        l8.setFont(new java.awt.Font("Serif",java.awt.Font.BOLD,18));
        l8.setBounds(870, 10, 150, 22);
        panel.add(l8);


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
        table.setBounds(10,40,980,450);
        table.setBackground(new java.awt.Color(3,45,48));
        table.setForeground(java.awt.Color.white);
        table.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(table);

       

        try {
            conn c = new conn();
            String empInfo = "select * from employee";
            ResultSet resultSet = c.statement.executeQuery(empInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            // Check if data is loaded
            if (table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No data found in the employeeInfo table.");
            } else {
                System.out.println("Rows loaded: " + table.getRowCount());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            e.printStackTrace();
        }

        setLayout(null);
        setLocation(345,100);
        setSize(1000,600);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new EmployeeInfo();

    }
}
    
    

