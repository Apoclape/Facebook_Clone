import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FaceBook extends MouseAdapter implements ActionListener
{
    JPanel p,p1;
    JFrame f;
    JLabel l,l1,l2,l3,l4,l5,l6,l7;
    JLabel jl;
    JLabel propic,banner;
    JButton b,b1,b2;
    Font fo= new Font(Font.SANS_SERIF, Font.BOLD, 20);
    Font fo1= new Font(Font.SANS_SERIF, Font.BOLD, 14);
    Font fo2= new Font(Font.SANS_SERIF, Font.PLAIN, 12);
    Color c,c1;
    Container con,con1;
    FaceBook()
    {
        // CREATING FRAME
        f=new JFrame();
        f.setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        f.setTitle("Facebook");
        f.setSize(385, 660);

        // CREATING PANEL 1
        p=new JPanel();
        p.setBounds(0, 0, 385, 660);

        // CREATING PANEL 2
        p1=new JPanel();
        p1.setBounds(0, 0, 385, 660);

        // ADDING PANEL TO JFRAME
        // f.add(p1);
        f.add(p);

        // COMMON CODE
        con= f.getContentPane();
        con1= f.getContentPane();
        propic=new JLabel();
        banner=new JLabel();
        propic.setIcon(new ImageIcon("propic.png"));
        banner.setIcon(new ImageIcon("banner.jpg"));
        l=new JLabel("Sayan Shil");
        c=new Color(25,25,255);
        c1=new Color(255,255,255);
        l1=new JLabel("Studies Computer Science at Ananda Chandra College");
        l2=new JLabel("Went to Jalpaiguri Zilla School");
        l3=new JLabel("Went to Pandapara Sarada Shishutirtha Estd 1987");
        l4=new JLabel("Lives in Jalpaiguri");
        l5=new JLabel("From Jalpaiguri");
        l6=new JLabel("Friends");
        l7=new JLabel("314 friends");
        jl=new JLabel("Drawing    Writing    Photography    Film-making");
        b=new JButton("Add Friend");
        b1=new JButton("Message");
        b2=new JButton("...");
        b.setBackground(c);
        b.setForeground(c1);
        propic.setBounds(0, 0, 100, 100);
        l.setFont(fo);
        l6.setFont(fo1);
        // p.add(l);
        // p.add(b);
        // p.add(b1);
        // p.add(b2);
        // p.add(l1);
        // p.add(l2);
        // p.add(l3);
        // p.add(l4);
        // p.add(l5);
        // p.add(l6);
        // p.add(l7);
        // p.add(jl);
        p.add(propic);
        // p.add(banner);
        b.addActionListener(this);
        b1.addActionListener(this);
        propic.addMouseListener(this);
        banner.addMouseListener(this);
        f.setVisible(true);
        p.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            p.setVisible(false);
            p1.setVisible(true);
        }
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==propic)
        {
            f.setVisible(false);
            // new ProPic();
        }
        else if(me.getSource()==banner)
        {
            f.setVisible(false);
            // new BannerPic();
        }
    }
}

class Run1
{
    public static void main(String[] args) {
        new FaceBook();
    }
}