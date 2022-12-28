package src.client;

import src.object.SimpleObject;

public abstract class SimpleObjectClient {


    public void work(String type){

        SimpleObject obj = createObj(type);
        obj.doAction2();
        obj.doAction1();
    }
    public abstract SimpleObject createObj(String type);

}
