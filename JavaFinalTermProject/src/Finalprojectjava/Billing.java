package Finalprojectjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Billing {
	double bill;
    double xray,ctscan,ecg,ambulance,canteen,emergency,room_price;
    int a,b,c,d;

      public void patientbill() {

          Scanner input = new Scanner(System.in);

           System.out.println("X-RAY Bill:- ");
           xray=input.nextDouble();
           System.out.println(" Number of X-RAY :- ");
           a=input.nextInt();
           System.out.println("CT-SCAN Bill:-");
           ctscan = input.nextDouble();
           System.out.println(" Number of CT-SCAN :- ");
           b=input.nextInt();
           System.out.println("ECG Bill:-");
           ecg = input.nextDouble();
           System.out.println(" Number of ECG :- ");
           c=input.nextInt();
           System.out.println("AMBULANCE Bill:-");
           ambulance= input.nextFloat();
           System.out.println("EMERGENCY SERVICE Bill:-");
           emergency= input.nextFloat();

           System.out.println(" Room price per day:- ");
           room_price=input.nextDouble();
           System.out.println(" Number of days :- ");

           d=input.nextInt();

          double bill = a*xray + b*ctscan + c*ecg + ambulance  + emergency + d*room_price;

      System.out.println(" TOTAL PATIENT BILL =    " + bill    );

		 try {
		      FileWriter myWriter = new FileWriter("test.txt");
		      myWriter.write("Name: Imagine\n");
		      myWriter.write("Age: 21\n");
		      myWriter.write("X-RAY Bill:- "+a*xray+"\n");
		      myWriter.write("CT-SCAN Bill:- "+b*ctscan+"\n");
		      myWriter.write("ECG Bill:- "+c*ecg+"\n");
		      myWriter.write("AMBULANCE Bill:- "+emergency+"\n");
		      myWriter.write("EMERGENCY SERVICE Bill:- "+ambulance+"\n");
		      myWriter.write("EMERGENCY SERVICE Bill:- "+d*room_price+"\n");
		      myWriter.write("\nTOTAL Bill:- "+bill+"\n");
		      myWriter.close();
		      BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		      String line;
		      while ((line = br.readLine()) != null) {
		    	  System.out.println("\n");
		        System.out.println(line);
		      }
		    //  System.out.println("Sentence added Successfully.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

      }
     }


