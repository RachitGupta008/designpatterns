import src.client.ClientA;
import src.simplefactory.SimpleObjectFactory1;

public class main {

    public static void main(String[] args){
        ClientA clientA = new ClientA(new SimpleObjectFactory1());
        clientA.work("a");
    }
}
