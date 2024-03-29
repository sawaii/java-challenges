import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check fot Armstrong: ");
        int num = scanner.nextInt();
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
        int newNum = num, numOfDigits = 0, sum = 0;

        while (num > 0) {
            num /= 10;
            numOfDigits++;
        }

        num = newNum;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }
        return sum == newNum;
    }
}
