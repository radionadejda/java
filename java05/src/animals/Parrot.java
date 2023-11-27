package animals;

public class Parrot extends AbstractAnimal {
    @Override
    public void speak(){
        System.out.println("i'm a parrot i say gimme food");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("i'm a parrot and i fly");
    }
    @Override
    public void eat(String food, String animal) {
        super.eat("seeds", "parrot");
    }
}
