import javax.swing.*;

class VoterLogin
{

    JFrame f= new JFrame("Voter Login");
    JLabel userlabel ,passlabel,title;
    JButton login,reset,exit;
    JTextField user;
    JPasswordField pass;

    VoterLogin() {
        title = new JLabel("VOTER LOGIN");
        userlabel = new JLabel("User ID");
        passlabel = new JLabel("Password");
        user = new JTextField(20);
        pass = new JPasswordField(20);
        login = new JButton("Login");
        reset = new JButton("Reset");
        exit = new JButton("Exit");

        login.addActionListener(ae ->
        {
            Voter obj = new Voter();
            f.dispose();
        });
        reset.addActionListener(ae ->
        {
            pass.setText(null);
            user.setText(null);
        });

        exit.addActionListener(ae ->
        {
            System.exit(0);
        });

        f.add(title);
        f.add(userlabel);
        f.add(passlabel);
        f.add(user);
        f.add(pass);
        f.add(reset);
        f.add(login);
        f.add(exit);

        title.setBounds(200, 100, 400, 100);
        userlabel.setBounds(50, 200, 100, 30);
        user.setBounds(110, 200, 100, 30);
        passlabel.setBounds(50, 250, 100, 30);
        pass.setBounds(110, 250, 100, 30);
        login.setBounds(50, 300, 100, 30);
        reset.setBounds(50, 350, 100, 30);
        exit.setBounds(50, 400, 100, 30);

        //Frame settings
        f.setSize(600, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}