import java.util.Scanner;

public class Five{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int i = 0;
        while(i<=4){
            System.out.println("Enter Number "+(i+1)+" : ");
            int num = sc.nextInt();
            total+=num;
            i++;
        }
        double average = total/5;
        System.out.println("Average of five numbers is : "+average);
        sc.close();
}
}