package zajecia.Zajecia5;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Random;

/**
 * Created by RENT on 2017-02-06.
 */
public class poniedzialek {
    public static void main(String[] args) {
//        Random random = new Random();
//        int iloscKrokowDoZwyciestwa = game(random.nextInt(100));
//        System.out.println("Koniec gry");
//        System.out.println("Wygrales w " + iloscKrokowDoZwyciestwa + " krokach");
        int[] orderedArray = homework();
        printHomework(orderedArray);
    }

    public static void triangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*"); //bez ln wtedy nie przechodzi do nowej linii
            }
            System.out.println();
        }
    }

    public static void square(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void tree(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i) - 1; j++) {  //pętla wyświetlająca spacje
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {      //pętla wyświetlająca gwiazdki
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j == i) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void evenMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static int sumOfNumbersFromUser() {
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number: ");
            if (numberFromUser != 0) {
                sum += numberFromUser;
            } else {
                flag = false;
            }
        }
        return sum;
    }

    public static int[] arrayOfNumbersFromUser() {
        int[] tmparray = new int[100];
        int size = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if (numberFromUser != 0) {
                tmparray[size] = numberFromUser;
                size++;
            } else {
                flag = false;
            }
        }
        return revriteArray(tmparray, size);
    }

    public static int[] revriteArray(int[] bigArray, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = bigArray[i];
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int game(int number) {
        int[] tmparray = new int[100];
        int counter = 0;
        int size = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            counter++;
            if (numberFromUser == number) {
                System.out.println("Gratulacje!");
                flag = false;
            } else if (numberFromUser > number) {
                System.out.println("Twoja liczba jest za wysoka");
            } else {
                System.out.println("Twoja liczba jest za niska");
            }
        }
        return counter;
    }

    public static int[] homework() {
        int[] array = new int[10];
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if (numberFromUser >= 0 && numberFromUser <= 9) {
                array[numberFromUser]++;
            } else {
                flag = false;
            }
        }
        return array;
    }

    public static void printHomework(int[] orderedArray) {
        for (int i = 0; i < orderedArray.length; i++) {
            for (int j = 0; j < orderedArray[i]; j++) {
                System.out.println(i);
            }
        }
    }
}