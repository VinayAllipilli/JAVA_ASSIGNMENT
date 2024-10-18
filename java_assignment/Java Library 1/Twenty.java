import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String :");
        String a = sc.nextLine();
        int len = a.length();
        for(int i =0;i<len;i++){
            System.out.println(a.charAt(i));

        }


    }
}
