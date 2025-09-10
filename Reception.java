import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Reception extends JFrame  {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(320,5,1030,725);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/cccc.gif"));
        Image i2 = imageIcon.getImage().getScaledInstance(850,850,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(120,10,850,850);
        panel.add(label1);


        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(5,5,310,725);
        panel2.setBackground(new Color(3,45,48));
        add(panel2);

        
        JButton btncf = new JButton("New Customer form");
        btncf.setBounds(50,30,200,30);
        btncf.setBackground(Color.black);
        btncf.setForeground(Color.white);
        panel2.add(btncf);
        btncf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new Customer();
                    
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton btnroom = new JButton("Room");
        btnroom.setBounds(50,70,200,30);
        btnroom.setBackground(Color.black);
       btnroom.setForeground(Color.white);
       panel2.add(btnroom);
       btnroom.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            new Rooms();
        }
       });
       
       

         JButton btnDe = new JButton("Department");
        btnDe.setBounds(50,110,200,30);
        btnDe.setBackground(Color.black);
        btnDe.setForeground(Color.white);
        panel2.add(btnDe);
        btnDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new Dep();
             
            }
        });
    

         JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(50,150,200,30);
        btnAEI.setBackground(Color.black);
        btnAEI.setForeground(Color.white);
        panel2.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               new EmployeeInfo();
          


            }
        });

         JButton btnCI = new JButton("Customer Info");
         btnCI.setBounds(50,190,200,30);
        btnCI.setBackground(Color.black);
         btnCI.setForeground(Color.white);
         panel2.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new CustomerInfo();
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton btnM = new JButton("Manager Info");
        btnM.setBounds(50,230,200,30);
        btnM.setBackground(Color.black);
        btnM.setForeground(Color.white);
        panel2.add(btnM);
        btnM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    if(e.getSource()==btnM){
                        
                    }
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton btnCh = new JButton("Check Out");
        btnCh.setBounds(50,270,200,30);
        btnCh.setBackground(Color.black);
        btnCh.setForeground(Color.white);
        panel2.add(btnCh);
        btnCh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new Check_out();
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton btnUC = new JButton("Update Check-Details");
        btnUC.setBounds(50,310,200,30);
        btnUC.setBackground(Color.black);
        btnUC.setForeground(Color.white);
        panel2.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new Check_in();
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton btnUR = new JButton("Update Room Status");
        btnUR.setBounds(50,350,200,30);
        btnUR.setBackground(Color.black);
        btnUR.setForeground(Color.white);
        panel2.add(btnUR);
        btnUR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new Update_room();
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton btnP = new JButton("Pick Up Service");
        btnP.setBounds(50,390,200,30);
        btnP.setBackground(Color.black);
        btnP.setForeground(Color.white);
        panel2.add(btnP);
        btnP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new Pick_up_service();
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton btnS = new JButton("Search Room");
        btnS.setBounds(50,430,200,30);
        btnS.setBackground(Color.black);
        btnS.setForeground(Color.white);
        panel2.add(btnS);
        btnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new Room_search();
                    
                
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

         JButton back = new JButton("BACK");
        back.setBounds(50,690,120,25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel2.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                 try {
                    new Dashboard();
                    setVisible(false);
            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }


            }
        });

       
           
        

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = image.getImage().getScaledInstance( 250,250,Image.SCALE_DEFAULT);
        ImageIcon image1 = new ImageIcon(i1);
        JLabel label2 = new JLabel(image1);
        label2.setBounds(30,460,250,250);
        panel2.add(label2);

       
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1375,800);
        setVisible(true);

    }
    
    public static void main(String[] args) {
        new Reception();

    }
    
}
