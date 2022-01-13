package AC;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.println("x = " + x + " y = " + y);
    }

    public void addPoint(Point p){
        System.out.println("Addind point");
        AddPoint a = new AddPoint(this);
        a.addX(p.x);
        a.addY(p.y);
    }
}

class AddPoint{
    Point p;
    public AddPoint(Point p){
        this.p = p;
    }

    public void addX(int i){
        p.x += i;
    }

    public void addY(int i){
        p.y += i;
    }
}
