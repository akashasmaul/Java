/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assesment1b;

/**
 *
 * @author 12173793
 */

public class Assesment1B {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        GradeBook gb = new GradeBook(20, 30, 50);// 20, 30, 50 are the max marks
        View v = new View(gb);
        v.commandLoop();

    }
}
