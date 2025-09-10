import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Pick_up_service extends JFrame {
    Choice choice;
    JButton b,b1;
    Pick_up_service() {
        JPanel panle = new JPanel();
        panle.setBounds(5,5,790,490);
        panle.setBackground(new Color(3,45,48));
        panle.setLayout(null);
        add(panle);
        setUndecorated(true);

        JLabel label = new JLabel("PICK UP SERVICE");
        label.setBounds(250,10,300,31);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,18));
        panle.add(label);

        JLabel toc = new JLabel("Type Of Car");
        toc.setBounds(40,60,80,20);
        toc.setForeground(Color.WHITE);
        toc.setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(toc);

        JLabel name = new JLabel("Name");
        name.setBounds(30,130,45,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(name);

         JLabel age = new JLabel("Age");
        age.setBounds(170,130,45,18);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(age);

         JLabel gender = new JLabel("Gender");
        gender .setBounds(270,130,45,18);
        gender .setForeground(Color.WHITE);
        gender .setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(gender );

          JLabel company= new JLabel("Company");
        company.setBounds(370,130,80,18);
        company.setForeground(Color.WHITE);
        company.setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(company);

        
          JLabel cname = new JLabel("Car_Name");
        cname.setBounds(480,130,80,18);
        cname.setForeground(Color.WHITE);
        cname.setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(cname);

         
          JLabel ava = new JLabel("Available");
        ava.setBounds(590,130,80,18);
        ava.setForeground(Color.WHITE);
        ava.setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(ava);

           JLabel loc = new JLabel("Location");
        loc.setBounds(700,130,80,18);
        loc.setForeground(Color.WHITE);
        loc.setFont(new Font("Tahoma",Font.PLAIN,14));
        panle.add(loc);


        choice = new Choice();
        choice.setBounds(150,60,200,25);
        choice.setBackground(new Color(3,45,48));
        choice.setForeground(Color.WHITE);
        panle.add(choice);

        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select*from driver");
            while (resultSet.next()) {
                choice.add(resultSet.getString("Car_Name"));
                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(0,160,790,150);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panle.add(table);

        try {
            conn c = new conn();
            String q = "select * from driver";
            ResultSet resultSet= c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        b = new JButton("DISPLAY");
        b.setBounds(200,400,120,25);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        panle.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String Q = "select * from driver where Car_Name = '"+choice.getSelectedItem()+"'";
                try {
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery(Q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));

                    
                } catch (Exception E) {
                    // TODO: handle exception
                    E.printStackTrace();
                }
                
            }
        });
       
       
        b1 = new JButton("BACK");
        b1.setBounds(400,400,120,25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panle.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                
            }
        });

        setLayout(null);
        setLocation(400,150);
        setSize(800,500);
        setVisible(true);

    }
    public static void main(String args[]){
        new Pick_up_service();
    }
    
}
