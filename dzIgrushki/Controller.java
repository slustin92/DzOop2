import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Controller {

    private final ToysService dataService = new ToysService();



    public void create(String toysName, int quantity, double weight) {
        dataService.addToys(toysName, quantity, weight);

    }

    public void print(){
     for (Toys toys : dataService.getAll()) {
         System.out.println(toys);
                }
    }
    public void raffle() throws IOException {
        Random rn = new Random();
        int randomNum = rn.nextInt(1, dataService.getAll().size());
        dataService.receivingToys(randomNum);

        Writer myWriter = new FileWriter("myfile.txt", true);
        myWriter.write("Получена призовая игрушка: " + String.valueOf(dataService.receivingPrizeToys()) + '\n'+ '\n');
        myWriter.close();
        dataService.delk(randomNum);


    }

    public void progra() throws IOException {
        String meny = ("Выберите действие: " + '\n' +
//                "1 - Добавить игрушку." + '\n' +
                "1 - Вывести список игрушок." + '\n' +
                "2 - Розыгрышь игрушок. " + '\n' +
                "3 - Выход.");

        Scanner scanner = new Scanner(System.in);
        System.out.println(meny);
        boolean swi = true;
        while (swi){

            int i = scanner.nextInt();
//            scanner.close();

            switch (i) {


                case 1:
                    print();
                    break;
                case 2:
                    raffle();
                    break;
                case 3:
                    System.out.println("До свидания: ");
                    swi = false;
                    break;



            }
            System.out.println('\n' + meny);
//            scanner.close();
        }


    }






}
