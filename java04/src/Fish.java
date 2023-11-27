public class Fish implements Swimmable {
    @Override
    public void swim() {
        eat();
        System.out.println("i'm a duck i swim");
    }

    private void eat() {
        System.out.println("i'm a duck gimme food");
    }
}
