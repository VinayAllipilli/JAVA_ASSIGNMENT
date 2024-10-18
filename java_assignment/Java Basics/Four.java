import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your day from 1 to 7 starting from Monday as 1 :");
        int day = sc.nextInt();
        System.out.println("Enter your working hours of that day");
        int hours = sc.nextInt();

        int amount = switch(day){
            case 1,2,3 ->200;
            case 4,5  -> 400;
            case 6  -> 600;
            case 7  -> 800;
            default ->0;
        };
        int total = amount*hours;
        if( total>2000){
            total=total+(total*10)/100;
            System.out.println("Total with 10% bonus : "+total);
        }else{
            System.out.println(total);
        }
        
    }
}
