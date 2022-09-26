public class Account {
    public String accountName;
    public int balance;

    public Account(String name, int balance){
        this.accountName = name;
        this.balance=balance;
    }
    public void withdraw(int amount){
        this.balance-=amount;
        System.out.println(amount+"/- Transaction is Successful");
        System.out.println("Your Present Balance is: "+this.balance+"/-");
    }
}
