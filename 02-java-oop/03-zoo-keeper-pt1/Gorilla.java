public class Gorilla extends Animal{
    public Gorilla(int energyLevel){
        setEnergy(100);
    }
    public void throwSomething(){
        System.out.println("Gorilla has thrown rocks at you!")
        setEnergy(-5);
    }
    public void eatBananas(){
        System.out.println("Gorilla looks healthier!");
        setEnergy(+10);
    }
    public void climb(){
        System.out.println("Gorilla climbs a tree.Looks tired");
        setEnergy(-10);
    }
}
