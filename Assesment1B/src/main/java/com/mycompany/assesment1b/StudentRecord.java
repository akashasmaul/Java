/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assesment1b;

/**
 *
 * @author 12173793
 */

public class StudentRecord {
   private static String studentId;
    private static  int assesment1;
    private  static int assesment2;
    private static  int assesment3;
    private int total;
    private String grade;
  
    
   public StudentRecord(String sid, int a1, int a2, int a3)
   {
       this.studentId=sid;
       this.assesment1=a1;
       this.assesment2=a2;
       this.assesment3=a3;       
   }
 
   
  void setGrade(String grade)
  {
      
  }
  public  static String studentId()
  {
      return studentId;
  }
  public static  int assesment1()
  {
      return assesment1;
  }
  public  static  int assesment2()
  {
      return assesment2;
  }
  public static  int assesment3()
  {
      return assesment3;
  }
  public   int total()
  {
      return total;
  }

    boolean getTotal() {
        return true;
    }
  
}
