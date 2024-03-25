import java.util.Scanner;

public class NumberGuess  {


    public static void main(String[] args) {
        int Rand = (int)(Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter starting range for upto 100 digits random number: ");
        int  num = sc.nextInt();
        int randomNumber = Rand + num;
        //23System.out.println("Random Number is: "+ randomNumber);
        int noOfGuess = 6;
        int tries = noOfGuess;
        int guessNo = 1;
        System.out.println("You have "+ noOfGuess +" tries to guess the number... Good Luck.!!");
        do {
            System.out.println("Your guess no.: "+guessNo);
            guessNo++;
            int guess = sc.nextInt();
            if (guess == randomNumber){
                System.out.println("Congrats You have guessed correct..!!!!");
                break;
            }
            if (guess > randomNumber){
                System.out.println("Guess little smaller please..!!");
            }else{
                System.out.println("Guess little bigger please..!!");
            }
            if(--noOfGuess == 0){
                System.out.println("You have lost the game..!!");
                break;
            }
            System.out.println("Tries left: " + (tries - guessNo+1));
        }while (true);
        sc.close();
    }
}