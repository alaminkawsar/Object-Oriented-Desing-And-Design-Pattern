public class WalkForward implements CommandPattern{
    private ControllableRobot robot;

    public WalkForward(ControllableRobot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.walk_forward();
    }
}
