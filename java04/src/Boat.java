public class Boat implements Swimmable {
    @Override
    public void swim() {
        refuel();
        System.out.println("i'm a boat i swim");
    }

    private void refuel() {
        System.out.println("i'm a boat gimme fuel");
    }
}
