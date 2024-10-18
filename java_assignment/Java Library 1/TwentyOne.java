import java.util.Arrays;
import java.util.List;

public class TwentyOne {
    public static void main(String[] args) {
        String a = "10,20,20,40,50";
        List<String> b = Arrays.asList(a.split(","));
        int total = b.stream().map(Integer::parseInt).reduce(0,((x,y)->x+y));
        System.out.println(total);
    }
}
