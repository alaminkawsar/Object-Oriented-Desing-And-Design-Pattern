public class AuthorizationChain {

    public AuthorizationChain(){

    }
    public static AccountHandler getChainHandler(){
        Cashier cashieHandler = new Cashier(AccountHandler.LEVEL1);
        Manager managerHandler = new Manager(AccountHandler.LEVEL2);
        Senior_Officer senior_OfficerHandler = new Senior_Officer(AccountHandler.LEVEL3);

        cashieHandler.setNextLogger(managerHandler);
        managerHandler.setNextLogger(senior_OfficerHandler);

        return cashieHandler;
    }
    public boolean authorizeWithdrawal(Account account,int amount){
        // Suppose account have balance 10^8, so 10^9 will not transaction

        AccountHandler accountHandler = getChainHandler();
        if(account.balance<amount){
            System.out.println(amount+"/- Transaction Can't possible\nYou have Not Sufficeint Balance.\nYour Account Balance is: "+account.balance+"/-");
            return false;
        }
        accountHandler.logMessage(account, amount);

        return true;

    }
}
