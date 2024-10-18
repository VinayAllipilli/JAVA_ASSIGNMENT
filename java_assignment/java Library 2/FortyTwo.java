import java.util.*;
public class FortyTwo {
    public static void main(String[] args) {
        Set<String> a = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        a.addAll(Arrays.asList("Vinay","rames","pardhu"));
        System.out.println(a);
    }
}
