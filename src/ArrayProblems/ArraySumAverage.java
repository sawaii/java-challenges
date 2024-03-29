package ArrayProblems;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            if(i == 0){
                System.out.println("Please enter "+ (i+1) +"st element: ");
                nums[i] = scanner.nextInt();
            } else if(i == 1){
                System.out.println("Please enter "+ (i+1) +"nd element: ");
                nums[i] = scanner.nextInt();
            }else if( i == 2){
                System.out.println("Please enter "+ (i+1) +"rd element: ");
                nums[i] = scanner.nextInt();
            }else{
                System.out.println("Please enter "+ (i+1) +"th element: ");
                nums[i] = scanner.nextInt();
            }
        }
        System.out.println("Sum is: " + (sum(nums, size)));
        System.out.println("Average is: " + (average(nums, size)));
    }

    public static int sum(int[] nums, int size){
        int i = 0, sum = 0;
        while(i<size){
            sum += nums[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] nums, int size){
        int i = 0, sum = 0;
        while(i<size){
            sum += nums[i];
            i++;
        }
        return sum/size;
    }
}
