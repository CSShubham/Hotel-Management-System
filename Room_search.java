import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room_search extends JFrame implements ActionListener{
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add, back;
    Room_search (){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(true);

        JLabel label = new JLabel("Search For Room");
        label.setBounds(260,11,250,31);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(label);

        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(550,69,300,28);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.add("Ac Single Bed");
        choice.add("Ac Double Bed");
        choice.setBounds(230,69,170,25);
        choice.setForeground(Color.WHITE);
        choice.setBackground(new Color(3,45,48));
        choice.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(choice);

        table = new JTable();
        table.setBounds(0,187,890,150);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        JLabel room = new JLabel("Room Number");
        room.setBounds(30,162,150,20);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel.add(room);

        JLabel label2 = new JLabel("Room Bed Type:");
        label2.setBounds(30,69,200,31);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label2);

         JLabel ava = new JLabel("Available");
        ava.setBounds(230,162,170,20);
        ava.setForeground(Color.WHITE);
        ava.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel.add(ava);

        
         JLabel price = new JLabel("Price");
        price.setBounds(430,162,150,20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel.add(price);

          JLabel status = new JLabel("Status");
        status.setBounds(600,162,150,20);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel.add(status);

        
          JLabel type = new JLabel("Bed Type");
        type.setBounds(760,162,150,20);
        type.setForeground(Color.WHITE);
        type.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel.add(type);

        add = new JButton("Search");
        add.setBounds(200,500,100,25);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        panel.add(add);
        add.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(400,500,100,25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
          back.addActionListener(this);


        try {

            conn c = new conn();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        setLocation(400,100);
        setSize(900,600);
        setLayout(null);
        setVisible(true);
        
    }
     
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==add){
                String Q = "select * from room where BedType = '"+choice.getSelectedItem()+"'";
                String Q1 = "select * from room where Available = 'Available' And BedType = '"+choice.getSelectedItem()+"'";
                try {
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery(Q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));


                    if(checkBox.isSelected()){
                        ResultSet resultSet1 = c.statement.executeQuery(Q1);
                        table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                    }
                    
                } catch (Exception E) {
                    // TODO: handle exception
                    E.printStackTrace();
                }
                }
                
                if(e.getSource()==back){
                    setVisible(false);
                }
            }

  
    public static void main(String[] agrs){
        new Room_search();
    }
}

