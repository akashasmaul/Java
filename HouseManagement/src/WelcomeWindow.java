
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class WelcomeWindow implements ActionListener{
	JFrame welcome = new JFrame("Welcome");	
	
	View off = new View();
	
	
	JLabel label1 = new JLabel("Welcome to House Management System");
	JLabel label2 = new JLabel("     Greetings                        ");
	
	
	
	JButton StartButton = new JButton("Start");
	//JButton onlineButton = new JButton("Online");
	JButton cancelButton = new JButton("Cancel");
	
	JPanel upperpanel = new JPanel(new GridLayout(2 , 1 , 5 , 5));	
	JPanel middlepanel = new JPanel();
	JPanel lowerpanel = new JPanel();
	
	GridBagConstraints c = new GridBagConstraints();
	
	
	
	public void Welcome(){		
		
		
		
		
		GridLayout g = new GridLayout(3 , 1 , 5 , 5);
		welcome.setLayout(g);
		
		upperpanel.add(label1);
		label1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label1.setForeground(Color.red);
		upperpanel.add(label2);
		
		upperpanel.setBackground(new Color(246 , 205 , 123));
		middlepanel.setBackground(new Color(245,222,140));
		lowerpanel.setBackground(new Color(255,228,181));
		
		
		
		middlepanel.add(StartButton);
		
		c.gridx = 1;
		c.gridwidth = 5;
		c.anchor = GridBagConstraints.CENTER;
		
		lowerpanel.add(cancelButton, c);
		
		welcome.add(upperpanel);
		welcome.add(middlepanel);
		welcome.add(lowerpanel);
		

		
		welcome.setSize(400, 200);
		welcome.setLocationRelativeTo(null);
		//welcome.setLocation(490, 250);
		welcome.setVisible(true);
		welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		cancelButton.addActionListener(this);
		StartButton.addActionListener(this);
		
	}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==cancelButton){
				welcome.dispose();
			}
			
			else if(e.getSource()==StartButton){
				welcome.dispose();
				off.view();				
			}
			
			
		}
	
		
	
}
