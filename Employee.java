import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;




public class Employee extends JFrame implements ActionListener{
    JTextField t2,t3,t6,t7,t8,t9;
    JRadioButton radioM,radioF;
    JComboBox<String> t5;
    JButton Add,Back;
    Employee(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 490);
        panel.setBackground(new java.awt.Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel l1 = new JLabel("ADD EMPLOYEE DETAILS");
        l1.setBounds(550,30,250,30);
        l1.setForeground(java.awt.Color.WHITE);
        l1.setFont(new Font("Serif",Font.BOLD,18));
        panel.add(l1);


        JLabel l2 = new JLabel("NAME");
        l2.setBounds(50,70,150,25);
        l2.setForeground(java.awt.Color.WHITE);
        l2.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(200,70,200,25);
        t2.setFont(new Font("serif",Font.BOLD,18));
        t2.setForeground(java.awt.Color.WHITE);
        t2.setBackground(new ColorUIResource(3,108,115));    
        panel.add(t2);


        JLabel l3 = new JLabel("AGE");
        l3.setBounds(50,110,150,25);
        l3.setForeground(java.awt.Color.WHITE);
        l3.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l3);

        t3 = new JTextField();
        t3.setBounds(200,110,200,25);
        t3.setFont(new Font("serif",Font.BOLD,18));
        t3.setForeground(java.awt.Color.WHITE);
        t3.setBackground(new ColorUIResource(3,108,115));    
        panel.add(t3);

        JLabel l4 = new JLabel("GENDER");
        l4.setBounds(50,150,150,25);
        l4.setForeground(java.awt.Color.WHITE);
        l4.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l4);

        radioM = new JRadioButton();
        radioM.setText("MALE");
        radioM.setBounds(200,150,80,25);
        radioM.setBackground(new java.awt.Color(3,45,48));
        radioM.setForeground(java.awt.Color.WHITE);
        radioM.setFont(new Font("Serif",Font.BOLD,18));
        panel.add(radioM);

        radioF = new JRadioButton();
        radioF.setText("FEMALE");
        radioF.setBounds(290,150,100,25);
        radioF.setBackground(new java.awt.Color(3,45,48));
        radioF.setForeground(java.awt.Color.WHITE);
        radioF.setFont(new Font("Serif",Font.BOLD,18));
        panel.add(radioF);

        // Group radio buttons so only one can be selected
        javax.swing.ButtonGroup genderGroup = new javax.swing.ButtonGroup();
        genderGroup.add(radioM);
        genderGroup.add(radioF);


         JLabel l5 = new JLabel("JOB");
        l5.setBounds(50,190,150,25);
        l5.setForeground(java.awt.Color.WHITE);
        l5.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l5);

        t5 = new JComboBox<>(new String[]{"Manager","Front Desk","Chef","HouseKeeping","Accountant","Security"});
        t5.setBounds(200,190,200,25);
        t5.setBackground(new java.awt.Color(3,45,48));
        t5.setFont(new Font("Serif",Font.BOLD,18));
        t5.setForeground(java.awt.Color.WHITE);
        panel.add(t5);

         JLabel l6 = new JLabel("SALARY");
        l6.setBounds(50,230,150,25);
        l6.setForeground(java.awt.Color.WHITE);
        l6.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l6);

        t6 = new JTextField();
        t6.setBounds(200,230,200,25);
        t6.setFont(new Font("serif",Font.BOLD,18));
        t6.setForeground(java.awt.Color.WHITE);
        t6.setBackground(new ColorUIResource(3,108,115));    
        panel.add(t6);

         JLabel l7 = new JLabel("PHONE");
        l7.setBounds(50,270,150,25);
        l7.setForeground(java.awt.Color.WHITE);
        l7.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l7);

        t7 = new JTextField();
        t7.setBounds(200,270,200,25);
        t7.setFont(new Font("serif",Font.BOLD,18));
        t7.setForeground(java.awt.Color.WHITE);
        t7.setBackground(new ColorUIResource(3,108,115));    
        panel.add(t7);

         JLabel l8 = new JLabel("E-mail");
        l8.setBounds(50,310,150,25);
        l8.setForeground(java.awt.Color.WHITE);
        l8.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l8);

        t8 = new JTextField();
        t8.setBounds(200,310,200,25);
        t8.setFont(new Font("serif",Font.BOLD,18));
        t8.setForeground(java.awt.Color.WHITE);
        t8.setBackground(new ColorUIResource(3,108,115));    
        panel.add(t8);
        
         JLabel l9 = new JLabel("ADHAR CARD");
        l9.setBounds(50,350,150,25);
        l9.setForeground(java.awt.Color.WHITE);
        l9.setFont(new Font("Serif",Font.BOLD,22));
        panel.add(l9);

        t9 = new JTextField();
        t9.setBounds(200,350,200,25);
        t9.setFont(new Font("serif",Font.BOLD,18));
        t9.setForeground(java.awt.Color.WHITE);
        t9.setBackground(new ColorUIResource(3,108,115));    
        panel.add(t9);

        Add = new JButton("SUBMIT");
        Add.setBounds(50, 400, 130, 30);
        Add.setBackground(java.awt.Color.BLACK);
        Add.setForeground(java.awt.Color.WHITE);
        Add.setFont(new Font("Serif", Font.BOLD, 22));
        Add.addActionListener(this);
        panel.add(Add);

        Back = new JButton("BACK");
        Back.setBounds(200, 400, 100, 30);
        Back.setBackground(java.awt.Color.BLACK);
        Back.setForeground(java.awt.Color.WHITE);
        Back.setFont(new Font("Serif", Font.BOLD, 22));
        Back.addActionListener(this);
        panel.add(Back);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("Icon/addemp.png"));
        Image i1 = image.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(500,70,300,300);
        panel.add(label);


        setLayout(null);
        setLocation(20, 100);
        setSize(900, 500);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Add){
            
            String name = t2.getText();
            String age = t3.getText();
            String gender = null;
            if(radioM.isSelected()){
                gender = "Male";
            }else if(radioF.isSelected()){
                gender = "Female";
            }
            String job = (String) t5.getSelectedItem();
            String salary = t6.getText();
            String phone = t7.getText();
            String email = t8.getText();
            String adhar = t9.getText();
            if(name.isEmpty()|| age.isEmpty()||salary.isEmpty()||phone.isEmpty()||email.isEmpty()||adhar.isEmpty()||gender==null){
                JOptionPane.showMessageDialog(null, "Form is empty fill all the fields");
                return;
            }
            try{

            conn c = new conn();
            String q = "insert into employee(Name,Age,Gender,Job,Salary,Phone,Email,Adhar) values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+adhar+"')";
            c.statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Employee Added Successfully");
            setVisible(false);
            

            
        } 
        catch (Exception  E) {
            // TODO: handle exception
            E.printStackTrace();
        }
    }
        else{
            new Admin();
            setVisible(false);
        }
      
    }


    public static void main(String[] args) {
        new Employee();
    }
    
}
