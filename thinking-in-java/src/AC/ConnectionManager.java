package AC;

class Connection{
    private static String name = "Mike";
    private String dude;
    private int count = 0;

    private Connection(){
        count++;
        dude = "";
    }

    public static Connection makeConnection(){
        return new Connection();
    }

    public void setConnection(String n){
        dude = n;
    }

    public void print(){
        System.out.println("No: " + count + " Person: " + dude);
    }
}

public class ConnectionManager {
    Connection[] list = { Connection.makeConnection(), Connection.makeConnection(), Connection.makeConnection(), Connection.makeConnection(), Connection.makeConnection()};
    static int max = 5;

    public ConnectionManager(){
    }

    public void setConnection(int index, String name){
        if(index >= max){
            System.out.println("Out of bound access");
        }
        else{
            list[index].setConnection(name);
        }
    }

    public Connection getConnection(int index){
        if(index >= max) return null;
        else return list[index];
    }

    public void printConnection(Connection c){
        c.print();
    }


}
