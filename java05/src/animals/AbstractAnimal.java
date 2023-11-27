package animals;
public abstract class AbstractAnimal {
    public abstract void speak();

    public void move() {
        System.out.println("i live in the zoo and i move around");
    }

    public void eat(String food, String animal) {
        System.out.println("i'm a "+animal+". "+"i'd like to eat "+food);
    }
}
