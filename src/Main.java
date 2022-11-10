
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dataInput = new Scanner(System.in);

        System.out.println("Insert floors number: ");
        int floorsNumber = dataInput.nextInt();

        dataInput.nextLine();

        System.out.println("Insert the address: ");
        String address = dataInput.nextLine();


        System.out.println("Insert list of names separated by a comma: ");
        String residents= dataInput.nextLine();
        String [] residentArray = residents.split(",");


        if(!residents.contains(",")){
            System.out.println("ERROR. Resident names must be separated by a comma.");
        }

        House myHouse = new House(floorsNumber,address, residentArray);

        System.out.println("House floors number are: " + myHouse.getFloorsNumber()+
                "\n" + "House's address: " + myHouse.getAddress() +
                "\n" + "House's residents: " + String.join("," , myHouse.getResidentNames()));


    }
}