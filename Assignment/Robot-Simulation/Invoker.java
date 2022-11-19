import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new ArrayList<>();
    
    public void takeCommand(Command command){
        commands.add(command);
    }

    public void placeCommand(){
        for(Command command: commands){
            command.execute();
        }
    }
}
