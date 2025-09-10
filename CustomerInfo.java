import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class CustomerInfo extends JFrame {
    JButton btn;
    CustomerInfo(){
        JPanel panel  = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel label = new JLabel("Customers Information");
        label.setBounds(250,10,300,30);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(label);

          JLabel id = new JLabel("Id");
        id.setBounds( 40,60,50,19);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);

         JLabel num = new JLabel("Number");
        num.setBounds( 140,60,80,19);
        num.setForeground(Color.WHITE);
        num.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(num);

         JLabel name = new JLabel("Name");
        name.setBounds( 250,60,80,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

         JLabel gener = new JLabel("Gender");
        gener.setBounds( 350,60,80,19);
        gener.setForeground(Color.WHITE);
        gener.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gener);

        
         JLabel country = new JLabel("Country");
        country.setBounds( 470,60,120,19);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(country);

          JLabel rnum= new JLabel("Room No");
        rnum.setBounds( 580,60,120,19);
        rnum.setForeground(Color.WHITE);
        rnum.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rnum);

            JLabel date = new JLabel("Date");
        date.setBounds( 700,60,80,19);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(date);

             JLabel deposite = new JLabel("Deposite");
        deposite.setBounds( 790,60,80,19);
        deposite.setForeground(Color.WHITE);
        deposite.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(deposite);


         btn = new JButton("BACK");
        btn.setBounds(350,500,120,25);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        panel.add(btn);
        btn.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
            }
        });
       









        


        JTable table = new JTable();
        table.setBounds(0,90,890,150);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try {
              conn c = new conn();
        String q = "select * from Customer";
        ResultSet resultSet = c.statement.executeQuery(q);
        table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


  
       
        

        


        setLayout(null);
        setLocation(400,100);
        setSize(900,600);
        setVisible(true);

        

    }
    public static void main(String[] args){
        new CustomerInfo();

    }
    
}
