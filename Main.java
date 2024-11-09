import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program do znajdowania największej i najmniejszej z 3 liczb");


        int firstNumber;
        int secondNumber;
        int thirdNumber;

        boolean done = false;

        while (!done) {

            try {

                Scanner input = new Scanner(System.in);
                System.out.println("Podaj pierwszą liczbę: ");
                firstNumber = input.nextInt();
                System.out.println("Podaj drugą liczbę: ");
                secondNumber = input.nextInt();
                System.out.println("Podaj trzecią liczbę: ");
                thirdNumber = input.nextInt();

                int maxNumber;
                int minNumber;

                if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                    maxNumber = firstNumber;
                } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                    maxNumber = secondNumber;
                } else {
                    maxNumber = thirdNumber;
                }

                if (firstNumber < secondNumber && firstNumber < thirdNumber) {
                    minNumber= firstNumber;
                } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
                    minNumber = secondNumber;
                } else {
                    minNumber = thirdNumber;
                }

                System.out.println("Największą liczbą jest: " + maxNumber);
                System.out.println("Najmniejszą liczbą jest: " + minNumber);

                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Proszę podać liczbę całkowitą");

            }
        }




     // int a = 5;
     // int b = 10;

     // String text = a > b ? "prawda" : "fałsz";
     
     // System.out.println(text);



    }


}

//double temp;
//
//boolean done = false;
//
//        while (!done) {
//
//        try {
//Scanner input = new Scanner(System.in);
//                System.out.print("Podaj temperaturę w stopniach C: ");
//temp = input.nextDouble();
//                input.close();
//
//double secondTemp = 1.8 * temp + 32.0;
//
//                System.out.println("Temperatura w stopniach F to: " + secondTemp);
//
//done = true;
//
//        } catch (InputMismatchException e) {
//        System.out.println("Proszę podać poprawną liczbę.");
//            }
//                    }






//        boolean done = false;
//
//        while (!done) {
//            try {
//                int number;
//                Scanner input = new Scanner(System.in);
//                System.out.println("Podaj liczbę: ");
//                number = input.nextInt();
//                input.close();
//                for (int i = 0; i < number; i++) {
//                    for (int j = 1; j <= number; j++) {
//                        if (j < number) {
//                            System.out.print(j + ", ");
//                        } else {
//                            System.out.print(j + " ");
//                        }
//                    }
//                    System.out.println();
//                }
//                done = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Proszę podać liczbę całkowitą");
//            }
//        }




//        int number = 10;
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 1; j <= 10; j++)
//            System.out.print(i + ", ");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj liczbę: ");
//        number = input.nextInt();
//        input.close();
//
//        int number;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj liczbę: ");
//
//        try {
//            number = input.nextInt();
//            System.out.println("Podana liczba to: " + number);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Proszę podać liczbę całkowitą");
//        }
//        input.close();

//        for (int i = 0; i < number; i++) {
//            for (int j = 1; j <= number; j++) {
//                if (j < number) {
//                    System.out.print(j + ", ");
//                } else {
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println();
