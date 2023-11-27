public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Boat boat = new Boat();

        SwimExecutor swimExecutor = new SwimExecutor();

        swimExecutor.makeSwim(fish);
        swimExecutor.makeSwim(boat);
    }
}