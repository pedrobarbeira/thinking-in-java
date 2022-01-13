package ReusingClassesPckg;

class Drink{
    private String drink;

    public Drink(String what){
        System.out.println("Creating a " + what);
        drink = what;
    }

    public String toString(){
        return drink;
    }
}

public class Bottle {
    String name;
    Drink drink;

    public Bottle(String n){
        System.out.println("Creating an empty bottle of " + n);
        name = n;
        drink = null;
    }

    public void DrinkFactory(String s){
        if(s == null) drink = new Drink("no Drink");
        else drink = new Drink(s);
        System.out.println("Filling bottle with " + s);
    }

    public String toString(){
        return "name: " + name + "\n" +
                "drink: " + drink + "\n";
    }

}
