public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private int price;
    private String vendor;

    public Product() {
    }

    public Product(int id, String name, int price, String vendor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.vendor = vendor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return id + ","
                + name + ","
                + price + ","
                + vendor + ","
                + "\n";
    }

    public String display() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", vendor=" + vendor +
                '}' + "\n";
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()){
            return 1;
        }return -1;
    }
}
