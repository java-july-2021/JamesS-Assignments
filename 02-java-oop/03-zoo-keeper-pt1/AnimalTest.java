
public class AnimalTest extends Animal {
    public static void main (String[] args) {
        Gorilla gorilla = new Gorilla(100);
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();


        //gorilla.climb();
        //System.out.println(gorilla.getEnergy());
        Bat notSuperman = new Bat(300);
        notSuperman.attackTown();
        notSuperman.attackTown();
        notSuperman.attackTown();
        notSuperman.eatHuman();
        notSuperman.eatHuman();
        notSuperman.fly();
        notSuperman.fly();
        notSuperman.displayEnergy();


    }
}