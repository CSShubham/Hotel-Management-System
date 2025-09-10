import javax.swing.*;

import javafx.scene.control.ComboBox;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Customer extends JFrame implements ActionListener {
    JComboBox comboBox;
    JButton add,back;
    JRadioButton male,female;
    JTextField numField , namField, stateField,depositeField;
    Choice c1;
    JLabel date;

    Customer(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel label = new JLabel("New Customer Form");
        label.setBounds(118,11,260,53);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        label.setForeground(Color.white);
        panel.add(label);

         JLabel Id = new JLabel("ID");
        Id.setBounds(35,76,150,25);
        Id.setFont(new Font("Tahoma",Font.PLAIN,20));
        Id.setForeground(Color.white);
        panel.add(Id);

        comboBox = new JComboBox(new String[]{"Adhar Card","Passport","Driving License","Voter ID"});
        comboBox.setBounds(240,76,200,25);
        comboBox.setFont(new Font("Tahoma",Font.PLAIN,18));
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.white);
        panel.add(comboBox);

         JLabel number = new JLabel("Number");
        number.setBounds(35,111,200,25);
        number.setFont(new Font("Tahoma",Font.PLAIN,20));
        number.setForeground(Color.white);
        panel.add(number);

        numField = new JTextField();
        numField.setBounds(240,111,200,25);
        numField.setFont(new Font("Tahoma",Font.PLAIN,18));
        numField.setBackground(new Color(16,108,115));
        numField.setForeground(Color.white);
        panel.add(numField);

        
         JLabel name = new JLabel("Name");
        name.setBounds(35,146,200,25);
        name.setFont(new Font("Tahoma",Font.PLAIN,20));
        name.setForeground(Color.white);
        panel.add(name);

        namField = new JTextField();
        namField.setBounds(240,146,200,25);
        namField.setFont(new Font("Tahoma",Font.PLAIN,18));
        namField.setBackground(new Color(16,108,115));
        namField.setForeground(Color.white);
        panel.add(namField);

         JLabel Gender = new JLabel("Gender");
        Gender.setBounds(35,181,200,25);
        Gender.setFont(new Font("Tahoma",Font.PLAIN,20));
        Gender.setForeground(Color.white);
        panel.add(Gender);

        male = new JRadioButton("Male");
        male.setBounds(240,181,70,25);
        male.setFont(new Font("Tahoma",Font.PLAIN,18));
        male.setBackground(new Color(3,45,48));
        male.setForeground(Color.white);
        panel.add(male);

        female = new JRadioButton("Female");
        female.setBounds(320,181,100,25);
        female.setFont(new Font("Tahoma",Font.PLAIN,18));
        female.setBackground(new Color(3,45,48));
        female.setForeground(Color.white);
        panel.add(female);

        javax.swing.ButtonGroup genderGroup = new javax.swing.ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);



        
         JLabel state = new JLabel("Country & State");
        state.setBounds(35,216,200,25);
        state.setFont(new Font("Tahoma",Font.PLAIN,20));
        state.setForeground(Color.white);
        panel.add(state);

        stateField = new JTextField();
        stateField.setBounds(240,216,200,25);
        stateField.setFont(new Font("Tahoma",Font.PLAIN,18));
        stateField.setBackground(new Color(16,108,115));
        stateField.setForeground(Color.white);
        panel.add(stateField);


         JLabel room = new JLabel("Allocated Rooms");
        room.setBounds(35,251,200,25);
        room.setFont(new Font("Tahoma",Font.PLAIN,20));
        room.setForeground(Color.white);
        panel.add(room);

        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while(resultSet.next()){
                c1.add(resultSet.getString("RoomNo"));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        c1.setBounds(240,251,200,25);
        c1.setFont(new Font("Tahoma",Font.PLAIN,18));
        c1.setBackground(new Color(3,45,48));
        c1.setForeground(Color.white);
        panel.add(c1);

         
         JLabel check = new JLabel("Checked In");
        check.setBounds(35,286,200,25);
        check.setFont(new Font("Tahoma",Font.PLAIN,20));
        check.setForeground(Color.white);
        panel.add(check);

        Date date1 = new Date();


        date = new JLabel(""+date1);
        date.setBounds(240,286,200,25);
        date.setFont(new Font("Tahoma",Font.PLAIN,18));
        date.setBackground(new Color(16,108,115));
        date.setForeground(Color.white);
        panel.add(date);

        JLabel deposite = new JLabel("Deposite");
        deposite.setBounds(35,321,200,25);
        deposite.setFont(new Font("Tahoma",Font.PLAIN,20));
        deposite.setForeground(Color.white);
        panel.add(deposite);

        depositeField = new JTextField();
        depositeField.setBounds(240,321,200,25);
        depositeField.setFont(new Font("Tahoma",Font.PLAIN,18));
        depositeField.setBackground(new Color(16,108,115));
        depositeField.setForeground(Color.white);
        panel.add(depositeField);

        add = new JButton("SUBMIT");
        add.setBounds(70,400,130,30);
       
        add.setBackground(Color.BLACK);
        add.setForeground(Color.white);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(250,400,130,30);
        
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imLabel = new JLabel(imageIcon1);
        imLabel.setBounds(550,150,200,200);
        panel.add(imLabel);

        setLayout(null);
        setSize(850,550);
        setLocation(400,100);
        setVisible(true);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent E) {
        if (E.getSource() == add) {
            conn c = new conn();
            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }else if(female.isSelected()){
                gender = "Female";
            }
           

        String s1 = (String) comboBox.getSelectedItem();
        String s2 =  numField.getText();
        String s3 = namField.getText();
        String s4 = gender;
        String s5 = stateField.getText();
        String s6 = c1.getSelectedItem();
        String s7 = date.getText();
        String s8 = depositeField.getText();
        if(s2.isEmpty()||s3.isEmpty()||gender==null||s5.isEmpty()||s6.isEmpty()||s7.isEmpty()||s8.isEmpty()){
            JOptionPane.showMessageDialog(null,"Form is empty fill all the fields");
            return;

        }

        try {
            String q = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
            String q1 = "update room set Available = 'Occupied' where RoomNo = "+s6;
            c.statement.executeUpdate(q);
            c.statement.executeUpdate(q1);
            JOptionPane.showMessageDialog(null, "Customer added");


            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }



           

           
            
        } else if (E.getSource() == back) {
            setVisible(false);
            // Handle back button click
        }
    }
    public static void main(String[] args) {
        new Customer();
        
    }
    
}
