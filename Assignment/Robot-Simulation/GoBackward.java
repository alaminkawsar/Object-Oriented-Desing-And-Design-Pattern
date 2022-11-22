public class GoBackward implements Command {
    private Robot robot;

    public GoBackward(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.go_backward();
    }
}
