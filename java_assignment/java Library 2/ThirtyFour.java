import java.io.FileReader;
import java.io.IOException;

public class ThirtyFour {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("t34.txt");
            int data;
            int upperCount=0;
            int lowerCount=0;
            while((data=file.read())!=-1){
                char ch = (char) data;
                if(Character.isUpperCase(ch)){
                    upperCount++;
                }
                else if(Character.isLowerCase(ch)){
                    lowerCount++;
                }

            }
            System.out.println("LowerCase Characters count :"+lowerCount);
            System.out.println("UpperCase Characters count :"+upperCount);
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
