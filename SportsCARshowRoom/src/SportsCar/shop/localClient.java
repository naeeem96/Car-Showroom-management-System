
package SportsCar.shop;

import java.util.ArrayList;

public class localClient extends client implements buy{
    double p;
    public localClient(String nameC, String addressC, String numberC) {
        super(nameC, addressC, numberC);
    }
    @Override
    public void buyCar(String name){
        boolean flag=false;
        for(bugatti a : bb){
            if(a.getModel().equals(name)){
                p = a.getPrice();
                System.out.println("Booking done!!");
                System.out.println("Brand  : " + a.getBrand());
                System.out.println("Model  : " + a.getModel());
                System.out.println("Price  : $" + p);
                flag = true; break;
            }
        }
        for(RollsRoyce b : rr){
            if(b.getModel().equals(name)){
                p = b.getPrice();
                System.out.println("Booking done!!");
                System.out.println("Brand  : " + b.getBrand());
                System.out.println("Model  : " + b.getModel());
                System.out.println("Price  : $" + p);
                flag = true; break;
            }
        }
        if(!flag) System.out.println("There is no stock");
    }
    
}
