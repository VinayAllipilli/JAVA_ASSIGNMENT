import java.io.*;
import java.util.regex.*;
public class FortyFive {
    public static void main(String[] args) throws IOException{
        
    
    
        FileReader file = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(file);
        String regex = "\\s\\s";
        String line;
        while((line=br.readLine())!=null){
            String result = line.replaceAll(regex," ");
            System.out.println(result);
        }
        
        

}
}