
package SportsCar.shop;

import java.util.ArrayList;

public class client {

    private String nameC,addressC,numberC;
    ArrayList <bugatti> bb;
    ArrayList <RollsRoyce> rr;
    
    public  client(String nameC, String addressC, String numberC) {
        this.nameC = nameC;
        this.addressC = addressC;
        this.numberC = numberC;
    }
    void assignArrayList(ArrayList <bugatti> b, ArrayList <RollsRoyce> r){
        bb = b;    rr = r;
    }
    public void showCar(){
        for(bugatti a : bb){
            System.out.println("Brand : " + a.getBrand());
            System.out.println("Model : " + a.getModel());
            System.out.println("Price : $" + a.getPrice());
            System.out.println("");
        }
        for(RollsRoyce b : rr){
            System.out.println("Brand  : " + b.getBrand());
            System.out.println("Model  : " + b.getModel());
            System.out.println("Price  : $" + b.getPrice());
            System.out.println("Member : " + b.getClientType());
            System.out.println("");
        }
    } 
}
