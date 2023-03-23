/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assesment1b;

/**
 *
 * @author 12173793
 */

import static com.mycompany.assesment1b.StudentRecord.studentId;
import java.util.ArrayList;
import java.util.Scanner;

public class View  {

    public View(GradeBook gb) {
    }
    
    private GradeBook gradeBook;

    
   
        private void getGradeBook() {        
        commandLoop();
    }
    
    private void help()
    {
       System.out.println( "The following commands are recognised\n"
                     + "\tdisplay this message                                                                        > 0\n"
                     + "\tdisplay a specific student record:                                                   > 1 studentid\n"
                     + "\tdisplay records for all student records within a range                > 2 mark1 mark2\n"
                     + "\tdisplay statistics (minimum, maximum and average marks)      > 3\n"
                     + "\tdisplay all the student records                                                       > 4\n"
                     + "\texit the application                                                                         > 9\n");
    }
    public void DisplayStudentRecord(String studentId)
    {
        System.out.println("Student ID: "+StudentRecord.studentId());
         System.out.println("Mark of Assesment 1: "+ StudentRecord.assesment1());
          System.out.println("Mark of Assesment 2: "+ StudentRecord.assesment2());
           System.out.println("Mark of Assesment 3: "+ StudentRecord.assesment3());
        
    }    
    
    public void commandLoop()
    {
        help();
        Scanner optt = new Scanner (System.in);
                System.out.print("Enter Option: ");
                String p = optt.nextLine();  
               int op = Integer.parseInt(p);
        
        while (op!=9)
        {
       switch(op)
        {
           case 0:
               commandLoop();
               
       
           case 1:
            
                Scanner option = new Scanner (System.in);
                System.out.print("Enter Student ID: ");
                String studentId = option.nextLine();       
                StudentRecord record = GradeBook.find(studentId);
             //  System.out.println("\n"+record);
             if (studentId()==studentId)
             {
               DisplayStudentRecord(studentId);
               System.out.println();
                commandLoop();
             }
             else
             {
                 DisplayStudentRecord(studentId);
                 System.out.println();
            //    System.out.println("Student ID not macted");
                commandLoop();
             }
                           

           case 2:
        
                Scanner option11 = new Scanner (System.in);
                System.out.print("Enter high range: ");
                String highrange = option11.nextLine();    
                System.out.print("\n");
                Scanner option2 = new Scanner (System.in);
                System.out.print("Enter low range: ");
                String lowrange = option2.nextLine(); 
                System.out.print("\n");
                int i = Integer.parseInt(lowrange);
                int j = Integer.parseInt(highrange);
                ArrayList<StudentRecord> record1 = GradeBook.find(i, j);
                System.out.println("\n"+record1);
                DisplayStudentRecord(studentId());
                commandLoop();
        
           case 3:
                
               System.out.println("Lowest Mark: "+GradeBook.lowestMark());               
               System.out.println("Highest Mark: "+GradeBook.highestMark());                                 
               System.out.println("Average Mark: "+GradeBook.averageMark());               
               System.out.println();
                commandLoop();              
        
        
           case 4:
        
            getGradeBook();               
                System.out.println();
                commandLoop();    
                
           case 5:
                System.out.println("Terminatinig JVM");
         System.exit(0);
         
         default:
             System.out.println("Wrong Input");
          commandLoop();
       }
          
        }
    }
}

       

   
    

    
    

    

