package Finalprojectjava;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Person{
	
		public void showMain() {


		    Interfacedemo i = new Interfacedemo();
	        i.print();
	        i.welcome();
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        
       
       
    
     
        Doctor d1 = new Doctor();
	    d1.id="101";
	    d1.name="Samiha labiba Ibnat";
	    d1.specilist="  Eye";
	    d1.appointment="   4pm -7 pm";
	    d1.doc_qual="MBBS,FCPS";
	    d1.droom=233;
	    Doctor d2 = new Doctor();
	    d2.id="102";
	    d2.name="Rubyea Zannat";
	    d2.specilist="       Medicine";
	    d2.appointment="  10 am - 3 pm";
	    d2.doc_qual="MBBS,M-Phill";
	    d2.droom=235;
	    Doctor d3 = new Doctor();
	    d3.id="103";
	    d3.name="Tanzim Bin Idris";
	    d3.specilist=" Liver ";
	    d3.appointment="  7 pm - 10 pm";
	    d3.doc_qual="MBBS,M.A";
	    d3.droom=263;
	    Doctor d4 = new Doctor();
	    d4.id="104";
	    d4.name="Samia Akter";
	    d4.specilist="         Skin ";
	    d4.appointment="  2 pm -6 pm";
	    d4.doc_qual="MBBS, phd";
	    d4.droom=266;
	   			    
	    
	    Patient p1=new Patient();
	    p1.id="1205";
	    p1.name="shadin";
	    p1.disease="Heart disease" ;
	    p1.sex=" Male";
	    p1.admit_status="\tAdmitted";
	    p1.age="  70";			    
	    Patient p2=new Patient();
	    p2.id="1208";
	    p2.name="Ashfia";
	    p2.disease="Liver Disease" ;
	    p2.sex=" Female";
	    p2.admit_status="\tNOT Admitted";
	    p2.age="  50";			    
	    Patient p3=new Patient();
	    p3.id="1209";
	    p3.name="Tania";
	    p3.disease="\tLEG Fracture" ;
	    p3.sex=" Female";
	    p3.admit_status="\tAdmitted";
	    p3.age="  20";			    
	    Patient p4=new Patient();
	    p4.id="1212";
	    p4.name="Farabi";
	    p4.disease="Heart Break" ;
	    p4.sex=" Male";
	    p4.admit_status="\tAdmitted";
	    p4.age="  19";


        
        
      Staff st1=new Staff("Moinul Darowan \t","male ",700);
      Staff st2=new Staff("Nafiz reja\t","male",10000);
      Staff st3=new Staff("Sadhin\t\t","male",20000);
      Staff st4=new Staff("khaleda\t\t","female",12300); 
      
      Facility fc1 = new Facility(" Fast Ambulance Service");
      Facility fc2 = new Facility(" Canteen & Hygenic food Service"); 
      Facility fc3 = new Facility(" 24 hour emergency Service");
      
      Laboratory l1 = new Laboratory ("X-ray", 1000);
      Laboratory l2= new Laboratory ("CT-Scan", 2000); 
      Laboratory l3 = new Laboratory ("ECG", 1500);
      
      Billing bil1 = new Billing();
       

        Scanner input = new Scanner(System.in);
        int choice,choice1 ,j, c1, status = 1,status1 = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1,n1=1,n2=1;
    
    		 
    	    System.out.println("\n");
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
            System.out.println("Enter type of user :- 1. Public  2. Administrator   ");

            System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
            choice = input.nextInt();
    	

  if (choice==1)
          
            {       	
            		
            	
            	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                System.out.println("                      ** PUBLIC **");
                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                n1 = 1;
                System.out.println("\n");
                System.out.println(" * * * Doctor facilities of our Hospital * * *");
                d1.displaydoctor();
                d2.displaydoctor();
                d3.displaydoctor();
                d4.displaydoctor();
               
                System.out.println("* * * Laboratory facilities of our Hospital * * *");
                
                l1.displaylaboratory();
                l2.displaylaboratory();
                l3.displaylaboratory();
                System.out.println("\n");
                System.out.println(" * * * Hospitality1 facilities of our Hospital * * * ");
                fc1.displayfacility();
                fc2.displayfacility();
                fc3.displayfacility();
                System.out.println("\n");
                System.out.println(" For emergency helpline:- +8801798588197");
                System.out.println(" For patient admission :- +880 76227629");
                System.out.println(" For ambulance service:-  +8801955470522");

                System.out.println("\nPress any key to go back to Main Menu");
                s6 = input.nextInt();
                if (s6==1)
                {
                	this.showMain();
                }
                else 
                {
                	this.showMain();
                }
            } 
            
            else if (choice==2) {
            	
            	
            	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                System.out.println("                     ** ADMINISTRATOR**");
                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                n2=1;
                
               Login g1= new Login();
                g1.Login();
                while (status == 1)
                {
                
                System.out.println("1.Doctos  2. Patients   3.Laboratories  4. Facilities  5. Staff 6. Billing");
            choice1 = input.nextInt();
            if (choice1==1)

                    {
                    	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d1.new_doctor();;count1++;
                                    	
                                        break;
                                    }
                                                           
                 
                                case 2:
                                    {
                                    	 System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        System.out.println("id \t\t\tName\t\t\t Specilist \t\t Appointment\t\t  Qualification \t     Room No.");
                                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                      		    
                                                 for (j = 0; j < count1; j++) {
                                                 d1.displaydoctor();
                                                 d2.displaydoctor();
                                                 d3.displaydoctor();
                                                 d4.displaydoctor();
                                                 break;
                                    }
                                        
                                  
                               
                      }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        
                    }
            
            else if (choice1==2)
                    {
                    	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                    	p1. new_patient();;count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                    	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        System.out.println("id\t\t    Name\t\t -Disease\t\tGender\t\t     Admit Status\t\t Age");
                                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        for (j = 0; j < count2; j++) {
                                        	p1.displaypatient();
                                            p2.displaypatient();
                                            p3.displaypatient();
                                            p4.displaypatient();
                                            break;
                                        }
                                       
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        
                        
                    }
            else if (choice1==3)
                    {
                        s3 = 1;
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                       while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l1.displaylaboratory(1);count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                    	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                    	System.out.println("Fecilities\t\t Cost");
                                    	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        for (j = 0; j < count3; j++) {
                                        	l1.displaylaboratory();
                                        	l2.displaylaboratory();
                                        	l3.displaylaboratory();
                                        	break;
                                        }
                                       
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                     
                    }
            else if (choice1==4)
                    {
                        s4 = 1;
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        System.out.println("          **HOSPITAL FACILITY SECTION**");
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        while (s4 == 1)
                        {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l1. displaylaboratory(1);count4++;
                                        break;
                                    }
                                case 2:
                                    {
                                    	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        System.out.println("Hospital  Facility are:");
                                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        for (j = 0; j < count4; j++) {
                                        	fc1.displayfacility();
                                            fc2.displayfacility();
                                            fc3.displayfacility();
                                            break;
                                        }
                                        
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        
                    }
            else if (choice1==5)
                    {
                        s5 = 1;
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                        while (s5 == 1)
                        {
                            
                            System.out.println("1.Add New Entry \n2.Existing Staff List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                    	st1.new_staff();;count5++;
                                        break;
                                    }
                                case 2:
                                    {
                                    	System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        System.out.println(" Name \t\t         Gender \t\tSalary");
                                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                                        st1.displaystaff();
                                        st2.displaystaff();
                                        st3.displaystaff();
                                        st4.displaystaff();
                                        break;
                                    }
                                
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                       
                    }
                    
            else if (choice1==6)
                {
                    s6 = 1;
                    System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                    System.out.println("                       ** MAKE BILL **");
                    System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
                    while (s6 == 1)
                    {
                        
                    	 System.out.println("Press 1 to make a bill ");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                	bil1.patientbill();;count6++;
                                    break;
                                }
                            
                            
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    
      }}    
}
            else {
            	System.out.println("\nWrong input try again");
            	this.showMain();
            }
    }	
} 

