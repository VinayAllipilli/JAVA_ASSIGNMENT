import java.io.*;
import java.util.*;
public class Forty {
    public static void main(String[] args) {
        try{
            BufferedReader one = new BufferedReader(new FileReader("file.txt"));
            BufferedReader two = new BufferedReader(new FileReader("files.txt"));
            String line1;
            String line2;
            Set<String> x = new TreeSet<>();
            while((line1=one.readLine())!=null){
                x.add(line1);
            }
            while((line2=two.readLine())!=null){
                x.add(line2);
            }
            System.out.println(x);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
