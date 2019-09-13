import javax.swing.*;

class AdminLogin
{
    JFrame f= new JFrame("Admin Login");
    JLabel userlabel ,passlabel,title;
    JButton login,reset,exit;
    JTextField user;
    JPasswordField pass;

    AdminLogin()
    {
        title = new JLabel("ADMIN LOGIN");
        userlabel = new JLabel("User name");
        passlabel = new JLabel("Password");
        user = new JTextField(20);
        pass = new JPasswordField(20);
        login = new JButton("Login");
        reset = new JButton("Reset");
        exit = new JButton("Exit");

        login.addActionListener(ae ->                   //Admin page will be opened
        {
            String password = String.valueOf(pass.getPassword());
            String username = user.getText();

            if(password.contains("admin123") && username.contains("admin"))
            {
                    f.dispose();
                    Admin p3 = new Admin();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Login Details",
                        "Login Error",JOptionPane.ERROR_MESSAGE);
            }
        });

        reset.addActionListener(ae ->
        {
            pass.setText(null);
            user.setText(null);
        });

        exit.addActionListener(ae->
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

        title.setBounds(200,100,400,100);
        userlabel.setBounds(50,200,100,30);
        user.setBounds(110,200,100,30);
        passlabel.setBounds(50,250,100,30);
        pass.setBounds(110,250,100,30);
        login.setBounds(50,300,100,30);
        reset.setBounds(50,350,100,30);
        exit.setBounds(50,400,100,30);

        //Frame settings
        f.setSize(600,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}