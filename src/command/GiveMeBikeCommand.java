package command;

import factory.ToysFactory;

public class GiveMeBikeCommand implements Command{
    @Override
    public void execute() {
        new ToysFactory().createToy("Bike");
    }
}
