import java.util.Arrays;

class Fourteen {
    private int number;
    public Fourteen(){
        number=0;
    }   
    public Fourteen(int number){
        this.number = number;
    } 
    public int increment(){
        return number++;
    }
    public int decrement(){
        return number--;
    }
    public String toString(){
        return "num : "+number;
    }
    public static void main(String [] args){
        Fourteen f = new Fourteen();
        Fourteen f2 = new Fourteen(5);
        f2.increment();
        f.decrement();
        System.out.println(f2);
        System.out.println(f);
    }
}
