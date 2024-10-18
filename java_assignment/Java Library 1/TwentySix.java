import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class TwentySix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter start year in format DD-MM-YYY");
        String start = sc.nextLine();
        System.out.println("Enter ending date in format DD-MM-YYYY");
        String end = sc.nextLine();
        LocalDate s = LocalDate.parse(start,form);
        LocalDate e = LocalDate.parse(end,form);
        long days = ChronoUnit.DAYS.between(s,e);
        System.out.println(days);

    }
}
