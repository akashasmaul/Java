
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class work implements ActionListener{
	
	String firstname,lastname,livingtime,familymember;
	static String summery;
	static int numoffamily=0;
	String str="";

	 public JLabel FirstName = new JLabel("First Name:");
	    public JLabel LastName = new JLabel("Last Name:");
	    public JLabel LivingTime=new JLabel("Living Time:");
	    public JLabel FamilyMember = new JLabel("Family Members:");

	    public JTextField jtfFirstName = new JTextField(10);
	    public JTextField jtfLastName = new JTextField(10);
	    public JTextField jtflivingtime=new JTextField(10);
	    public JTextField jtfFamilyMember = new JTextField(10);

	    
	    public JButton done = new JButton("Done");
	    

	    JFrame frame=new JFrame();
	    public void work(){
	    	
	    	JPanel p1 = new JPanel();
            p1.setLayout(new GridLayout(5, 4));
            p1.add(FirstName);
            p1.add(jtfFirstName);
            p1.add(LastName);
            p1.add(jtfLastName);
            p1.add(LivingTime);
            p1.add(jtflivingtime);
            p1.add(FamilyMember);
            p1.add(jtfFamilyMember);
            
            JPanel p2 = new JPanel();
            p2.setLayout(new BorderLayout());
            p2.setBorder(new TitledBorder("===> Family Information"));
            p2.add(p1, BorderLayout.BEFORE_FIRST_LINE);
            p2.add(done, BorderLayout.AFTER_LAST_LINE);
            
            done.addActionListener(this);
           
        
            frame.add(p2);
            
            
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            
            frame.setSize(600,300);

            

            frame.setVisible(true);
}
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == done){
        firstname=("");
        lastname=("");
        livingtime=("");
        familymember=("");
        firstname=jtfFirstName.getText().trim();
        lastname=jtfLastName.getText().trim();
        livingtime=jtflivingtime.getText().trim();
        familymember=jtfFamilyMember.getText().trim();
        summery=("Name: "+firstname)+(" ,surname: "+lastname)+(" ,Living Time: "+livingtime)+(" ,Family Member: "+familymember);
        
        String Data=work.summery;
        
        try{
        	
        	
        	File file=new File("E:2017.txt");
        	if (!file.exists()) {
       	     file.createNewFile();
       	  }
        	FileWriter fw = new FileWriter(file,true);
        	BufferedWriter bw = new BufferedWriter(fw);
        	
        	bw.write(Data);
        	bw.newLine();
        	bw.close();
        	
        	
        }catch(Exception E)
        {
        	//System.err.println("Error is "+ E);
        }
        frame.dispose();
       
        JOptionPane.showMessageDialog(null, "Successfully Added");
        }
            
	    }
    public void show(){
    	try{
			
			FileReader fr=new FileReader("E:2017.txt");
			BufferedReader br=new BufferedReader(fr);
			while(str!=null){
				str=br.readLine();
				if(str!=null)
					
					numoffamily++;
					System.out.println(str);}
			
		}catch(Exception EE)
		{
			//System.out.println("Error: "+EE);
		}
    	System.out.println("The number of families are: "+numoffamily);
    	
	}
    public void file(){
    	JFileChooser chooser= new JFileChooser("E:/");
    	
    	int x=chooser.showOpenDialog(null);
    	if(x== JFileChooser.APPROVE_OPTION){
    		File file=chooser.getSelectedFile();
    		
    	
    		
    		try{
    			Desktop.getDesktop().open(file);
    			
    			
    		}catch(Exception EE)
    		{
    			//System.err.println("Error:"+EE);
    		}
    }
    }
   
    }
