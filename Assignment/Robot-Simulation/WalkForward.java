public class WalkForward implements Command{
    private Robot robot;

    public WalkForward(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.walk_forward();
    }
}
