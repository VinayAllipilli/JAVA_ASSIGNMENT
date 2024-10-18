import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThirtyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter file = new FileWriter("names.txt");
            BufferedWriter bw = new BufferedWriter(file); 
            while(true){
                System.out.println("Enter name and type \"end\" to terminate");
                String line = sc.nextLine();
                if(line.equalsIgnoreCase("end")){
                    break;
                }
                bw.write(line);
                bw.newLine();
                
            }
            bw.flush();
            bw.close();
            sc.close();
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
