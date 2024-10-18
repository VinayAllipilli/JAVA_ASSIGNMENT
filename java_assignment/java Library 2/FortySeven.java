import java.nio.file.*;
import java.io.*;


public class FortySeven {
    public static void main(String[] args) {
        try{
            Path file = Paths.get("four.txt");
            if(!(Files.exists(file))){
                Files.createFile(file);
                
                
            }else{
                System.out.println("File Already exists");

            }
            Files.write(file,("fiewereh").getBytes());
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
