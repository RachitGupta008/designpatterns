package src.client;

import src.object.SimpleObject;
import src.simplefactory.SimpleObjectFactory1;

// In this way we can establish a way to have a way that client are forced to use the work method as
// it is so they adhere to the standard of work
// but can use different factories in order to create different type of objects

public class ClientA extends SimpleObjectClient {
    SimpleObjectFactory1 factory1;
    public ClientA(SimpleObjectFactory1 factory1){
        this.factory1 = factory1;
    }

    @Override
    public SimpleObject createObj(String type) {
        return factory1.getObject(type);
    }
}
