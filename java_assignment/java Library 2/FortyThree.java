import java.util.regex.*;
public class FortyThree {
    public static void main(String[] args) {
        String input ="DZTPA5927D";
        String regex = "^[A-Z]{5}+\\d{4}[A-Z]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        if(match.find()){
            System.out.println("Matched :"+match.group());
        }else{
            System.out.println("No Match found");
        }
    }
}
