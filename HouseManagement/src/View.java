
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class View implements ActionListener {

	JFrame offline = new JFrame("View");
	method met=new method();
	
	JMenuBar bar = new JMenuBar();
	
	JMenuItem open = new JMenuItem("Open");
	
	JMenuItem close = new JMenuItem("Close");
	
	
	JLabel background = new JLabel(new ImageIcon("background.jpg"));
	
	
	
	JButton a = new JButton("lhkdf");
	
	public void view(){
		
		offline.setSize(700, 600);
		offline.setLocationRelativeTo(null);
		offline.setVisible(true);
		offline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JMenu file = new JMenu("File");
		JMenu help = new JMenu("Help");
		
		
		offline.add(background);
		
		offline.setJMenuBar(bar);
		bar.add(file);
		bar.add(help);
		
		
		file.add(open);
		
		file.add(close);
		
		open.addActionListener(this);
		
		close.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==close){
			offline.dispose();
		}
		
		
		
		
		
		else if(e.getSource()==open){
			
			offline.dispose();
			met.meth();
			
			
		}
	}}
