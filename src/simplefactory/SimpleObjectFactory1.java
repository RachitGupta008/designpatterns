package src.simplefactory;

import src.object.ASimpleObject;
import src.object.BSimpleObject;
import src.object.SimpleObject;

public class SimpleObjectFactory1 {

    public static SimpleObject getObject(String type){
        if(type.equals("a")){
            return new ASimpleObject();
        }else{
            return new BSimpleObject();
        }

    }
}
