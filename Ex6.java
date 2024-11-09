import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        double price = input("Proszę podać cenę: ");
        double rate = input("Proszę podać liczbę rat: ");

        double multiplier;


        if (price < 100 || price > 10000 || rate < 6 || rate > 48) {
            System.out.println("Podano błędne dane!");
        } else {
            if (rate <= 12) {
                multiplier = 0.025;
            } else if (rate <= 24) {
                multiplier = 0.05;
            } else {
                multiplier = 0.1;
            }

            double interest = price * multiplier;
            double total = price + interest;
            double rateValue = total / rate;

            System.out.println("Odsetki: " + interest + "zł");
            System.out.println("Łączny koszt: " + total + "zł");
            System.out.println("Wysokość raty: " + rateValue + "zł" );


    }
    }

    static double input(String message) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(message);
             return input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nie podano poprawnej liczby");
            return input(message);
        }

    }

    static void printSeparator() {
        System.out.println("---------------");
    }

    static boolean IsParameterInvalid(int price, int rate) {
        return (price < 100 || price > 10000 || rate < 6 || rate > 48);
    }

    private static void showError()
}

//        int price;
//        int installment;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Proszę podać cenę towaru: ");
//        price = input.nextInt();
//        System.out.println("Proszę podać liczbę rat: ");
//        installment = input.nextInt();
//
//        double multiplier;
//
//
//        if (price < 100 || price > 10000 || installment < 6 || installment > 48) {
//            System.out.println("Podano błędne dane!");
//        } else {
//            if (installment <= 12) {
//                multiplier = 0.025;
//            } else if (installment <= 24) {
//                multiplier = 0.05;
//            } else {
//                multiplier = 0.1;
//            }
//
////           double multiplier = installment <= 10 ? 0.025 : installment <= 24 ? 0.05 : 0.1;
//
//            double interest = price * multiplier;
//            double total = price + interest;
//            double installmentValue = total / installment;
//
//            System.out.println("Odsetki: " + interest + "zł");
//            System.out.println("Łączny koszt: " + total + "zł");
//            System.out.println("Wysokość raty: " + installmentValue + "zł" );
//
//
//        }

