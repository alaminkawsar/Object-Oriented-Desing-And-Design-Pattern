public class Stop implements CommandPattern{
    private ControllableRobot robot;

    public Stop(ControllableRobot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.stop();
    }
}
