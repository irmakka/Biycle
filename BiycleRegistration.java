
public  class BiycleRegistration {
    public static void main(String[] args) {
      Biycle biycle=new Biycle();
      Account account= new Account();
      String myname="Irmak Kahya";
      biycle.setName(myname);
      account.setName(myname);
      account.setInitialBalance(250.0);
      account.add(50.00);
      account.deduct(25.00);
      System.out.println(biycle.getName()+" owns a bicycle and");
      System.out.println( "has $"+account.getCurrentBalance());
    }
}