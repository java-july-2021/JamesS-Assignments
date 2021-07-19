public class Animal {
    private String name;
    private int energy;
    int energyLevel = 100;

    public int displayEnergy(){
        System.out.println("Energy: " + this.energy);
        return energyLevel;
    }



    public Animal (String name, int energy){
        this.name = name;
        this.energy = energy;

    }

    public Animal() {

    }

    public void setName(String name){
        this.name = name;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public String getName(){
        return this.name;
    }
    public int getEnergy(){
        return this.energy;
    }
    //public void movement(String activity){
        //int energy;
        //if (activity.equals("Throw Something")){
            //energy -= 5;
        //}else if (activity.equals("Eat Banana")){
            //energy += 10;
        //}else if (activity.equals("climb")){
            //energy -= 10;
        //}else {
            //System.out.println("move not recongnized");
            //return;
        //}
    }
