import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        System.out.println("Prosty kalkulator");

        System.out.println("----------");

        double firstNumber;
        double secondNumber;
        String sign;

        Scanner input = new Scanner(System.in);
        System.out.println("Proszę podać pierwszą liczbę: ");
        firstNumber = input.nextDouble();
        System.out.println("Proszę podać znak operacji (+,-,*,/): ");
        sign = input.next();
        System.out.println("Proszę podać drugą liczbę: ");
        secondNumber = input.nextDouble();
        input.close();

        System.out.println("----------");

        switch (sign) {
            case "+":
                System.out.println("Wynik: " + (firstNumber + secondNumber));
//                podstawianie wartości do wzoru:
//                System.out.printf("%d + %d = %d%n", firstNumber, secondNumber, (firstNumber + secondNumber));
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
}








