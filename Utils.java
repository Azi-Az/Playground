import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

    static double inputDouble(String messageN) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(messageN);
            return input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nie wpisano liczby rzeczywistej");
            return inputDouble(messageN);
        }
    }
}
