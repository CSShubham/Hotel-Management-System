import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Splash extends JFrame{
    Splash(){
        super("Hotel Management System");
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);
        
        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

        try {
            Thread.sleep(5000);
             new Login();
             setVisible(false);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();
        
    }
}