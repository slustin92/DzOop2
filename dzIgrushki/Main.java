import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();


        controller.create("Мишка", 5, 0.1);
        controller.create("Зайка", 5, 0.2);
        controller.create("Котик", 5, 0.3);
        controller.create("Машина", 5, 0.4);
        controller.create("Трактор", 5, 0.7);
        controller.create("Собачка", 5, 0.05);

        controller.progra();
    }


}
