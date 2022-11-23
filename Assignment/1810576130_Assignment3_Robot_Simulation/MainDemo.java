import java.util.ArrayList;
import java.util.List;

/* Command Design Pattern is Used */
// 
public class MainDemo {
    public static void main(String[] args) {
        RobotSimulation robotSimulation = new RobotSimulation();
        ControllableRobot robot = robotSimulation.getRobot();

        CommandPattern goBackward = new GoBackward(robot);
        CommandPattern stop = new Stop(robot);
        CommandPattern turnLeft = new TurnLeft(robot);
        CommandPattern turnRight = new TurnRight(robot);
        CommandPattern walkForward = new WalkForward(robot);
        
        Invoker invoker = new Invoker();
        
        // Let's make a command list
        int list[]={3,3,3,3,0,0,2,1,2,2,1,1,1,1,4,3,3,3,1,1,1};
        List<CommandPattern> commands = new ArrayList<>();
        commands.add(goBackward);
        commands.add(walkForward);
        commands.add(turnLeft);
        commands.add(turnRight);
        commands.add(stop);
        
        //take command using the number
        for(int x: list){
            invoker.takeCommand(commands.get(x));
        }
    
        invoker.placeCommand(robotSimulation);
    }
    
}
