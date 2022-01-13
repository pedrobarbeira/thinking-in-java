import AC.*;

public class AccessControl {
    static void ex1(){
        TestClass t = new TestClass(1, 1);
        t.print();
    }

    static void ex4(){
        Point p = new Point(1, 2);
        TestClass t = new TestClass(p);

        t.print();
    }

    static void ex5(){
        PizzaStore pc = new PizzaStore();
        pc.setPizza(PizzaStore.Type.CHEESE);
        pc.getPizza();
    }

    static void ex6(){
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);

        p1.addPoint(p2);

        p1.print();
    }

    static void ex8(){
        ConnectionManager cm = new ConnectionManager();

        cm.setConnection(0, "Michelle");
        cm.setConnection(1, "Anna");
        cm.setConnection(2, "Laura");
        cm.setConnection(3, "Janice");
        cm.setConnection(4, "Rachel");

        cm.printConnection(cm.getConnection(1));
    }

    public static void main(String[] args) {
        ex8();
    }
}
