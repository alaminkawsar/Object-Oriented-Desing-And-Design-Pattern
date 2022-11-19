public class GoBakcward implements Command {
    private Robot robot;

    public GoBakcward(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.go_backward();
    }
}
