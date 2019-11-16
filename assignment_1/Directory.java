import java.util.Scanner;

public class Directory {

    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        String FirstName = "";
        String SecondName = "";
        String StreetAddress = "";
        String city = "";
        String ZipCode = "";

        FirstName = scnr.nextLine();
        SecondName= scnr.nextLine();
        StreetAddress = scnr.nextLine();
        city = scnr.nextLine();
        ZipCode = scnr.nextLine();

        System.out.print(FirstName + "\n" + SecondName + "\n" + StreetAddress + "\n" + city + "\n" + ZipCode);
        
        return;


    }

}
