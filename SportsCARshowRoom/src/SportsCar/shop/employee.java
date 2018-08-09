package SportsCar.shop;

public class employee {
    private String Name, Id, Age, Email, Address;
    private int AvgWorkingHour, PhoneNumber, Salary, ServicePeriod;
    public int account;
    public employee(String Name, String Id, String Age, String Email, String Address, 
                    int AvgWorkingHour, int PhoneNumber, int Salary, int ServicePeriod) {
        this.Name = Name;
        this.Id = Id;
        this.Age = Age;
        this.Email = Email;
        this.Address = Address;
        this.AvgWorkingHour = AvgWorkingHour;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.ServicePeriod = ServicePeriod;
        account = account + Salary;
    }
    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }
    public int getAvgWorkingHour() {
        return AvgWorkingHour;
    }
    public int getSalary() {
        return Salary;
    }
    public int getServicePeriod() {
        return ServicePeriod;
    }
   //The minimum average working hours for all employees is 8 hours/day
   void checkMinimumAverageWorking(){
       if(AvgWorkingHour < 8){
           System.out.println("10% Fine");
       }
       else System.out.println("No Fine!! You are lucky :p ");
   }
   //WithdrawMoney-ALL
    private int WthdrawMoney;
    void widrawMoney(int money){
        System.out.println("\nBank info : WthdrawMoney : ");
        System.out.println("Your Account money : "+ account);
        if(money <= account){
            System.out.println("withdraw money : "+money+" Done!!");
            WthdrawMoney += money;
            money = account-money;
            //setAccount(money);
            System.out.println("Your Account money : " +money);
        }else System.out.println("Bank is now Fokir, You can't withdraw money (MangersWthdrawM)");
        System.out.println("");
    }
}
