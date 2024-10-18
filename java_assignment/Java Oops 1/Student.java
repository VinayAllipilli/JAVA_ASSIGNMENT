public class Student {
    private int admin_no;
    private String student_name;
    private String course_joined="JAVA";
    private int fees_paid;
    private final int JAVA_FEE=10000;
    private final int PYTHON_FEE=7500;
    private int amount;

    public Student(int admin_no,String student_name,String course_joined){
        this.admin_no=admin_no;
        this.student_name=student_name;
        this.fees_paid=fees_paid;
    }

    public int getTotalfee(){
        if(course_joined.equals("JAVA")){
            return JAVA_FEE;
        }
        else if(course_joined.equals("PYTHON")){
            return PYTHON_FEE;
        }
        return 0;

    }
    public int getFeePaid(int amount){
        return amount;
    }
    public int getDue(){
        if(course_joined.equals("JAVA")){
            return JAVA_FEE-getFeePaid(amount);
        }
        else if(course_joined.equals("PYTHON")){
            return PYTHON_FEE-getFeePaid(amount);
        }
        return 0;
    }
    public int payment(int amount){
        return amount;

    }
}
