class Product{
    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;

    public Product(){

    }

    public Product(int prod_id,double price){
        this.prod_id = prod_id;
        this.price=price;
    }


    public Product(int prod_id, String prod_name, double price, int quantity_on_hand) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = quantity_on_hand;
    }



    public int getProd_id() {
        return this.prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return this.prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity_on_hand() {
        return this.quantity_on_hand;
    }

    public void setQuantity_on_hand(int quantity_on_hand) {
        this.quantity_on_hand = quantity_on_hand;
    }

    public double getNetPrice(){
        return price+(price*0.12);
    }
    public int purchase(int quantity){
        return quantity_on_hand+=quantity;

    }
    public int sell(int sold){
        return quantity_on_hand-=sold;
    }


}