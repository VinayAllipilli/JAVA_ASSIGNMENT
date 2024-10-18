import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwentyFive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        while(true){
            System.out.println("Enter names :");
            String x = sc.nextLine();
            if(x.equalsIgnoreCase("end")){
                break;
            }
            a.add(x);
        }
        System.out.println((String.join("-",a)));
        
    }
}