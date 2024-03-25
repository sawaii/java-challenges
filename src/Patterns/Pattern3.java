package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            // Inner loop prints 'num - i' spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Inner loop prints 'i' stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
