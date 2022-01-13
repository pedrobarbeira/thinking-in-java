package AC;

public class PizzaStore {
    private Pizza order;

    public enum Type{
        CHEESE, MARGARINA, HOT
    }

    public PizzaStore(){
        System.out.println("Welcome to the pizza store");
        order = null;
    }

    public void setPizza(Type type){
        switch(type){
            case CHEESE : order = new Pizza("Thin", "Mozzarella", "Tomato", "Parmesan, Olives");
            case MARGARINA : order = new Pizza("Thicc", "Mozzarella", "Tomato", "Ham");
            case HOT : order = new Pizza("Thin", "Mozzarella", "Spicy", "Pepperoni");
        }
    }

    public void getPizza(){
        order.getPizza();
    }
}
