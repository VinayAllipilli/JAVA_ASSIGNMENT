import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber =(int)Math.random()*25;

        int count = 1;
        while(true){
            System.out.println(" enter your guess "+count);
            int num =sc.nextInt();
            if(count==3){
                System.out.println("Maximum guesses are over.Better Luck next time");
                break;
            }
            if(num==randomNumber){
                System.out.println("Congrats your guess is correct!!");
                break;
            }else{
                System.out.println("Sorry! Try Again.");
                count++;

            }
        }

    }
}
