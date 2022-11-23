import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<CommandPattern> commands = new ArrayList<>();
    
    public void takeCommand(CommandPattern command){
        commands.add(command);
    }

    public void placeCommand(RobotSimulation vSimulation){
        for(CommandPattern command: commands){
            command.execute();
            vSimulation.repaintAndUpdate();
            try {
                Thread.sleep(500);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
        }
    }
}
