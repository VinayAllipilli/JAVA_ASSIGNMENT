public class Products {
    private int prod_id;
    private String prod_name;
    private double price;


    public Products(int prod_id,String prod_name,double price){
        this.prod_id = prod_id;
        this.prod_name=prod_name;
        this.price = price;
    }

    public void print(){
        System.out.println("Product id :"+prod_id+"\nProduct name :"+prod_name+"\nPrice:"+price);
    }

    public void setPrice(){
        this.price = price;
    }
    public double getNetPrice(){
        return price+(price*0.10);

    }
    public static void main(String[] args) {
        ImportedProducts p = new ImportedProducts(2, null, 200000, 3);
        Products x = (Products)p;
        System.out.println(x.getNetPrice());
        Products down = new Products(2,"ddd", 334430);
        ImportedProducts px= (ImportedProducts)down;
        px.setImportDuty(500);


    }

}
class ImportedProducts extends Products{
    private double importDuty;
    public ImportedProducts(int prod_id,String prod_name,double price,double importDuty){
        super(prod_id, prod_name, price);
        this.importDuty=importDuty;
    }
    public double getImportDuty(){
        return this.importDuty;
    }
    public void setImportDuty(int importDuty){
        this.importDuty=importDuty;
    }
}
class DiscountProducts extends Products{
    private double discount;
    public DiscountProducts(int prod_id,String prod_name,double price,double discount){
        super(prod_id, prod_name, price);
        this.discount = discount;
    }
    public void setDiscountRate(){
        this.discount=discount;
    }
}





