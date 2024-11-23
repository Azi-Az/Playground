import java.util.Scanner;

public class Ex7 {
    public static void main (String[] args) {

        System.out.println("Program do obliczania podatku");

        System.out.println("----------");

        double pay;

        Scanner input = new Scanner(System.in);
        System.out.println("Proszę podać dochód: ");
        pay = input.nextDouble();
        input.close();

        System.out.println("----------");

        double multiplier1 = (pay * 0.18) - 556.02;
        double multiplier2 = 14839.02 + ((pay - 85528) * 0.32);


        if (pay < 85528) {
            System.out.println("Wysokość podatku to: " + multiplier1 + "zł");
        } else {
            System.out.println("Wysokość podatku to: " + multiplier2 + "zł");
        }

    }

}
