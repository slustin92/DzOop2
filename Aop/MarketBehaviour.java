package Aop;

import java.util.ArrayList;
import java.util.List;

//Интерфейс MarketBehaviour, который описывает
//логику магазина – приход/уход покупателей,
//обновление состояния магазина
interface MarketBehaviour {

    void acceptToMarket(Actor actor);// прищел в магазин
    void releaseFromMarket(List<Actor> actors); // ушел
    void update();
    
}
