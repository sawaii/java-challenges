package ArrayProblems;

import java.util.Scanner;
import java.util.Arrays;

public class Marksheet {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
        int size = scanner.nextInt();
        int[] marks = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Please enter the marks of student " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
        }
        System.out.println("The marks of the students are: " + Arrays.toString(marks));
        for(int i=0; i<marks.length; i++) {
            System.out.print("Student ID: " + (i+1) + " - ");
            if(marks[i] < 35) {
                System.out.println("Result: FAIL (Marks obtained: " + marks[i] + ")");
            } else {
                System.out.println("Result: PASS (Marks obtained: " + marks[i] + ")");
            }
        }
    }

}
