public class TestChain {
    public static void main(String[] args){
        Account account = new Account("Kawsar",1000);

        int amount = 100000;
        AuthorizationChain authorizationChain = new AuthorizationChain();

        boolean isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);

        if(isAuthorized){
            account.withdraw(amount);
        }else{
            System.out.println("Can't possible");
        }

        //Calling chain of responsibility
        
    }
}
