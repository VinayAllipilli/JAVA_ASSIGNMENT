import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int fact =1;
        for(int i = 1;i<number;i++){
            if(number%i==0){
                fact=i;
            }
        }
        System.out.println(fact);

    }
}
