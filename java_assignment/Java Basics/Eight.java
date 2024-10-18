import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            System.out.println("Enter number "+(i+1)+": ");
            int num = sc.nextInt();
            arr[i]=num;
        }
         System.out.println(Arrays.toString(arr));
        
        int arrayEl = arr.length-1;
        int temp[]=arr;
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<=arrayEl;i++){
            temp[i]=arr[arrayEl-i];
            // System.out.println(temp[i]);
        }
        System.out.println(Arrays.toString(temp));
    }
}
