
package SportsCar.shop;

public class vehicles {
    private String Brand,model;
    private double price;

    public vehicles(String Brand, String model, double price) {
        this.Brand = Brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    
}
