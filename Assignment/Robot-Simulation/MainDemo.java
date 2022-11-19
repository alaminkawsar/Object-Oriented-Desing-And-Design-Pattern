public class MainDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();

        GoBakcward goBakcward = new GoBakcward(robot);
        Stop stop = new Stop(robot);
        TurnLeft turnLeft = new TurnLeft(robot);
        TurnRight turnRight = new TurnRight(robot);
        WalkForward walkForward = new WalkForward(robot);
        
        Invoker invoker = new Invoker();
        invoker.takeCommand(turnRight);
        invoker.takeCommand(walkForward);
        invoker.takeCommand(goBakcward);

        invoker.placeCommand();
    }
    
}
