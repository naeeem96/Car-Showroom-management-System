package SportsCar.shop;

import java.util.ArrayList;

public class SportsCARshowRoom {

    public static void main(String[] args) {
        //Employee -> manager,mechanic,sellsMan
        //Name, Id, Age, Email, Address, AvgWorkingHour, PhoneNumber, Salary, ServicePeriod;
        manager  man = new manager ("Akash","1800","20","moyna@gmail.com","dhaka",9,155,300000,20);
        mechanic mac = new mechanic("Abir","45","62","abu@gmail.com","dhaka",8,177,30000,40);
        sellsMan sel = new sellsMan("Tonoy","65","23","babu@gmail.com","dhaka",7,177,2000,30);
        man.checkMinimumAverageWorking();
        mac.festival_bonuses_year();
        sel.paidLeaveEveryYear(30);
        man.widrawMoney(5000);
        
        //Showroom Car -> bugatti,RollsRoyce
        //Brand, model, price;
        bugatti bug1 = new bugatti("Bugatti","Bugatti Veyron",1914000);
        bugatti bug2 = new bugatti("Bugatti","Bugatti Chiron ",2998000);
        RollsRoyce RR1 = new RollsRoyce("Rolls-Royce","Rolls-Royce Phantom",420325,"yes");
        RollsRoyce RR2 = new RollsRoyce("Rolls-Royce","Rolls-Royce Ghost Series II ",308300,"no");
        ArrayList <bugatti> b = new ArrayList();     
        b.add(bug1); b.add(bug2);
        ArrayList <RollsRoyce> r = new ArrayList();  
        r.add(RR1); r.add(RR2);
        
        //Client -> foreignClient,localClient
        //nameC, addressC, numberC; country;
        foreignClient f1 = new foreignClient("bill gates","Seattle, Washington","999999","United States");  //Client
        localClient l1 = new localClient("Md. Abu Naeem","Dhaka, Bangladesh ","9999909");  //Client
        ArrayList <foreignClient> fore = new ArrayList();   fore.add(f1);
        ArrayList <localClient> local = new ArrayList();    local.add(l1);
        
        f1.assignArrayList(b, r); 
        f1.showCar();
        f1.buyCar("Rolls-Royce Phantom");
        
        //Import
        //name, model, date;
        importedLondonUnitedKingdom imUK1 = new importedLondonUnitedKingdom("Bugatti","Bugatti Veyron","30-07-2018");
        importedLondonUnitedKingdom imUK2 = new importedLondonUnitedKingdom("Bugatti","Bugatti Chiron","15-07-2018");
        importedUSA imUS1 = new importedUSA("Rolls-Royce","Rolls-Royce Phantom","1-08-2018");
        importedUSA imUS2 = new importedUSA("Rolls-Royce","Rolls-Royce Ghost Series II","2-08-2018");
        
        ArrayList <importedLondonUnitedKingdom> UK = new ArrayList();     
        UK.add(imUK1); UK.add(imUK2);
        ArrayList <importedUSA> US = new ArrayList();  
        US.add(imUS1); US.add(imUS1);
        
        importCar im = new importCar();
        im.assignArrayList(UK, US);
        im.showRoom();
        
    }
    
}
