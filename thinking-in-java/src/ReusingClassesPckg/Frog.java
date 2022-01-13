package ReusingClassesPckg;

class Amphibian{
    public void swim(){
        System.out.println("Swimin'");
    }
    public void walk(){
        System.out.println("Walkin'");
    }
    public void talk(){
        System.out.println("Talkin'");
    }
    public void doThings(Amphibian a){
        a.swim();
        a.walk();
        a.talk();
    }
}

public class Frog extends Amphibian{
    public void swim(){
        System.out.println("Swimmin'");
    }
    public void walk(){
        System.out.println("Jumpin'");
    }
    public void talk(){
        System.out.println("Croackin'");
    }
    public void doThings(){
        super.doThings(this);
    }

}
