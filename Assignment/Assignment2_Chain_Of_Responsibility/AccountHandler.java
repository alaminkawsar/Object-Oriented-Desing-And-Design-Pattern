public abstract class AccountHandler {
    public static int LEVEL1 = 10000;
    public static int LEVEL2 = 1000000;
    public static int LEVEL3 = LEVEL2+1;

    protected int amount;
    public String authorizedMessage="Authorized";

    // next upper stage
    protected AccountHandler nextHandler;

    public void setNextLogger(AccountHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public boolean logMessage(Account account,int amount){
        if(account.balance<amount){
            return false;
        }
        if(amount<=LEVEL1){
            write(authorizedMessage);
        }else if(amount<=LEVEL2){
            if(this.amount<LEVEL2){
                return nextHandler.logMessage(account, amount);
            }
            write(authorizedMessage);
        }else{
            if(this.amount<LEVEL2){
                return nextHandler.logMessage(account, amount);
            }else{
                write(authorizedMessage);
                if(nextHandler!=null){
                    return nextHandler.logMessage(account, amount);
                }
            }
        }
        return true;
    }

    abstract protected void write(String message);
}
