import animals.AbstractAnimal;

public class Zookeeper {
    void makeTalk(AbstractAnimal animal){
        System.out.println("i'm a zookeeper and i will ask an animal to speak");
        animal.speak();
    }

    void makeMove(AbstractAnimal animal){
        System.out.println("i'm a zookeeper and i will ask an animal to move");
        animal.move();
    }
    void feed(AbstractAnimal animal){
        System.out.println("i'm a zookeeper and i will feed an animal");
        animal.eat("food", "animal");
    }
}
