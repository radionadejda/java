import animals.Parrot;
import animals.Bear;
import animals.Sloth;

public class Zoo {
        public static void main(String[] args) {
            Zookeeper zookeeper = new Zookeeper();

            Bear misha = new Bear();
            Parrot polly = new Parrot();
            Sloth missy = new Sloth();

            zookeeper.makeTalk(misha);
            zookeeper.makeTalk(polly);
            zookeeper.makeTalk(missy);

            zookeeper.makeMove(misha);
            zookeeper.makeMove(polly);
            zookeeper.makeMove(missy);

            zookeeper.feed(misha);
            zookeeper.feed(polly);
            zookeeper.feed(missy);

        }
}