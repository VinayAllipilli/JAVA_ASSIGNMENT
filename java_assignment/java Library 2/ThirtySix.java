import java.io.*;
public class ThirtySix {
    public static void main(String[] args) {
        try{
            FileReader fr =new FileReader("marks.txt");
            BufferedReader br  = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                String[] arr = line.split(",");
                int total =0;
                for(String a :arr){
                    total=total+(Integer.parseInt(a));
                }
                System.out.println(total);
            }
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
