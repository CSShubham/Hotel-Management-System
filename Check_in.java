import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Check_in extends JFrame{
    Check_in(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        ImageIcon imageIcon  = new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
        Image image = imageIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(480,100,250,250);
        panel.add(label);

        JLabel label2 = new JLabel("Check-In Details");
        label2.setBounds(100,15,200,25);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label2);

        JLabel id = new JLabel("Id");
        id.setBounds(25,70,46,15);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(id);

        Choice c = new Choice();
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

         JLabel rnum = new JLabel("Room Number");
        rnum.setBounds(25,112,150,15);
        rnum.setForeground(Color.WHITE);
        rnum.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(rnum);

        JTextField textField = new JTextField();
        textField.setBounds(200,112,170,25);
        textField.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(textField);

          JLabel name = new JLabel("Name");
        name.setBounds(25,154,150,15);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(name);

        JTextField textField1 = new JTextField();
        textField1.setBounds(200,154,170,25);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(textField1);

           JLabel check = new JLabel("Cheked-In");
        check.setBounds(25,196,150,15);
        check.setForeground(Color.WHITE);
        check.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(check);

        JTextField textField2 = new JTextField();
        textField2.setBounds(200,196,170,25);
        textField2.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(textField2);

          JLabel amt = new JLabel("Amount Paid (Rs)");
        amt.setBounds(25,238,150,15);
        amt.setForeground(Color.WHITE);
        amt.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(amt);

        JTextField textField3 = new JTextField();
        textField3.setBounds(200,238,170,25);
        textField3.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(textField3);

        
          JLabel pamt = new JLabel("Pending Amount");
        pamt.setBounds(25,280,150,15);
        pamt.setForeground(Color.WHITE);
        pamt.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(pamt);

        JTextField textField4 = new JTextField();
        textField4.setBounds(200,280,170,25);
        textField4.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(textField4);


        JButton btn = new JButton("UPDATE");
        btn.setBounds(50,380,120,25);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        panel.add(btn);
        btn.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
            try{
              conn C = new conn();
              String q = c.getSelectedItem();
              String room = textField.getText();
              String name = textField1.getText();
              String check = textField2.getText();
              String amount  = textField3.getText();

              C.statement.executeUpdate("update customer set Alocatedroom = '"+room+"',Name = '"+name+"',Check_in = '"+check+"',Deposite = '"+amount+"' where Number = '"+q+"'");
              JOptionPane.showMessageDialog(null, "Updated Successfully");
              setVisible(false);


            }catch(Exception E){
              E.printStackTrace();

            }

          }
        });

       

  
   
        
        JButton btn1 = new JButton("BACK");
        btn1.setBounds(200,380,120,25);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        panel.add(btn1);
        btn1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
            setVisible(false);
          }
        });

       

        JButton btn2 = new JButton("CHECK");
        btn2.setBounds(350,380,120,25);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        panel.add(btn2);
        btn2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
            String id = c.getSelectedItem();
            String q = "select * from customer where Number = '"+id+"'";

            try {
              conn C = new conn();
              ResultSet resultSet = C.statement.executeQuery(q);
              while (resultSet.next()) {
                textField.setText(resultSet.getString("Alocatedroom"));
                textField1.setText(resultSet.getString("Name"));
                textField2.setText(resultSet.getString("Check_in"));
                textField3.setText(resultSet.getString("Deposite"));
               }
               ResultSet resultSet1 = C.statement.executeQuery("select * from room where RoomNo = '"+textField.getText()+"'");
               while (resultSet1.next()) {
                String price  =resultSet1.getString("Price");
                int amountpaid = Integer.parseInt(price) - Integer.parseInt(textField3.getText());
                textField4.setText(""+amountpaid);

                
               }

              
            } catch (Exception E) {
              // TODO: handle exception
              E.printStackTrace();
            }

          }
        });

        setLayout(null);
        setSize(850,500);
        setLocation(400,150);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Check_in();
        
    }
    
}
