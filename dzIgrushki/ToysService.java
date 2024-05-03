import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToysService {
    private List<Toys> userList = new ArrayList<>();
    private List<Toys> prizeToys = new ArrayList<>();
    private Scanner sr = new Scanner(System.in);


    public ToysService() {
        this.userList = new ArrayList<>();
    }

    public List<Toys> getAll() {
        return userList;
    }
    public void ToysQuantity() {
        if (!userList.isEmpty()) {
            for (Toys toys : userList) {
                if (toys.getQuantity() < 1) {
                    userList.remove(toys);
                }
            }
        }
    }

public void addToys(){


    System.out.print("Введите Id игрушки: ");
    int id = sr.nextInt();
    System.out.print("Введите имя игрушки: ");
    String name = sr.next();
    System.out.print("Введите кол-во игрушек: ");
    int quantity = sr.nextInt();
    System.out.print("Введите вес игрушки: ");
    double weight = sr.nextDouble();


    userList.add(new Toys(id, name, quantity, weight));
    System.out.println('\n' + "Игрушка " + name + " добавлен.");


}

    public void receivingToys(int rand){
        for (Toys toys: userList){
            if (toys.getToysId() == rand) {
                System.out.println("Выпола игрушка - " + toys);
                prizeToys.add(toys);
            }

        }
    }
    public Toys receivingPrizeToys(){

        return prizeToys.getFirst();
    }

    public void delk(int s) {

        for (Toys to : userList) {
            if (to.getToysId() == s) {
                int i = to.getQuantity() - 1;
                to.setQuantity(i);
            }
        }
    }

        public void weightToys () throws IOException {
            System.out.print("Введите вес для выполения игрушек: ");
            double weig = sr.nextDouble();

            for (Toys toys : userList) {
                if (toys.getWeight() == weig) {
                    System.out.println(toys);
                    prizeToys.add(toys);
                    delk(toys.getToysId());
                    Writer myWriter = new FileWriter("myfile.txt", true);
                    myWriter.write("Получена призовая игрушка: " + String.valueOf(toys) + '\n' + '\n');
                    myWriter.close();
                }
            }

        }


    }
