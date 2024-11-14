public class Account {
    private String  user;
    private double balance;

    public Account(){
        user="Unknown";
        balance=0.0;
    }
    public void add(double amt){
         balance=balance+amt;
    }
    public void deduct(double amt){
        balance=balance-amt;
    }
    public double getCurrentBalance(){
        return balance;
    }
    public String getOwnerName(){
        return user;
    }
    public void setName(String name){
      user=name;
    }
    public void setInitialBalance(double bal){
        balance=bal;
    }
}
