package Aop;
//Интерфейс QueueBehaviour, который описывает
//логику очереди – помещение в/освобождение из
//очереди, принятие/отдача заказа
//void: takeInQueue(Actor actor);
//void: takeOrders();
//void: giveOrders();
//void: releaseFromQueue()
interface QueueBehaviour  {
    void takeInQueue(Actor actor); // встал в очередь
//    System.out.print("встал в очередь");
    void takeOrders(); // сделал заказ
    void giveOrders(); // получил заказ
    void releaseFromQueue(); // ущел из очереди
    
}
