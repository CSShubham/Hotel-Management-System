import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Dep extends JFrame  {
    JTable table;
    Dep(){
         JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel label = new JLabel("All Departments");
        label.setBounds(300,15,260,25);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label);

        
        JLabel label2 = new JLabel("Department");
        label2.setBounds(130,50,120,25);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label2);

          JLabel label3 = new JLabel("Budget");
        label3.setBounds(550,50,120,25);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label3);


        table = new JTable();
        table.setBounds(10,70,890,200);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);
       
        JButton back = new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });


        try {
             conn c = new conn();
        String Depat = "Select * from department";
        ResultSet resultSet = c.statement.executeQuery(Depat);
        table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        

        setLocation(400,100);
        setSize(900,600);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Dep();

        
    }
    
}
