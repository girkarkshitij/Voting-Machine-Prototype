//admin operations

import javax.swing.*;
import java.io.FileInputStream;
import java.sql.*;


class Admin
{
    JFrame f = new JFrame("Admin");
    JButton addvoter,update,list,result;
    JDialog di;
    private Connection myConn;

    Admin()
    {
        addvoter = new JButton("Add Voter");
        update = new JButton("Update Voter");
        list = new JButton("Voter List");
        result = new JButton("Result");

        addvoter.addActionListener(ae->
        {
            Addvoter obj = new Addvoter();
            f.dispose();
        });
        result.addActionListener(ae->
        {
            Result obj = new Result();
            f.dispose();
        });

        f.add(addvoter);
        f.add(update);
        f.add(list);
        f.add(result);

        addvoter.setBounds(170,100,200,50);
        update.setBounds(170,200,200,50);
        list.setBounds(170,300,200,50);
        result.setBounds(170,400,200,50);

        //Frame settings
        f.setSize(600,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
