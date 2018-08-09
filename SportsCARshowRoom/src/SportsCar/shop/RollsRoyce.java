
package SportsCar.shop;

public class RollsRoyce extends vehicles{
    private String ClientType;
 
    public RollsRoyce(String Brand, String model, double price,String ClientType) {
        super(Brand, model, price);
        this.ClientType = ClientType;
    }

    public String getClientType() {
        return ClientType;
    }
    
}
//Rolls-Royce Phantom           Prices Starting at $420,325
//Rolls-Royce Ghost Series II   Prices Starting at $308,300