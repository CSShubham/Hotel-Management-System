import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;

import javax.swing.*;
public class Check_out extends JFrame {
    Check_out(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel label = new JLabel("Check Out Details");
        label.setBounds(150,10,200,25);
        label.setFont(new Font("Tahoma",Font.PLAIN,20));
        label.setForeground(Color.WHITE);
        panel.add(label);

        
        JLabel id = new JLabel("ID");
        id.setBounds(35,60,100,20);
        id.setFont(new Font("Tahoma",Font.BOLD,15));
        id.setForeground(Color.WHITE);
        panel.add(id);

        Choice c = new Choice();
        c.setBounds(250,60,150,25);
        c.setFont(new Font("tahoma",Font.PLAIN,15));
        panel.add(c);

        try {
            conn C = new conn();
            ResultSet resultSet = C.statement.executeQuery("select*from customer");
            while (resultSet.next()) {
                c.add(resultSet.getString("Number"));
                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        JLabel rnum = new JLabel("Room No");
        rnum.setBounds(35,100,100,20);
        rnum.setFont(new Font("Tahoma",Font.BOLD,15));
        rnum.setForeground(Color.WHITE);
        panel.add( rnum);

        JLabel rnum1 = new JLabel("");
        rnum1.setBounds(250,100,100,20);
        rnum1.setFont(new Font("Tahoma",Font.BOLD,15));
        rnum1.setForeground(Color.WHITE);
        panel.add( rnum1);

        JLabel date = new JLabel("Check-In Time");
        date.setBounds(35,140,150,20);
        date.setFont(new Font("Tahoma",Font.BOLD,15));
        date.setForeground(Color.WHITE);
        panel.add(date);

        
        JLabel date1 = new JLabel("");
        date1.setBounds(250,140,200,20);
        date1.setFont(new Font("Tahoma",Font.BOLD,15));
        date1.setForeground(Color.WHITE);
        panel.add(date1);

        JLabel date3 = new JLabel("Check-Out Time");
        date3.setBounds(35,180,150,20);
        date3.setFont(new Font("Tahoma",Font.BOLD,15));
        date3.setForeground(Color.WHITE);
        panel.add(date3);

        java.util.Date date5 = new java.util.Date();

         JLabel date4 = new JLabel(""+date5);
        date4.setBounds(250,180,200,20);
        date4.setFont(new Font("Tahoma",Font.BOLD,15));
        date4.setForeground(Color.WHITE);
        panel.add(date4);

        JButton btn = new JButton("UPDATE");
        btn.setBounds(50,280,100,25);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                conn C = new conn();
                C.statement.executeUpdate("delete from customer where Number = '"+c.getSelectedItem()+"'");
                C.statement.executeUpdate("update room set Available = 'Available' where RoomNo = '"+rnum1.getText()+"'");
                JOptionPane.showMessageDialog(null, "Check-Out");
                setVisible(false);


                
               } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
               }
                
            }
        });

         JButton btn1 = new JButton("BACK");
        btn1.setBounds(180,280,100,25);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        panel.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                
            }
            
        });

         JButton btn2 = new JButton("CHECK");
        btn2.setBounds(310,280,100,25);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        panel.add(btn2);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Id = c.getSelectedItem();
               try {
                conn C = new conn();
                ResultSet resultSet = C.statement.executeQuery("select * from customer where Number = '"+Id+"'");
                while (resultSet.next()) {
                    rnum1.setText(resultSet.getString("Alocatedroom"));
                    date1.setText(resultSet.getString("Check_in"));



                    
                }

               } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
               }
                
                
            }
            
        });









        setSize(800,400);
        setLayout(null);
        setLocation(400,150);
        setVisible(true);

    }
    public static  void main(String args[]){
        new Check_out();

    }
    
}
