package PL.SDA;

public class Booklist {
    private String name;
    private float price;
    private boolean inStock;
    private String author;

    public Booklist(String name, float price, boolean inStock, String author){
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.author = author;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
    public void setInStock(boolean inStock){
        this.inStock = inStock;
    }
    public boolean getInStock(){
        return inStock;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
        }

    @Override
    public String toString() {
        return "Booklist{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", author='" + author + '\'' +
                '}';
    }

}
