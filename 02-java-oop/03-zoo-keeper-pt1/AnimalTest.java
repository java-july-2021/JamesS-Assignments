
public class AnimalTest extends Animal {
    public static void main (String[] args) {
        Gorilla gorilla = new Gorilla(100);


        gorilla.climb();
        System.out.println(gorilla.getEnergy());
    }
}