import java.io.*;
import java.util.regex.*;
import java.util.*;
public class FortySix {
    public static void main(String[] args) throws IOException {
        String regex = "\\w+\\d+";
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        while(true){
            System.out.println("Enter strings :");
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("end")){
                break;
            }
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher =pattern.matcher(s);
            
            if(matcher.matches()){
                a.add(s);
            }else{
                System.out.println("Not matched try again");
            }
        }
        System.out.println(a);
        
    }
}
