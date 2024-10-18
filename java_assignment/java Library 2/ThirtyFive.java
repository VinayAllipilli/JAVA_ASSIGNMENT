import java.io.*;
public class ThirtyFive {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(f);
            String line ;
            while((line=br.readLine())!=null){
                int length = line.length();
                if(length>5 ||length<5){
                    continue;
                }else{
                    System.out.println(line);
                }


            }

        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}