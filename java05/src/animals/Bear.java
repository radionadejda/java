package animals;

public class Bear extends AbstractAnimal {
    @Override
    public void speak(){
        System.out.println("i'm a bear i growl grrrgrrrgrrr");
    }

    @Override
    public void eat(String food, String animal) {
        super.eat("zookeeper", "bear");
    }
}
