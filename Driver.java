import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionListener;

import javafx.scene.paint.Color;

public class Driver extends JFrame implements ActionListener{
    JTextField t1,t2,t4,t5,t6,t7;
    JComboBox t3;
    JButton b1,b2;
    Driver(){
       

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new java.awt.Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel l1 = new JLabel("ADD DRIVER");
        l1.setBounds(300,10,200,30);
        l1.setBackground(new java.awt.Color(3,45,48));
        l1.setFont(new Font("Serif",Font.BOLD,18));
        l1.setForeground(java.awt.Color.WHITE);
        panel.add(l1);

        JLabel name = new JLabel("NAME");
        name.setBounds(50,70,150,30);
        name.setBackground(new java.awt.Color(3,45,48));
        name.setFont(new Font("Serif",Font.BOLD,22));
        name.setForeground(java.awt.Color.WHITE);
        panel.add(name);

        t1 = new JTextField();
        t1.setBounds(250,70,200,30);
        t1.setBackground(new java.awt.Color(16,108,115));
        t1.setFont(new Font("Serif",Font.BOLD,20));
        t1.setForeground(java.awt.Color.WHITE);
        panel.add(t1);

        JLabel age = new JLabel("AGE");
        age.setBounds(50,110,150,30);
        age.setBackground(new java.awt.Color(3,45,48));
        age.setFont(new Font("Serif",Font.BOLD,22));
        age.setForeground(java.awt.Color.WHITE);
        panel.add(age);

        t2 = new JTextField();
        t2.setBounds(250,110,200,30);
        t2.setBackground(new java.awt.Color(16,108,115));
        t2.setFont(new Font("Serif",Font.BOLD,20));
        t2.setForeground(java.awt.Color.WHITE);
        panel.add(t2);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(50,150,150,30);
        gender.setBackground(new java.awt.Color(3,45,48));
        gender.setFont(new Font("Serif",Font.BOLD,22));
        gender.setForeground(java.awt.Color.WHITE);
        panel.add(gender);

        t3 = new JComboBox(new String[]{"MALE","FEMALE"});
        t3.setBounds(250,150,200,30);
        t3.setBackground(new java.awt.Color(16,108,115));
        t3.setFont(new Font("Serif",Font.BOLD,20));
        t3.setForeground(java.awt.Color.WHITE);
        panel.add(t3);

        JLabel carCompany = new JLabel("CAR COMPANY");
        carCompany.setBounds(50,190,200,30);
        carCompany.setBackground(new java.awt.Color(3,45,48));
        carCompany.setFont(new Font("Serif",Font.BOLD,22));
        carCompany.setForeground(java.awt.Color.WHITE);
        panel.add(carCompany);

        t4 = new JTextField();
        t4.setBounds(250,190,200,30);
        t4.setBackground(new java.awt.Color(16,108,115));
        t4.setFont(new Font("Serif",Font.BOLD,20));
        t4.setForeground(java.awt.Color.WHITE);
        panel.add(t4);

        JLabel carn = new JLabel("CAR NAME");
        carn.setBounds(50,230,150,30);
        carn.setBackground(new java.awt.Color(3,45,48));
        carn.setFont(new Font("Serif",Font.BOLD,22));
        carn.setForeground(java.awt.Color.WHITE);
        panel.add(carn);

        t5 = new JTextField();
        t5.setBounds(250,230,200,30);
        t5.setBackground(new java.awt.Color(16,108,115));
        t5.setFont(new Font("Serif",Font.BOLD,20));
        t5.setForeground(java.awt.Color.WHITE);
        panel.add(t5);

        JLabel ava = new JLabel("AVAILABLE");
        ava.setBounds(50,270,150,30);
        ava.setBackground(new java.awt.Color(3,45,48));
        ava.setFont(new Font("Serif",Font.BOLD,22));
        ava.setForeground(java.awt.Color.WHITE);
        panel.add(ava);

        t6 = new JTextField();
        t6.setBounds(250,270,200,30);
        t6.setBackground(new java.awt.Color(16,108,115));
        t6.setFont(new Font("Serif",Font.BOLD,20));
        t6.setForeground(java.awt.Color.WHITE);
        panel.add(t6);

        JLabel loc = new JLabel("LOCATION");
        loc.setBounds(50,310,150,30);
        loc.setBackground(new java.awt.Color(3,45,48));
        loc.setFont(new Font("Serif",Font.BOLD,22));
        loc.setForeground(java.awt.Color.WHITE);
        panel.add(loc);

        t7 = new JTextField();
        t7.setBounds(250,310,200,30);
        t7.setBackground(new java.awt.Color(16,108,115));
        t7.setFont(new Font("Serif",Font.BOLD,20));
        t7.setForeground(java.awt.Color.WHITE);
        panel.add(t7);

        b1 = new JButton("SUBMIT");
        b1.setBounds(50,400,110,30);
        b1.setBackground(java.awt.Color.BLACK);
        b1.setForeground(java.awt.Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(170,400,110,30);
        b2.setBackground(java.awt.Color.BLACK);
        b2.setForeground(java.awt.Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("Icon/license.png"));
        Image i1 = image.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(550,110,250,250);
        panel.add(label);

        




        setLayout(null);
        setSize(900,500);
        setLocation(20,100);
        setVisible(true);
        


    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource() == b1){
            String name = t1.getText();
            String age = t2.getText();
            String gender = (String) t3.getSelectedItem();
            String carc = t4.getText();
            String carn = t5.getText();
            String ava = t6.getText();
            String loc = t7.getText();
            if (name.isEmpty()||age.isEmpty()||carc.isEmpty()||carn.isEmpty()||ava.isEmpty()||loc.isEmpty()||gender==null) {
                JOptionPane.showMessageDialog(null,"Form is empty fill all the fields");
                return;
                
            }


            try {
                

            conn c = new conn();
            String q = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+carc+"','"+carn+"','"+ava+"','"+loc+"')";
            c.statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Driver Added");
            setVisible(false);
            }
            
        
         catch (Exception E){
                // TODO: handle exception
                E.printStackTrace();
            }
        }else{
            new Admin();
        }

    }
        
    public static void main(String[] args) {
        new Driver();
        
    }
    
}
