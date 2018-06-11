import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements MouseListener,ActionListener
{
	private JLabel l1,l2,l3;
	private JButton b1,b2;
	private JPanel p1;
	public Home()
	{
		super("Fool Game");
		this.setSize(450,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		p1.setLayout(null);
		
		l1=new JLabel("Greetings !!!");
		l1.setOpaque(true);
		l1.setForeground(Color.blue);
		l1.setBounds(160,50,180,40);
		l1.setFont(new Font("Cambria",Font.BOLD,26));
		p1.add(l1);
		
		l2=new JLabel("Are you a fool ?");
		l2.setFont(new Font("Cambria",Font.BOLD,20));
		l2.setBounds(160,100,500,40);
		p1.add(l2);
		
		l3=new JLabel("\u00a9"+"2017 Ehtesham Ahmad Nadim All right reserved");
		l3.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,11));
		l3.setBounds(180,670,400,40);
		p1.add(l3);		
		
		b1=new JButton("YES");
		b1.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,30));
		b1.setBackground(Color.RED);
		b1.setBounds(80,140,120,60);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2=new JButton("NO");
		b2.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,30));
		b2.setBackground(Color.BLUE);
		b2.setBounds(250,140,120,60);
		b2.addMouseListener(this);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		this.add(p1);
	}
	public void mouseEntered(MouseEvent me)
	{
		Random rn=new Random();
		if(me.getSource().equals(b2))
		{
			b2.setBackground(Color.gray);
			b2.setBounds(rn.nextInt(350),rn.nextInt(600),120,60);
		}
		else if(me.getSource().equals(b1))
		{
			b1.setBackground(Color.gray);
		}
		else
		{
		}
	}
	public void mouseExited(MouseEvent me)
	{		
		if(me.getSource().equals(b2))
		{
			b2.setBackground(Color.blue);
		}
		else if(me.getSource().equals(b1))
		{
			b1.setBackground(Color.red);
		}
		else
		{
		}		
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		String elementText=ae.getActionCommand();
		if(elementText.equals(b1.getText()))
		{
			String s1="Opps!!! You are a fool";
			Result r=new Result(s1);
			r.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(b2.getText()))
		{
			String s2="You are not a fool";
			Result r=new Result(s2);
			r.setVisible(true);
			this.setVisible(false);
		}
		else
		{
		}
	}
}