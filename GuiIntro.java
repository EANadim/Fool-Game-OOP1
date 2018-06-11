import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiIntro extends JFrame implements MouseListener, ActionListener
{
	
	private JLabel title ;
	private JButton yesButton, noButton;
	private JPanel panel;
	
	public GuiIntro()
	{
		super("FOOL GAME");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		
		
		title = new JLabel("Are  You  A  Fool  ?");
		title.setBounds(260,50,200,100);
		title.setFont(new Font("Lucida Fax", Font.ITALIC+Font.BOLD, 20));
		title.setBackground(Color.WHITE);
		title.setForeground(Color.BLUE);
		title.setOpaque(true);
		panel.add(title);
		
		
		
		yesButton = new JButton("Yes");
		yesButton.setBounds(150,350,100,30);
		yesButton.setBackground(Color.GREEN);
		yesButton.addMouseListener(this);
		yesButton.addActionListener(this);
		panel.add(yesButton);
		
		noButton = new JButton("No");
		noButton.setBounds(430,350,100,30);
		noButton.setBackground(Color.ORANGE);
		noButton.addMouseListener(this);
		noButton.addActionListener(this);
		panel.add(noButton);
		
		this.add(panel);
		
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(yesButton))
		{
			yesButton.setBackground(Color.CYAN);
		}
		else if(me.getSource().equals(noButton))
		{
			noButton.setBackground(Color.CYAN);
			Random rn =new Random();
			noButton.setBounds(rn.nextInt(700),rn.nextInt(350),100,30);
		}
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(yesButton))
		{
			yesButton.setBackground(Color.GREEN);
		}
		else if(me.getSource().equals(noButton))
		{
			noButton.setBackground(Color.RED);
			
		}
		else{}
	}
	public void mouseReleased(MouseEvent me){	}
	public void mousePressed(MouseEvent me){	}
	public void mouseClicked(MouseEvent me){	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		
		if(elementText.equals(yesButton.getText()))
		{
			
			String s1 = ("YES YOU ARE A FOOL.");
			Home hi = new Home(s1);
			hi.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(noButton.getText()))
		{
			String s1 = ("YES YOU ARE NOT A FOOL.");
			Home hi = new Home(s1);
			hi.setVisible(true);
			this.setVisible(false);
		}
		else{}
	}
}