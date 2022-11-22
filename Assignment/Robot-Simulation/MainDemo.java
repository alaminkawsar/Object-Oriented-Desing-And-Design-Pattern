/* Command Design Pattern is Used */

public class MainDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();

        GoBackward goBackward = new GoBackward(robot);
        Stop stop = new Stop(robot);
        TurnLeft turnLeft = new TurnLeft(robot);
        TurnRight turnRight = new TurnRight(robot);
        WalkForward walkForward = new WalkForward(robot);
        
        Invoker invoker = new Invoker();

        invoker.takeCommand(turnRight);
        invoker.takeCommand(walkForward);
        invoker.takeCommand(goBackward);
        invoker.takeCommand(walkForward);
        invoker.takeCommand(walkForward);

        




        invoker.placeCommand();
    }
    
}
