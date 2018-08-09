
package SportsCar.shop;

public class manager extends employee{
    public manager(String Name, String Id, String Age, String Email, String Address, int AvgWorkingHour, int PhoneNumber, int Salary, int ServicePeriod) {
        super(Name, Id, Age, Email, Address, AvgWorkingHour, PhoneNumber, Salary, ServicePeriod);
    }
    
    //2 festival bonuses in a year
    int cnt=2; double sum = getSalary();
    void festival_bonuses_year(){
        if( cnt >0 && getSalary() > 12) { sum += getSalary()*0.7; 
            System.out.println("Salary :"+getSalary()+", Bonus :"+getSalary()*0.7+", Total : "+sum+", turn left: "+(cnt-1));
        }
        else System.out.println("Sorry!!! Cant take bonus anymore  !!");
        cnt--;
    }
    
    //Every employee can take the following number of days of paid leave every year:
    void paidLeaveEveryYear(int leave){
        if(leave > 25){
            System.out.println("Fine for Paid Leave (Manager): "+ (leave-25)+" Days");
        }else System.out.println("No fine for Paid Leave (Manager)");
    }
    
}
