public class MoneyTransaction {

    public static void main(String[] args) {
        System.out.println();

        // account balance 10^8
    Account account = new Account("Kawsar", 100000000);
        AuthorizationChain authorizationChain = new AuthorizationChain();

        int amount = 10000;

        boolean isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);

        if(isAuthorized){
            account.withdraw(amount);
        }
    }
}
