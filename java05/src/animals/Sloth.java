package animals;

public class Sloth extends AbstractAnimal {
    @Override
    public void speak(){
        System.out.println("i'm a sloth i'm not very talkative");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("i'm a sloth so i move very very slowly");
    }
    @Override
    public void eat(String food, String animal) {
        super.eat("leaves", "sloth");
    }
}
