import java.util.Scanner;

public class MultiplicationTable {
    static int num;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table: ");
        num = scanner.nextInt();
        multiTable(num);
    }

        static void multiTable(int num){
            for (int i=1; i<=10; i++){
                System.out.println(num*i);
            }
        }
}
