import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total =0;
        while(true){
            System.out.println("Enter numbers and Enter 0 to terminate :");
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            total+=num;
        }
        System.out.println("Total is "+total);
    }
}