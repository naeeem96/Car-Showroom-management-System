
package SportsCar.shop;

import java.util.ArrayList;

public class importCar {
    String name,model,date;

    public importCar(String name, String model, String date) {
        this.name = name;
        this.model = model;
        this.date = date;
    }
    public importCar() {        //Contructor Ovreloading
        
    }
    
    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public String getDate() {
        return date;
    }
    
    ArrayList <importedLondonUnitedKingdom> K;
    ArrayList <importedUSA> S;
    
    void assignArrayList(ArrayList <importedLondonUnitedKingdom> a, ArrayList <importedUSA> b){
        K = a;    S = b;
    }
    public void showRoom(){
        System.out.println("\n\nCar DataBase : ");
        System.out.println("..............");
        try{
            for(importedLondonUnitedKingdom x : K){
                System.out.println("Brand          : " + x.getName());
                System.out.println("Model          : " + x.getModel());
                System.out.println("Shipment Date  : " + x.getDate());
                System.out.println("");
            }
            for(importedUSA y : S){
                System.out.println("Brand          : " + y.getName());
                System.out.println("Model          : " + y.getModel());
                System.out.println("Shipment Date  : " + y.getDate());
                System.out.println("");
            }
        }
        catch(NullPointerException e){
            System.out.println("Error!!");
        }
    } 
    //Bugatti Veyron     Price Starting at $1,914,000
    //Bugatti Chiron     Price Starting at $2,998,000
    //Rolls-Royce Phantom           Prices Starting at $420,325
    //Rolls-Royce Ghost Series II   Prices Starting at $308,300
}
