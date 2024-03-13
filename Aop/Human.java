package Aop;

public class Human extends Actor{

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        MakeOrder = isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        TakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return MakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return TakeOrder;
    }
}