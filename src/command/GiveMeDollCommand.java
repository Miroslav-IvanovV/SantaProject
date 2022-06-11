package command;

import factory.ToysFactory;

public class GiveMeDollCommand implements Command{
    @Override
    public void execute() {
        new ToysFactory().createToy("Doll");
    }
}
