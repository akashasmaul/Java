
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.io.File;
import java.io.FileWriter;
public class method implements ActionListener{

	work wor=new work();
	
	
	JButton add,show,search,exit;
	JFrame f;
	
	 JPanel p;
	 JFrame frame;
     JLabel nameL;
	 JLabel addressL;
	 JLabel phoneL;
	 JLabel ageL;
	 JLabel genderL;
	 
	 JTextField name;
	 JTextField address;
	 JTextField phone;
	 JTextField age;
	 JTextField gender;
	 
	 
	 
	 JButton done;
	
	public void meth()
	{
		
		f=new JFrame("Information");
		add = new JButton(" Add Family");
		show = new JButton(" Show Families");
		search = new JButton(" Show file");
		exit = new JButton(" Exit");
		add.setBounds(40,100,250,40);
		show.setBounds(40,170,250,40);
		search.setBounds(40,240,250,40);
		exit.setBounds(100,350,100,40);
		
		f.add(add);
		f.add(show);
		f.add(search);
		f.add(exit);
		f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocation(350,100);
        add.addActionListener(this);
        show.addActionListener(this);
        search.addActionListener(this);
        exit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==add)
		{
			
			f.dispose();
			wor.work();
		
			

		}
		if (e.getSource()==show)
		{
			f.dispose();
			wor.show();
			
		}
		if(e.getSource()==search)
		{
			f.dispose();
			wor.file();
		}
		if (e.getSource()==exit)
		{
			f.dispose();
			
		}
	}
	
	
	
}

