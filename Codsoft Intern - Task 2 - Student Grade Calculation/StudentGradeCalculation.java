package org.studentgradecalculation;

import java.util.Scanner;

class Grade{
	
    public String grade(int avg){
        
    	switch (avg / 100) {
            case 100:
                return "A+";
            case 90:
                return "A";
            case 80:
                return "B+";
            case 70:
                return "B";
            case 60:
                return "C";
            case 50:
                return "D";
            default:
                return "F";
        }
    }
}

public class StudentGradeCalculation{
    
	public static void main(String[] args){
        
    	Grade g = new Grade();
        
    	Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Subjects Count : ");
        
        int tsubs = sc.nextInt();
        
        int tmarks = 0;

        for (int i = 0; i < tsubs; i++) {
        	System.out.println("Enter the Mark in Subject : " + (i + 1));
        	int marks = sc.nextInt();
        	tmarks += marks;
        	}
        
        int avg = tmarks / tsubs;
        
        String Grade = g.grade(avg);

        System.out.println("Total mark : " + tmarks);
        System.out.println("Percentage : " + avg+"%");
        System.out.println("Grade : " + Grade);

        sc.close();
	}
}