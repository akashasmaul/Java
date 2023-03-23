/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assesment1b;

/**
 *
 * @author 12173793
 */

import java.util.ArrayList;

public class GradeBook {
    
    private  int nRecords;
    private int maxA1;
    private int maxA2;
    private int maxA3;    
    private StudentRecord[] gradeBook;
    
    
    
    
     public GradeBook(int maxA1, int maxA2, int maxA3){
        this.maxA1=maxA1;
        this.maxA2=maxA2;
        this.maxA3=maxA3;
    }   
    
    public static  StudentRecord find(String id){
       return  new StudentRecord("S01", 50, 80, 95);
        
    }
    
    public static ArrayList<StudentRecord> find (int mark1, int mark2)
    {
        
       ArrayList <StudentRecord> alr = new ArrayList<>();
        alr.add(new StudentRecord("S01", 70,75,90));
        alr.add(new StudentRecord("S02", 60,80,85));   
         alr.add(new StudentRecord("S03", 66,79,83)); 
        return alr;        
    }
   
    
    public int getNRecords()
    {
        return 0;
    }
    
    public  StudentRecord[] getGradeBook(){
        // temporary code while phase 2 is underdevelopment
        // remove the 3 lines of codeused here  to create a “dummy” gradebook 
        // when the actual gradebook has been loaded in phase 3
        gradeBook = new StudentRecord[2];
        gradeBook[0] = new StudentRecord("S01", 0,0,0);
        gradeBook[1] = new StudentRecord("S02", 0,0,0);
        return gradeBook; 
    }

   
    public static int lowestMark(){
        return 0;
    }
    
    public static int highestMark(){
        return 100;
    }
    
    public static double averageMark(){
        return 73.3;
    }
    
    void loadFromTables()
    {
        String[] students = {"S10", "S20", "S30"};   
   int[] assignment1 = {0, 5, 10};     
   int[] assignment2 = {0, 10, 15};
   int[] assignment3 = {0, 20, 25};

   nRecords = students.length;
   gradeBook = new StudentRecord[nRecords];
   for (int i = 0; i < nRecords; i++) {
      StudentRecord sr = new StudentRecord(students[i],       
                   assignment1[i], assignment2[i], assignment3[i]);
      String g = calculateGrade(sr);
      sr.setGrade(g);
      gradeBook[i] = sr;
   }

    }
    String calculateGrades(StudentRecord sr)
    {
        return null;
    }
    boolean supplementary(StudentRecord sr)
    {
        return true;
    }
   private void sortByMark(){
        for(int i = 1; i < gradeBook.length; i++){
            StudentRecord toInsert = gradeBook[i];
            int moveTo = i;
  
      //      while (moveTo > 0 && (gradeBook[moveTo-1].getTotal() < toInsert.getTotal())){
                gradeBook[moveTo]= gradeBook[moveTo - 1];
                moveTo --;
            }
    //       gradeBook[moveTo] = toInsert;
        }

    private String calculateGrade(StudentRecord sr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }


  

