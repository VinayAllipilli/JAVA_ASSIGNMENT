import java.io.*;

public class TwentyFour{
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("Marks.txt");
            fw.write("20");
            fw.write("30");
            fw.flush();

        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}