public class Nine{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,6};
        System.out.println(largestInteger(a));
        
    }
    
    public static int largestInteger(int[] arr){
        int larger = 0;
        for(int a:arr){
            if(a>larger){
                larger=a;
            }
        }
        return larger;

    }
}