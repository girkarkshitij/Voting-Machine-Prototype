import javax.swing.*;

class Voter
{
    JFrame f = new JFrame("EVM");
    JLabel label,labBjp,labInc,labAap,labBsp,labCpi;
    JButton bjp,inc,aap,bsp,cpi;
    public Voter()
    {
        //Labels and buttons
        label = new JLabel("Cast your vote");
        labBjp = new JLabel("BJP");
        labAap = new JLabel("AAP");
        labBsp = new JLabel("BSP");
        labInc = new JLabel("INC");
        labCpi = new JLabel("CPI");
        bjp = new JButton();
        bsp = new JButton();
        aap = new JButton();
        inc = new JButton();
        cpi = new JButton();

        //Frame settings
        f.setSize(600,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adding all the components to frame
        f.add(label);
        f.add(labAap);
        f.add(labBjp);
        f.add(labBsp);
        f.add(labInc);
        f.add(labCpi);
        f.add(bjp);
        f.add(inc);
        f.add(bsp);
        f.add(cpi);
        f.add(aap);

        //setbound for each component
        label.setBounds(250,50,100,100);
        labAap.setBounds(120,100,100,80);
        labBjp.setBounds(120,200,100,80);
        labBsp.setBounds(120,300,100,80);
        labInc.setBounds(120,400,100,80);
        labCpi.setBounds(120,500,100,80);
        aap.setBounds(420,110,100,50);
        bjp.setBounds(420,210,100,50);
        bsp.setBounds(420,310,100,50);
        inc.setBounds(420,410,100,50);
        cpi.setBounds(420,510,100,50);
    }
}
