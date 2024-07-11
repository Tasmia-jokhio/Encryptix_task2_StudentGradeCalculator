/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_grade_calculator;

import java.util.Scanner;

/**
 *
 * @author jokhi
 */
public class Student_grade_calculator {

    /**
     * @param marks
     * @param args the command line arguments
     */
    
    public  static void grade(double avgpercentage){
      if(avgpercentage>=80){
            System.out.println("A+");
        
    }
    else if(avgpercentage>=70 && avgpercentage<80){
    System.out.println("A");
    }
    
   else if(avgpercentage>=60 && avgpercentage<70){
    System.out.println("B");
    } 
   else {
        System.out.println("c");
}
          
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here

    /**
     *
     */
    int totalmarks=0;
    double avgpercentage;
    Scanner s=new Scanner(System.in);
   
    
    String sub[]={"biology","chemistry","physics","english"};
    for(int i=0 ; i<sub.length; i++){
        System.out.println("enter your : "+sub[i]+" marks out of 100");
        totalmarks+=s.nextInt(); 
        
    }
    
    avgpercentage=totalmarks/sub.length;
        
        System.out.print("total marks : "+ totalmarks+
                "\naverage percentage : "+avgpercentage+"\nGrade : ");
        grade(avgpercentage);
}
}