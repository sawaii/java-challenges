import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number to print Fibonacci series upto: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fibSeries(num);
    }
    static void fibSeries(int num){
        if (num < 0) throw new ArithmeticException("Number can't be less than 0");
        int a = 0, b = 1;
        System.out.println(a);
        if (num == 0) return;
        System.out.println(b);
        if (num == 1) return;

        int c = 0;
        while (c < num) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
