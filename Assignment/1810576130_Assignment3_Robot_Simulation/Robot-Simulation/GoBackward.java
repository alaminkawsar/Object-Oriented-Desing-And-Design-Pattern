public class GoBackward implements CommandPattern {
    private ControllableRobot robot;

    public GoBackward(ControllableRobot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.go_backward();
    }
}
