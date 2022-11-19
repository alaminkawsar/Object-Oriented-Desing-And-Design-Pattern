public class Stop implements Command{
    private Robot robot;

    public Stop(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.stop();
    }
}
