public class MoneyTransaction {

    public static void main(String[] args) {
        System.out.println();

        // account balance 10^8
        Account account = new Account("Kawsar", 100000000);
        AuthorizationChain authorizationChain = new AuthorizationChain();


        /* First Transaction, Just Authorized by Cashier*/
        int amount = 1000;
        boolean isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);
        if(isAuthorized){
            account.withdraw(amount);
        }
        System.out.println();


        /* Second Transaction, Must be Authorized  by Cashier and Manager*/
        amount = 100000;
        isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);
        if(isAuthorized){
            account.withdraw(amount);
        }
        System.out.println();


        /*Third Transaction, Must be authorized From Manager and Senior Officer*/
        amount = 10000000;
        isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);
        if(isAuthorized){
            account.withdraw(amount);
        }
        System.out.println();

        /*Fourth Transaction, This Transaction Can't possible Because more than ammount */
        amount = 100000000;
        isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);
        if(isAuthorized){
            account.withdraw(amount);
        }
        System.out.println();
    }
}
