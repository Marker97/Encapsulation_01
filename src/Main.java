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
        String residentNames = dataInput.nextLine();
        if(!residentNames.contains(",")){
            System.out.println("ERROR. Resident names must be separated by a comma.");
        }

        System.out.println("House floors number are: " + floorsNumber +
                "\n" + "House's address: " + address +
                "\n" + "Residents: " + residentNames);


    }
}