import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dashboard extends JFrame implements ActionListener{


    JButton add,rec;
    

    Dashboard(){
        super("Hotel Management System");

        rec = new JButton("RECEPTION");
        
        rec.setBounds(425,500,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);
        
        ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i3 = i12.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(i3);
        JLabel label3 = new JLabel(imageIcon12);
        label3.setBounds(400, 305, 200, 195);
        add(label3);

        add = new JButton("ADMIN");

        add.setBounds(825,500,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = i11.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label2 = new JLabel(imageIcon11);
        label2.setBounds(790, 300, 200, 195);
        add(label2);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1378, 1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1378,1090);
        add(label);


        setLayout(null);
        setSize(1378,1090);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            new Login2();
            setVisible(false);
        }
        else{
            new Reception();
            setVisible(false);
            
        }

    }
    public static void main(String[] args) {
        new Dashboard();
    }
    
}
