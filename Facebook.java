import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FacebookSayan extends MouseAdapter implements ActionListener
{
    JFrame f=new JFrame();
    JLabel l,l1,l2,l3,l4,l5,l6,l7;
    JLabel jl;
    JLabel propic,banner,picture1,picture2,picture3;
    JButton b,b1,b2;
    Font fo= new Font(Font.SANS_SERIF, Font.BOLD, 20);
    Font fo1= new Font(Font.SANS_SERIF, Font.BOLD, 14);
    Font fo2= new Font(Font.SANS_SERIF, Font.PLAIN, 12);
    Color c,c1;
    Container con,con1,con2,con3,con4;
    FacebookSayan()
    {
        f.setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        // Image icon=Toolkit.getDefaultToolkit().getImage("fb.jpg");
        f.setTitle("facebook");
        // f=new JFrame();
        con= f.getContentPane();
        con1= f.getContentPane();
        con2= f.getContentPane();
        con3= f.getContentPane();
        con4= f.getContentPane();
        propic=new JLabel();
        banner=new JLabel();
        picture1=new JLabel();
        picture2=new JLabel();
        picture3=new JLabel();
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
        // jl1=new JLabel("Writing");
        // jl2=new JLabel("Photography");
        // jl3=new JLabel("Film-making");
        b=new JButton("Add Friend");
        b1=new JButton("Message");
        b2=new JButton("...");
        f.setSize(385,660);
        b.setBackground(c);
        b.setForeground(c1);
        b.setBounds(20, 230, 140, 40);
        b1.setBounds(165, 230, 140, 40);
        b2.setBounds(310,230,40,40);
        l.setBounds(20,180,160,40);
        l1.setBounds(20,280,365,15);
        l2.setBounds(20, 300, 365, 15);
        l3.setBounds(20, 320, 365, 15);
        l4.setBounds(20, 340, 365, 15);
        l5.setBounds(20, 360, 365, 15);
        l6.setBounds(20,420,365,20);
        l7.setBounds(20, 440, 80, 10);
        jl.setBounds(20,390,400,20);
        propic.setBounds(20,80,100,100);
        banner.setBounds(3,20,360,140);
        l.setFont(fo);
        l6.setFont(fo1);
        f.add(l);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(jl);
        con.add(propic);
        con1.add(banner);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        propic.addMouseListener(this);
        banner.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            f.setVisible(false);
            new FacebookSayan2();
        }
        else if(e.getSource()==b1)
        {
            f.setVisible(false);
            new Message();
        }
        else if(e.getSource()==b2)
        {
            f.setVisible(false);
            new About();
        }
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==propic)
        {
            f.setVisible(false);
            new ProPic();
        }
        else if(me.getSource()==banner)
        {
            f.setVisible(false);
            new BannerPic();
        }
    }
}

class FacebookSayan2 extends MouseAdapter implements ActionListener
{
    JLabel l,l1,l2,l3,l4,l5,l6,l7,jl;;
    JLabel propic,banner;
    JButton b,b1,b2;
    Container con,con1;
    JFrame f=new JFrame();
    Font fo= new Font(Font.SANS_SERIF, Font.BOLD, 20);
    Font fo1= new Font(Font.SANS_SERIF, Font.BOLD, 14);
    FacebookSayan2()
    {
        f.setLayout(null);
        // f=new JFrame();
        con= f.getContentPane();
        con1= f.getContentPane();
        propic=new JLabel();
        banner=new JLabel();
        f.setTitle("facebook");
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        propic.setIcon(new ImageIcon("propic.png"));
        banner.setIcon(new ImageIcon("banner.jpg"));
        l=new JLabel("Sayan Shil");
        l1=new JLabel("Studies Computer Science at Ananda Chandra College");
        l2=new JLabel("Went to Jalpaiguri Zilla School");
        l3=new JLabel("Went to Pandapara Sarada Shishutirtha Estd 1987");
        l4=new JLabel("Lives in Jalpaiguri");
        l5=new JLabel("From Jalpaiguri");
        l6=new JLabel("Friends");
        l7=new JLabel("314 friends");
        jl=new JLabel("Drawing    Writing    Photography    Film-making");
        b=new JButton("Cancel Request");
        b1=new JButton("Message");
        b2=new JButton("...");
        // b3=new JButton("Cancel Request");
        f.setSize(385,660);
        // f1.setSize(385,660);
        b.setBounds(20, 230, 140, 40);
        b1.setBounds(165, 230, 140, 40);
        b2.setBounds(310,230,40,40);
        // b3.setBounds(20, 230, 140, 40);
        // propic= getImage(getDocumentBase(),"image.jpeg"); 
        l.setBounds(20,180,160,40);
        l1.setBounds(20,280,365,15);
        l2.setBounds(20, 300, 365, 15);
        l3.setBounds(20, 320, 365, 15);
        l4.setBounds(20, 340, 365, 15);
        l5.setBounds(20, 360, 365, 15);
        l6.setBounds(20,420,365,20);
        l7.setBounds(20, 440, 80, 10);
        jl.setBounds(20,390,400,20);
        propic.setBounds(20,80,100,100);
        banner.setBounds(3,20,360,140);
        l.setFont(fo);
        l6.setFont(fo1);
        f.add(l);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(jl);
        con.add(propic);
        con1.add(banner);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        propic.addMouseListener(this);
        banner.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            f.setVisible(false);
            new FacebookSayan();
        }
        else if(e.getSource()==b2)
        {
            f.setVisible(false);
            new About2();
        }
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==propic)
        {
            f.setVisible(false);
            new ProPic2();
        }
        else if(me.getSource()==banner)
        {
            f.setVisible(false);
            new BannerPic2();
        }
    }
}

class ProPic extends MouseAdapter
{
    JLabel picture;
    JLabel l;
    Container c;
    JFrame f=new JFrame();
    Font fo1= new Font(Font.SANS_SERIF, Font.BOLD, 14);
    ProPic()
    {
        f.setLayout(null);
        f.setTitle("Profile Picture");
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        l=new JLabel("< Back");
        c= f.getContentPane();
        picture=new JLabel();
        picture.setIcon(new ImageIcon("propic.jpg"));
        f.setSize(385,660);
        picture.setBounds(10,115,350,350);
        l.setBounds(10, 20, 100, 40);
        f.add(l);
        l.setFont(fo1);
        c.add(picture);
        l.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==l)
        {
            f.setVisible(false);
            new FacebookSayan();
        }
    }
}

class BannerPic extends MouseAdapter
{
    JLabel picture;
    JLabel l;
    Container c;
    JFrame f=new JFrame();
    Font fo1= new Font(Font.SANS_SERIF, Font.BOLD, 14);
    BannerPic()
    {
        f.setLayout(null);
        f.setTitle("Banner");
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        l=new JLabel("< Back");
        c= f.getContentPane();
        picture=new JLabel();
        picture.setIcon(new ImageIcon("banner.jpg"));
        f.setSize(385,660);
        picture.setBounds(10,115,350,350);
        l.setBounds(10, 20, 100, 40);
        f.add(l);
        l.setFont(fo1);
        c.add(picture);
        l.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==l)
        {
            f.setVisible(false);
            new FacebookSayan();
        }
    }
}

class ProPic2 extends MouseAdapter
{
    JLabel picture;
    JLabel l;
    Container c;
    JFrame f=new JFrame();
    Font fo1= new Font(Font.SANS_SERIF, Font.BOLD, 14);
    ProPic2()
    {
        f.setLayout(null);
        f.setTitle("Profile Picture");
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        l=new JLabel("< Back");
        c= f.getContentPane();
        picture=new JLabel();
        picture.setIcon(new ImageIcon("propic.jpg"));
        f.setSize(385,660);
        picture.setBounds(10,115,350,350);
        l.setBounds(10, 20, 100, 40);
        f.add(l);
        l.setFont(fo1);
        c.add(picture);
        l.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==l)
        {
            f.setVisible(false);
            new FacebookSayan2();
        }
    }
}

class BannerPic2 extends MouseAdapter
{
    JLabel picture;
    JLabel l;
    Container c;
    JFrame f=new JFrame();
    Font fo1= new Font(Font.SANS_SERIF, Font.BOLD, 14);
    BannerPic2()
    {
        f.setLayout(null);
        f.setTitle("Banner");
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        l=new JLabel("< Back");
        c= f.getContentPane();
        picture=new JLabel();
        picture.setIcon(new ImageIcon("banner.jpg"));
        f.setSize(385,660);
        picture.setBounds(10,115,350,350);
        l.setBounds(10, 20, 100, 40);
        f.add(l);
        l.setFont(fo1);
        c.add(picture);
        l.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==l)
        {
            f.setVisible(false);
            new FacebookSayan2();
        }
    }
}

class About extends MouseAdapter
{
    JFrame f=new JFrame("Profile Settings");
    JLabel l,report,help,block,search;
    Font fo= new Font(Font.SANS_SERIF, Font.BOLD, 20);
    About()
    {
        f.setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        f.setSize(385, 660);
        l=new JLabel("< Back");
        report=new JLabel("Report profile");
        help=new JLabel("Help Sayan");
        block=new JLabel("Block");
        l.setBounds(10, 20, 100, 40);
        report.setBounds(10, 60, 100, 40);
        help.setBounds(10, 100, 100, 40);
        block.setBounds(10, 140, 100, 40);
        f.add(l);
        f.add(report);
        f.add(block);
        f.add(help);
        l.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==l)
        {
            f.setVisible(false);
            new FacebookSayan();
        }
    }
}

class About2 extends MouseAdapter
{
    JFrame f=new JFrame("Profile Settings");
    JLabel l,report,help,block,search;
    Font fo= new Font(Font.SANS_SERIF, Font.BOLD, 20);
    About2()
    {
        f.setLayout(null);
        Image img = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
        f.setIconImage(img);
        f.setSize(385, 660);
        l=new JLabel("< Back");
        report=new JLabel("Report profile");
        help=new JLabel("Help Sayan");
        block=new JLabel("Block");
        l.setBounds(10, 20, 100, 40);
        report.setBounds(10, 60, 100, 40);
        help.setBounds(10, 100, 100, 40);
        block.setBounds(10, 140, 100, 40);
        f.add(l);
        f.add(report);
        f.add(block);
        f.add(help);
        l.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==l)
        {
            f.setVisible(false);
            new FacebookSayan2();
        }
    }
}
class Message
{
    JFrame f=new JFrame("Message");
    Message()
    {
        f.setLayout(null);
        f.setSize(385, 660);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}

class Run
{
    public static void main(String[] args)
    {
        new FacebookSayan();
    }
}