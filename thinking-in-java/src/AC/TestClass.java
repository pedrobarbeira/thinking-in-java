package AC;

public class TestClass {
    Point p;

    public TestClass(int x, int y){
        p = new Point(x, y);
    }

    public TestClass(Point p){
        this.p = p;
    }

    public void print(){
        p.print();
    }
}
