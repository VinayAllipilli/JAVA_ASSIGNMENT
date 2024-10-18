class Employees {
    private int emp_id;
    private String emp_name;
    public Employees(int emp_id,String emp_name){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
    }    
    public String emp(){
        return "id :"+emp_id+" emp_name "+emp_name;
    }

}
class FactoryClass extends Employees{
    private int bus_no;
    private String emp_boards;
    public FactoryClass(int emp_id,String emp_name,int bus_no,String emp_boards){
        super(emp_id,emp_name);
        this.bus_no=bus_no;
        this.emp_boards=emp_boards;
    } 
    public void emps(){
        super.emp();
    }


}
