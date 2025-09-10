import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Connection;

public class Login2 extends JFrame implements ActionListener {
     JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;

    Login2(){
        super("Hotel Management System");
         JLabel label1 = new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new java.awt.Font("Tahoma",Font.BOLD,16));
        label1.setForeground(java.awt.Color.WHITE);
        
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new java.awt.Font("Tahoma",Font.BOLD,16));
        label2.setForeground(java.awt.Color.WHITE);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(java.awt.Color.WHITE);
        textField1.setFont(new java.awt.Font("Tahoma",Font.BOLD,16));
        textField1.setBackground(new java.awt.Color(26,104,110));
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(java.awt.Color.WHITE);
        passwordField1.setBackground(new java.awt.Color(26,104,110));
        add(passwordField1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318,-30,255,300);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("Tahoma",Font.BOLD,16));
        b1.setBackground(java.awt.Color.BLACK);
        b1.setForeground(java.awt.Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("Tahoma",Font.BOLD,16));
        b2.setBackground(java.awt.Color.BLACK);
        b2.setForeground(java.awt.Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new java.awt.Color(3,45,48));
        setLayout(null);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);
    }

     @Override
      public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try {
                conn c = new conn();
                String user = textField1.getText();
                String pass= new String(passwordField1.getPassword());
                String q = "select * from login2 where username = '"+user+"'and password = '"+pass+"'";
                ResultSet resultSet= c.statement.executeQuery(q);

                if(resultSet.next()){
                    new Admin();
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid");
                }
            } catch (Exception E) {
                //TODO: handle exception
                E.printStackTrace();

            }

        }if(e.getSource()==b2){
            new Dashboard();
        }
                   
    }
   
    

    
    public static void main(String[] args) {
        new Login2();

        
    }
}


