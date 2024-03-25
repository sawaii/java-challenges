public class NumTest {
    public static void main(String[] args) {
        int firstNum = 22, secondNum = 14, thirdNum = 18;

        if (firstNum >= secondNum){
            if(firstNum >= thirdNum){
                System.out.println("firstNum is greatest");
            }
        }else if(secondNum >= thirdNum){
            System.out.println("secondNum is greatest");
        }else{
            System.out.println("third num is greatest");
        }
    }
}
