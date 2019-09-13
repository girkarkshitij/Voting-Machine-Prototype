import javax.swing.*;

public class MyEVM
{
    JFrame f= new JFrame("Log In");
    JButton admin,voter;

    public MyEVM()
    {
        admin = new JButton("Admin");
        voter = new JButton("Voter");

        admin.addActionListener(ae ->                   //Lambda expression
        {
            f.dispose();
            AdminLogin p2 = new AdminLogin();
        });

        voter.addActionListener(ae ->
        {
            f.dispose();
            VoterLogin p3 = new VoterLogin();
        });

        f.add(admin);
        f.add(voter);

        admin.setBounds(170,250,200,60);
        voter.setBounds(170,400,200,60);

        //Frame settings
        f.setSize(600,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        MyEVM p1 = new MyEVM();
    }
}
