package factory;

public class ToysFactory {
    public Toys createToy(String toyName) {
        if(toyName == "Bike") {
            return new Bike();
        }
        if(toyName == "Doll") {
            return new Doll();
        }
        System.out.println("Unknown Toy");
        return null;
    }
}
