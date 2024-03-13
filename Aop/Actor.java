package Aop;

abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean MakeOrder;
    protected boolean TakeOrder;
    public Actor(String name){
        this.name = name;
        MakeOrder = false;
        TakeOrder = false;
    }
    public String getName(){
        return name;
    }

}