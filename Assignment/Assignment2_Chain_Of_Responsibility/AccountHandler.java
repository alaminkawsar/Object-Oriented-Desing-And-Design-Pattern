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

    public void logMessage(Account account,int amount){

        if(amount<=LEVEL1){
            write(authorizedMessage);
        }
        else if(amount<=LEVEL2){
            write(authorizedMessage);
            if(this.amount<LEVEL2){
                nextHandler.logMessage(account, amount);
            }
            //write(authorizedMessage);
        }
        else{
            if(this.amount<LEVEL2){
                nextHandler.logMessage(account, amount);
            }else{
                write(authorizedMessage);
                if(nextHandler!=null){
                    nextHandler.logMessage(account, amount);
                }
                // write(authorizedMessage);
            }
        }
    }

    abstract protected void write(String message);
}
