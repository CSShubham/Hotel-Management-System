import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.scene.paint.Color;

public class Admin extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5;
    Admin(){
        super("Hotel Management System");
 


        b1 = new JButton("ADD EMPLOYEE");
        b1.setBounds(270,200,190,30);
        b1.setBackground(java.awt.Color.black);
        b1.setForeground(java.awt.Color.white);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);

             b2 = new JButton("ADD ROOM");
        b2.setBounds(270,340,190,30);
        b2.setBackground(java.awt.Color.black);
        b2.setForeground(java.awt.Color.white);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);

             b3 = new JButton("ADD DRIVER");
        b3.setBounds(270,470,190,30);
        b3.setBackground(java.awt.Color.black);
        b3.setForeground(java.awt.Color.white);
        b3.setFont(new Font("Tahoma",Font.BOLD,15));
        b3.addActionListener(this);
        add(b3);

             b4 = new JButton("Logout");
        b4.setBounds(50,650,95,30);
        b4.setBackground(java.awt.Color.BLACK);
        b4.setForeground(java.awt.Color.white);
        b4.setFont(new Font("Tahoma",Font.BOLD,15));
        b4.addActionListener(this);
        add(b4);

             b5 = new JButton("Back");
        b5.setBounds(170,650,95,30);
        b5.setBackground(java.awt.Color.black);
        b5.setForeground(java.awt.Color.white);
        b5.setFont(new Font("Tahoma",Font.BOLD,15));
          b5.addActionListener(this);
        add(b5);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,3,1345,720);
        panel.setBackground(new java.awt.Color(3,45,48));
        add(panel);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i2 = image.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(70,150,120,120);
        panel.add(label1);

         ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i3 = image1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i3);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(70,280,120,120);
        panel.add(label2);

        ImageIcon image3 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i4 = image3.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(i4);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(70,410,120,120);
        panel.add(label3);

        ImageIcon image4 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i5 = image4.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon4 = new ImageIcon(i5);
        JLabel label4 = new JLabel(imageIcon4);
        label4.setBounds(880,220,400,400);
        panel.add(label4);

    

        setLayout(null);
        setSize(1370,770);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== b1) {
            new Employee();
            

            
        }
        else if(e.getSource()== b2){
            new Room();
            

        }
        else if(e.getSource()== b3){
            new Driver();
           

        }
        else if(e.getSource()==b4){
            System.exit(102);

        }
        else if(e.getSource()== b5){
               new Dashboard();
            this.setVisible(false);

        }
    }
       
    public static void main(String[] args) {
        new Admin();
        
    }

}
