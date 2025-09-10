import java.awt.Color;
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
import javax.swing.JTextField;

public class Room extends JFrame implements ActionListener {
    JTextField t2, t4;
    JComboBox t3, t5, t6;
    JButton b1, b2;

    Room() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel l1 = new JLabel("ADD ROOMS DETAILS");
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setBounds(500, 20, 300, 30);
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l2.setBounds(50, 70, 170, 20);
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(250, 70, 165, 25);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t2.setBackground(new Color(16, 108, 115));
        t2.setForeground(Color.WHITE);
        panel.add(t2);

        JLabel l3 = new JLabel("AVAILABLE");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l3.setBounds(50, 110, 170, 20);
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 = new JComboBox<>(new String[] { "Available", "Occupied" });
        t3.setBounds(250, 110, 165, 25);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t3.setBackground(new Color(16, 108, 115));
        t3.setForeground(Color.WHITE);
        panel.add(t3);

        JLabel l4 = new JLabel("PRICE");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l4.setBounds(50, 150, 170, 20);
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 = new JTextField();
        t4.setBounds(250, 150, 165, 25);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t4.setBackground(new Color(16, 108, 115));
        t4.setForeground(Color.WHITE);
        panel.add(t4);

        JLabel l5 = new JLabel("STATUS");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l5.setBounds(50, 190, 170, 20);
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 = new JComboBox<>(new String[] { "Cleaned", "Dirty" });
        t5.setBounds(250, 190, 165, 25);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t5.setBackground(new Color(16, 108, 115));
        t5.setForeground(Color.WHITE);
        panel.add(t5);

        JLabel l6 = new JLabel("BED TYPE");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l6.setBounds(50, 230, 170, 20);
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        t6 = new JComboBox<>(new String[] { "Single Bed", "Ac Single Bed", "Double Bed", "Ac Double Bed" });
        t6.setBounds(250, 230, 165, 25);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        t6.setBackground(new Color(16, 108, 115));
        t6.setForeground(Color.WHITE);
        panel.add(t6);

        b1 = new JButton("SUBMIT");
        b1.setBounds(20, 350, 120, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(175, 350, 120, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);

        setLayout(null);
        setLocation(20, 100);
        setSize(885, 500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                conn c = new conn();

                String room = t2.getText();
                String ava = (String) t3.getSelectedItem();
                String price = t4.getText();
                String status = (String) t5.getSelectedItem();
                String type = (String) t6.getSelectedItem();
                if (room.isEmpty()||ava.isEmpty()||price.isEmpty()||status.isEmpty()||type.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Form is Empty fill all the fields");
                    return;
                    
                }

                String q = "insert into room (RoomNo,Available,Price,CleanStatus ,BedType) values('" + room + "','" + ava
                        + "','" + price + "','" + status + "','" + type + "')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Room Added Successfully");
                setVisible(false);

            } catch (Exception E) {
                // TODO: handle exception
                E.printStackTrace();
            }

        } else {
            new Admin();
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Room();

    }

}
