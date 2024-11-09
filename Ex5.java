import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        System.out.println("Prosty kalkulator");
        System.out.println("----------");


        double firstNumber = inputInteger("Proszę podać pierwszą liczbę");
        String sign = inputString("Proszę podać znak operacyjny (+,-,*,/): ");
        double secondNumber = inputInteger("Proszę podać drugą liczbę: ");

        System.out.println("----------");
        switch (sign) {
            case "+":
                System.out.println("Wynik: " + (firstNumber + secondNumber));;
                break;
            case "-":
                System.out.println("Wynik: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Wynik: " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("Wynik: " + (firstNumber / secondNumber));
                if (secondNumber == 0) {
                    System.out.println("Nie można dzielić przez 0");
                }
                break;
            default:
                System.out.println("Podano błędną operację");


        }
    }

    static double inputInteger(String messageN) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(messageN);
            return input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nie wpisano liczby rzeczywistej");
            return inputInteger(messageN);
        }
    }

    static String inputString(String messageS) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(messageS);
            return input.next();
        } catch (InputMismatchException e) {
            System.out.println("Nie wpisano poprawnego znaku operacyjnego");
            return inputString(messageS);
        }

        }
}

//        int firstNumber = input("Proszę podać pierwszą liczbę: ");
//        int secondNumber = input("Proszę podać drugą liczbę: ");
//        int thirdNumber = input("Proszę podać trzecią liczbę: ");
//
//        int maxNumber;
//
//        int minNumber;
//
//
//        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
//            maxNumber = firstNumber;
//
//        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
//            maxNumber = secondNumber;
//
//        } else {
//            maxNumber = thirdNumber;
//        }
//
//        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
//            minNumber = firstNumber;
//        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
//            minNumber = secondNumber;
//        } else {
//            minNumber = thirdNumber;
//        }
//
//        System.out.println("Największą liczbą jest: " + maxNumber);
//        System.out.println("Najmniejszą liczbą jest: " + minNumber);
//
//
//
//
//    }
//
//    static int input(String message) {
//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println(message);
//            int number = input.nextInt();
//            return number;
//        } catch (InputMismatchException e) {
//            System.out.println("Nie podano liczby całkowitej");
//            return input(message);
//        }
//
//}

//System.out.println("Hello from main");
//int firstNumber = input("Podaj liczbę rat:");
//        System.out.println(firstNumber);
//int secondNumber = input("Podaj kwotę zakupu: ");
//        System.out.println(secondNumber);

//        System.out.println("Program do znajdowania największej i najmniejszej z 3 liczb");
//
//
//        int firstNumber;
//        int secondNumber;
//        int thirdNumber;
//
//        boolean done = false;
//
//        while (!done) {
//
//            try {
//
//                Scanner input = new Scanner(System.in);
//                System.out.println("Podaj pierwszą liczbę: ");
//                firstNumber = input.nextInt();
//                System.out.println("Podaj drugą liczbę: ");
//                secondNumber = input.nextInt();
//                System.out.println("Podaj trzecią liczbę: ");
//                thirdNumber = input.nextInt();
//
//                int maxNumber;
//                int minNumber;
//
//                if (firstNumber > secondNumber && firstNumber > thirdNumber) {
//                    maxNumber = firstNumber;
//                } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
//                    maxNumber = secondNumber;
//                } else {
//                    maxNumber = thirdNumber;
//                }
//
//                if (firstNumber < secondNumber && firstNumber < thirdNumber) {
//                    minNumber = firstNumber;
//                } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
//                    minNumber = secondNumber;
//                } else {
//                    minNumber = thirdNumber;
//                }
//
//                System.out.println("Największą liczbą jest: " + maxNumber);
//                System.out.println("Najmniejszą liczbą jest: " + minNumber);
//
//                done = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Proszę podać liczbę całkowitą");
//
//            }



//    static int input(String message) {
//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println(message);
//            int number = input.nextInt();
////            input.close();
//            return number;
//        } catch (InputMismatchException e) {
//            System.out.println("Podano złą wartość");
//            return input("Podaj liczbę: ");
//        }
//

