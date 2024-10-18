import java.util.Arrays;
public class Nineteen {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total=0;
        for(int i = 0;i<arr.length;i++){
            int randomNumber = (int)(Math.random()*100);
            arr[i]=randomNumber;
            total+=arr[i];
        }
        double average = total/10;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>average){
                System.out.println(arr[i]);
            }
        }
        
    }
    
}
