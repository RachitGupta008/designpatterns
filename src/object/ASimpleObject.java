package src.object;

public class ASimpleObject extends SimpleObject{
    public ASimpleObject(){
        this.name = "A";
    }
    @Override
    public void doAction1() {
        System.out.println("My Name is "+ name);
    }
    @Override
    public void doAction2() {
        System.out.println("Hello"+ name);
    }
}
