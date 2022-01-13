package ReusingClassesPckg;

class Art {
    Art() { System.out.println("Art constructor"); }
}
class Drawing extends Art {
    Drawing() { System.out.println("Drawing constructor"); }
}
public class Cartoon extends Drawing {
}