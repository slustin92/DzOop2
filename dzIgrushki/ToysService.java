import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToysService {
    private List<Toys> userList = new ArrayList<>();
    private List<Toys> prizeToys = new ArrayList<>();
//    Toys toys = new Toys();


    public ToysService() {
        this.userList = new ArrayList<>();
    }

    public List<Toys> getAll() {
        return userList;
    }
Scanner sr = new Scanner(System.in);

    public void addToys(String toysName, int quantity, double weight) {


        int countMaxId = 0;
        for (Toys toys: userList){
            if (toys.getToysId() > countMaxId){
                countMaxId = toys.getToysId();
            }
        }
        countMaxId++;
        Toys toys = new Toys(countMaxId, toysName, quantity, weight);
        userList.add(toys);
    }
//

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

    public void delk(int s){
        for (Toys to : userList){
            if (to.getToysId() == s){
                int i = to.getQuantity() -1;
                to.setQuantity(i);
            }
        }

    }




}
