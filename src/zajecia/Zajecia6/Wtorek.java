package zajecia.Zajecia6;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-07.
 */

public class Wtorek {
    public static void main(String[] args) {
//        int numberOfElements = avgUntil(4);
//        System.out.println("Podano " + numberOfElements + " liczb.");
        //calculator();
        System.out.println("Zakodowane: ");
        String codded = cezarCode("Bednarska");
        System.out.println(codded);
        System.out.println("Odkodowanie: ");
        System.out.println(decodecezarCode(codded));
    }
    public static String cezarCode(String message){
        return cezarCode(message, 1);
    }

    public static String cezarCode(String message, int key) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + key);
        }
        return String.valueOf(charArray);
    }

    public static String decodecezarCode(String codedMessage){
        return cezarCode(codedMessage, -1);
    }

    public static String decodecezarCode(String codedMessage, int key) {
        return cezarCode(codedMessage, -key);
    }
    public static int sumUntil(int sum) {
        int tmpSum = 0;
        int counter = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            tmpSum += numberFromUser;
            counter++;
            System.out.println("tmpSum: " + tmpSum);
            if (tmpSum > sum) {
                flag = false;
            }
        }
        return counter;
    }

    public static int avgUntil(int avg) {
        boolean flag = true;
        int sum = 0;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            counter++;
            if ((double) sum / counter > avg) {
                flag = false;
            }
        }
        return counter;
    }

    public static void calculator() {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("0. Koniec");
            int nrDzialania = ZadaniaZeScannerem.getNumberFromUser("Podaj nr dzialania");
            int firstNumber = 0;
            int secondNumber = 0;
            if (nrDzialania > 0 && nrDzialania < 5) {
                firstNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj pierwsza liczbe: ");
                secondNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj druga liczbe: ");
            }
            switch (nrDzialania) {
                case 1:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Nie dziel przez 0!");
                    } else {
                        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Podano niepoprawna operacje");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }

    }
}
