import java.io.*;
import java.util.Scanner;

public class ThirtyEight {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the file name :");
            String f = sc.nextLine();
            FileReader file = new FileReader(f);
            int data;
            while((data=file.read())!=-1){
                System.out.print(Character.toUpperCase((char)data));
            }

        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
