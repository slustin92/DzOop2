package Aop;

import java.util.ArrayList;
import java.util.List;

//Класс Market, который реализовывает два
//вышеуказанных интерфейса и хранит в списке
//список людей в очереди в различных статусах
public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " Пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            System.out.println(actor.getName() + " Вышел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " Встал в очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал заказ");
            }
        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actors : queue){
            if (actors.isTakeOrder()){
                releasedActors.add(actors);
                System.out.println(actors.getName() + " Вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
