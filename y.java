public class y{
   public static void main(String[] args){
    Product product = new Product("chair",500.0);
    Product product1 = new Product("Television",20000.0);
    Product product2 = new Product("Iphon",40000.0);
    Product product3 = new Product("OOP Programming",250.0);
    
    product.Product_np();
    product1.Product_np();
    product2.Product_np();
    product3.Product_np();
   }
}

class Product{
    public String name;
    public Double price;
    
    Product(String name,Double price){
        this.name = name;
        this.price=price;
        
    }
}
public void Product_np(){
    System.out.println(this.name+"is Product_np");
} 
   