import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;

import com.mysql.cj.protocol.Resultset;
public class Update_room extends JFrame{
    Update_room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon2);
        label.setBounds(500,80,300,300);
        panel.add(label);

        JLabel label2 = new JLabel("Update Room Status");
        label2.setBounds(150,10,250,30);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label2);

         JLabel id = new JLabel("ID :");
        id.setBounds(25,70,45,15);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(id);

        Choice c =  new Choice();
        c.setBounds(200,70,170,30);
        c.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(c);

        try {
            conn C = new conn();
            ResultSet resultSet = C.statement.executeQuery("select * from customer");
            while (resultSet.next()) {
                c.add(resultSet.getString("Number"));
                
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        JLabel rnum = new JLabel("Room Number :");
        rnum.setBounds(25,112,120,15);
        rnum.setForeground(Color.WHITE);
        rnum.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(rnum);
        

        JTextField textrnum = new JTextField();
        textrnum.setBounds(200,112,170,25);
        textrnum.setFont(new Font("Tahoma",Font.PLAIN,15));

        panel.add(textrnum);

         JLabel ava = new JLabel("Availablity :");
        ava.setBounds(25,154,120,15);
        ava.setForeground(Color.WHITE);
        ava.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(ava);

        JTextField textava = new JTextField();
        textava.setBounds(200,154,170,25);
        textava.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(textava);

         JLabel status = new JLabel("Clean Status :");
        status.setBounds(25,196,120,15);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(status);
        
        JTextField textstatus = new JTextField();
        textstatus.setBounds(200,196,170,25);
        textstatus.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(textstatus);

        JButton btn = new JButton("UPDATE");
        btn.setBounds(160,320,100,25);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        panel.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                  try{
                    conn C = new conn();
                      String q = c.getSelectedItem();
                      String ava = textava.getText();
                      String status = textstatus.getText();

                    C.statement.executeUpdate("update room set Available = '"+ava+"',CleanStatus = '"+status+"'where RoomNo = '"+textrnum.getText()+"'");
                    JOptionPane.showMessageDialog(null, "UpdatedSuccessfully");
                    setVisible(false);

                }catch(Exception E){
                    E.printStackTrace();
                }
            
               
            }
        });

              

        

         JButton btn1 = new JButton("CHECK");
        btn1.setBounds(80,360,100,25);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        panel.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = c.getSelectedItem();
                String q = "select*from customer where Number = '"+id+"'";

                try {
                     conn C = new conn();
                    ResultSet resultSet = C.statement.executeQuery(q);
                    while (resultSet.next()) {
                        textrnum.setText(resultSet.getString("Alocatedroom"));
                        
                    } 
                    ResultSet resultSet1 = C.statement.executeQuery("select * from room where RoomNo = '"+textrnum.getText()+"'");
                    while (resultSet1.next()) {
                        textava.setText(resultSet1.getString("Available"));
                        textstatus.setText(resultSet1.getString("CleanStatus"));
                        
                    }
                    
                } catch (Exception E) {
                    // TODO: handle exception
                    E.printStackTrace();
                   
                    }
                }
                
        });

         JButton btn2 = new JButton("BACK");
        btn2.setBounds(230,360,100,25);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        panel.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                
            }
        });





        setSize(900,500);
        setLayout(null);
        setLocation(400,150);
        setVisible(true);
        

    }
    public static void main(String args[]){
       new  Update_room();
    }
    
}
