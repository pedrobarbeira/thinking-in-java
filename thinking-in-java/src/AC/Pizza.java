package AC;

public class Pizza {
    private String dough;
    public String cheese;
    protected String sauce;
    String toppings;

    public Pizza(String d, String c, String s, String t){
        dough = d;
        cheese = c;
        sauce = s;
        toppings = t;
    }

    private void prepare(){
        System.out.println("Doudh: " + dough);
        System.out.println("Cheese: " + cheese);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + toppings);
    }

    protected void bake(){
        prepare();
        System.out.println("Baking pizza");
    }

    public void getPizza(){
        bake();
    }

}
