package src.object;

public class BSimpleObject extends SimpleObject{
    public BSimpleObject(){
        this.name = "B";
    }
    @Override
    public void doAction1() {
        System.out.println("My Name is "+ name);
    }
    @Override
    public void doAction2() {
        System.out.println("hello "+ name);
    }
}
