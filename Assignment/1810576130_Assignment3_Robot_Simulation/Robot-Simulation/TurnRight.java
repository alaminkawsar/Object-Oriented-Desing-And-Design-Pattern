public class TurnRight implements CommandPattern {

    private ControllableRobot robot;

    public TurnRight(ControllableRobot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.turnRight();
    }
}
