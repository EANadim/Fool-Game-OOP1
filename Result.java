import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements MouseListener,ActionListener
{
	private JLabel label,copyright;
	private JPanel panel;
	private JButton againButton,exitButton;
	
	public Result(String ss)
	{
		super("Result");
		this.setSize(450,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setLayout(null);
		
		label=new JLabel(ss);
		label.setOpaque(true);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,29));
		label.setBounds(90,200,400,50);
		panel.add(label);
		
		againButton=new JButton("Play Again");
		againButton.setBackground(Color.GREEN);
		againButton.setFont(new Font("Cambria",Font.BOLD,26));
		againButton.setBounds(35,300,200,60);
		againButton.addMouseListener(this);
		againButton.addActionListener(this);
		panel.add(againButton);
		
		exitButton=new JButton("Exit");
		exitButton.setBackground(Color.RED);
		exitButton.setFont(new Font("Cambria",Font.BOLD,26));
		exitButton.setBounds(280,300,120,60);
		exitButton.addMouseListener(this);
		exitButton.addActionListener(this);
		panel.add(exitButton);
		
		copyright=new JLabel("\u00a9"+"2017 Ehtesham Ahmad Nadim All right reserved");
		copyright.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,11));
		copyright.setBounds(180,670,400,40);
		panel.add(copyright);	
		
		this.add(panel);
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(againButton))
		{
			againButton.setBackground(Color.lightGray);
		}
		else if(me.getSource().equals(exitButton))
		{
			exitButton.setBackground(Color.lightGray);
		}
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(againButton))
		{
			againButton.setBackground(Color.GREEN);
		}
		else if(me.getSource().equals(exitButton))
		{
			exitButton.setBackground(Color.RED);
		}
		else{}
	}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String text=ae.getActionCommand();
		if(text.equals(againButton.getText()))
		{
			Home h=new Home();
			h.setVisible(true);
			this.setVisible(false);
		}
		else if(text.equals(exitButton.getText()))
		{
			System.exit(0);
		}
	}
}