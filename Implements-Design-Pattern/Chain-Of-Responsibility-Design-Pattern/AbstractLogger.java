public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element
    protected AbstractLogger nexLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nexLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if(level<=1){
            write(message);
        }else if(level<=2){
            write(message);
            if(this.level<2) nexLogger.logMessage(level, message);
        }else if(level<=3){
            if(this.level<2){
                nexLogger.logMessage(level, message);
            }else{
                write(message);
                if(nexLogger!=null) nexLogger.logMessage(level, message);
            }
        }
    }

    abstract protected void write(String message);

}