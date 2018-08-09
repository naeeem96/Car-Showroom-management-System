package SportsCar.shop;

import java.util.ArrayList;

public class foreignClient extends client implements buy{
    private String country;
    private double tax = 0.25, p;

    public foreignClient(String nameC, String addressC, String numberC, String country) {
        super(nameC, addressC, numberC);
         this.country = country;
    }
    @Override
    public void buyCar(String name){
        boolean flag=false;
        for(bugatti a : bb){
            if(a.getModel().equals(name)){
                p = a.getPrice() + (a.getPrice()*tax);
                System.out.println("Booking done!!");
                System.out.println("Brand  : " + a.getBrand());
                System.out.println("Model  : " + a.getModel());
                System.out.println("Price  : $" + p +" ,Tax Included("+(a.getPrice()*tax)+")");
                flag = true; break;
            }
        }
        for(RollsRoyce b : rr){
            if(b.getModel().equals(name)){
               p = b.getPrice() + (b.getPrice()*tax);
                System.out.println("Booking done!!");
                System.out.println("Brand  : " + b.getBrand());
                System.out.println("Model  : " + b.getModel());
                System.out.println("Price  : $" + p +" ,Tax Included("+(b.getPrice()*tax)+")");
                flag = true; break;
            }
        }
        if(!flag) System.out.println("There is no stock");
    }

}
