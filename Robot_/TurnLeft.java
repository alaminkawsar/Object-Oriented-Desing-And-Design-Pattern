public class TurnLeft implements CommandPattern {
    private ControllableRobot robot;

    public TurnLeft(ControllableRobot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.turnLeft();
    }
}
