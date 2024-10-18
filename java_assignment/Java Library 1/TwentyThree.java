public class TwentyThree {
    public static void main(String[] args) {
        String a = "ViNaY";
        String b="";
        for(int i =0;i<a.length();i++){
            if(Character.isUpperCase(a.charAt(i))){

                b+=Character.toLowerCase(a.charAt(i));
            }else if(Character.isLowerCase(a.charAt(i))){
                b+=Character.toUpperCase(a.charAt(i));
            }
        }
        System.out.println(b);
    }
}
