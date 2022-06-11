import command.GiveMeBikeCommand;
import santa.Santa;

public class Application {
    public static void main(String[] args){
        Santa.getInstance().setCommand(new GiveMeBikeCommand());
        Santa.getInstance().executeCommand();
    }
}
