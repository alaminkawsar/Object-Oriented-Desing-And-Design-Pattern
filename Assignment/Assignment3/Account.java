public class Account {

    private String accName;
    private int balance;

    Account(String name, int balance){
        this.accName=name;
        this.balance=balance;
    }

    public String getAccount(){
        return accName;
    }
    public int getAmmount(){
        return balance;
    }

    public void withdraw(int amount){
        AuthorizationChain chain = new AuthorizationChain();

        chain.process(new Account("alamin", amount));
    }


}
