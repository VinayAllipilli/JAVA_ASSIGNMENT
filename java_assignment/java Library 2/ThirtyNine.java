import java.io.*;
import java.util.*;
public class ThirtyNine {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr)){
            String line;
            Set<String> sorts = new TreeSet<>();
            while((line=br.readLine())!=null){
                
                sorts.add(line);
            }
            System.out.println(sorts);
            
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
