import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        //int sum = 1;

//        boolean check = (num % 2 == 0) && (num % 3 == 0);
//        if (check)
//            System.out.println("Number is:"+num);}

//        while(true){
//            num = sc.nextInt();
//            if(num != -1)
//                sum += num;
//            else break;
//        }
//        System.out.println("Sum is:"+sum);
//        sc.close();

//        for (int i=1; i< num; i++){
//            if (i % 5 == 0 && i % 7 == 0){
//                System.out.println("Multiple number is: "+i);
//            break;
//            }
//        }
//        System.out.println("No multiple found");

//        for (int i = 1; i < 51; i ++){
//            if (i % 3 == 0)
//                continue;
//            else
//                System.out.println(i);
//        }

//        while (sum <=50){
//            sum ++;
//            if (sum % 3 == 0)
//                continue;
//            else
//                System.out.println(sum);
//        }

        for (int i = 1; i <= r; i ++){
            for ( int j=1;j<=i;j++){
                    {System.out.print("*");}
                }System.out.print(" ");
        }
    }
}
