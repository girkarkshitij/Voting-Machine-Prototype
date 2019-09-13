//adding voter data and insert it into the database

import javax.swing.*;
import java.sql.*;

class Addvoter
{
    JFrame f;
    JButton insert;
    JTextField firstname;
    private Connection myConn;
    Addvoter()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin1223");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Exception:" + e.getMessage());
        }
        catch (SQLException e)
        {
            System.out.println("SQL exception "+e.getMessage());
        }

        f= new JFrame("Add New Voter");
        firstname = new JTextField(30);
        String fnamestring = firstname.getText();
        insert= new JButton("insert");

        f.add(firstname);
        f.add(insert);

        firstname.setBounds(100,100,100,30);
        insert.setBounds(200,100,100,30);

        /*insert.addActionListener(ae->
        {
            try
            {

            }
        });*/
        //Frame settings
        f.setSize(600,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            myConn.close();
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
