package santa;

import command.Command;

public class Santa {

    private static Santa instance;

    private Command command;

    /**
     * Does it count if i just use spring boot and annotate the santa class with the @Component :D
     */
    private Santa() {
    }

    public static Santa getInstance() {
        if(instance == null) {
            instance = new Santa();
        }
        return instance;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if(this.command == null) {
            System.out.println("No command set");
            return;
        }
        this.command.execute();
    }
}
