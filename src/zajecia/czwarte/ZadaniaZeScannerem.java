package zajecia.czwarte;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {
    public static void main(String[] args) {
//        System.out.println("Grade system 2000 z.o.o");
//        double avg = avgOfGrades();
//        System.out.println("Avg of your grades is: " + avg);
        calculator();
    }

    public static void calculator(){
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        int decision = getNumberFromUser("Podaj rodzaj operacji");
        if(decision <0 || decision > 4){
            System.out.println("Wrong data");
        }
        int firstNumber = getNumberFromUser("Wpisz pierwsza liczbe: ");
        int secondNumber = getNumberFromUser("Wpisz druga liczbe: ");
        if (decision == 1){
            System.out.println(firstNumber+secondNumber);;
        } else if (decision == 2){
            System.out.println(firstNumber-secondNumber);
        }
        else if (decision == 3){
            System.out.println(firstNumber*secondNumber);
        }
        else if (decision == 4){
            System.out.println(firstNumber/secondNumber);
        }
    }

    public static double avgOfGrades() {
        int size = getNumberFromUser("Insert number of grades: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumberFromUser("Insert " + (i + 1) + " grade: ");
        }
        return Zajecia4.avg(array);
    }

    public static void compareThreeNumbers() {
        int a = getNumberFromUser("Insert first number");
        int b = getNumberFromUser("Insert second number");
        int c = getNumberFromUser("Insert third number");
        //pobieramy od usera 3 liczby
        System.out.println("Max: " + max(a, b, c));
        System.out.println("Min: " + min(a, b, c));
        //wyswietlamy największą i najmniejszą
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

//    public static int min (int a, int b, int c) {
//        if (a <=b && a<= c) {
//            return a;
//        } else if ( b <= a && b<=c){
//            return b;
//        } else {
//            return c;
//        }
//    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(array);
    }

    public static void listEvenNumbersFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printEvenLessThan(number);
        //pobieramy liczbę
        //wyświetlamy tylko parzyste mniejsze od...
    }

//    public static int max (int a,int b, int c) {
//        if (a >= b && a>=c) {
//            return a;
//        } else if ( b>= a && b>=c){
//            return b;
//        } else {
//            return c;
//        }
//    }

    public static void listNumbersFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printLessThan(number);
    }

    public static int getNumberFromUser() {
        return getNumberFromUser("Please insert the number: ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please insert the number: ");
//        return scanner.nextInt();
    }

    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }


    public static void checNumberFromUser() {
        int numberFromUser = getNumberFromUser();
        if (Zajecia4.isEven(numberFromUser)) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
        //definiujemy scanner
        //czytamy od usera liczbe
        //sprawdzamy czy liczba jest parzysta
        //jeżeli tak to wiadomość
        //jeżeli nie to wiadomość

    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name:");
        String name = scanner.nextLine();
        System.out.println("Please insert your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Your name is " + name + " " + lastName);
    }
}
