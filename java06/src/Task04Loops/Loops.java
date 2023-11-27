package Task04Loops;

public class Loops {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("this is a while loop");
        while (i <= 512) {
            System.out.println(i);
            i= i*2;
        }

        int k = 1;
        System.out.println("this is a do while loop");
         do {
            System.out.println(k);
            k= k*2;
        } while (k <= 512);
    }
}
