import java.util.*;

public class TwentyEight implements Comparable<TwentyEight> {

    private int prod_id;
    private String prod_name;
    private double price;

    public TwentyEight(int prod_id, String prod_name, double price) {
        if (prod_id <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
        if (prod_name == null || prod_name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }

        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
    }

    @Override
    public int compareTo(TwentyEight that) {
        if (this.price > that.price) {
            return -1;
        } else if (this.price < that.price) {
            return 1;
        }
        return 0;
    }

    public void setProd_id(int prod_id) {
        if (prod_id <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
        this.prod_id = prod_id;
    }

    public void setProd_name(String prod_name) {
        if (prod_name == null || prod_name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        this.prod_name = prod_name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public int getProd_id() {
        return prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public double getPrice() {
        return price;
    }
}
