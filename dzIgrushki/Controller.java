import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Controller {

    private final ToysService dataService = new ToysService();



//    public void create(String toysName, int quantity, double weight) {
//        dataService.addToys(toysName, quantity, weight);
//
//    }

    public void print(){
        if (dataService.getAll().isEmpty()){
            System.out.println("Игрушки закончились.");
        }else {
            for (Toys toys : dataService.getAll()) {
                System.out.println(toys);
            }
        }
    }
    public void raffle() throws IOException {
        Random rn = new Random();
        if (dataService.getAll().isEmpty()) {
            System.out.println("Игрушки закончились:");
        }else {
            int randomNum = rn.nextInt(1, (dataService.getAll().size()+1));
            dataService.receivingToys(randomNum);

            Writer myWriter = new FileWriter("myfile.txt", true);
            myWriter.write("Получена призовая игрушка: " + String.valueOf(dataService.receivingPrizeToys()) + '\n' + '\n');
            myWriter.close();
            dataService.delk(randomNum);

        }

    }

    public void progra() throws IOException {
        String meny = ('\n' + "        Меню: " + '\n' +
                "1 - Добавить игрушку." + '\n' +
                "2 - Вывести список игрушок." + '\n' +
                "3 - Розыгрышь игрушок. " + '\n' +
                "4 - Задать вес для выпадения игрушки. " + '\n' +
                "5 - Выход." + '\n');

        Scanner scanner = new Scanner(System.in);

        boolean swi = true;
        while (swi){
            System.out.println(meny);
            System.out.print("Выберите действие: ");
            int i = scanner.nextInt();
            dataService.ToysQuantity();
//            scanner.close();

            switch (i) {


                case 1:
                    dataService.addToys();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    raffle();

                    break;
                case 4:

                    dataService.weightToys();
                    break;
                case 5:
                    System.out.println("До свидания: ");
                    swi = false;
                    break;




            }
//            System.out.println('\n' + meny);
//            scanner.close();
        }


    }






}
