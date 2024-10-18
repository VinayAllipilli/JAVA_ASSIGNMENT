import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        String numStr = Integer.toString(num);
    
        String rev = new StringBuilder(numStr).reverse().toString();
        int revNum = Integer.parseInt(rev);
        System.out.println(revNum);

        

    }
}
