package zajecia.Zajecia7;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Random;

/**
 * Created by RENT on 2017-02-08.
 */
public class Sroda {
    public static void main(String[] args) {
//        String randomString = randomLowerCase(10);
//        System.out.println(randomString);
//        int[] statistics = stringStatistics(randomString);
//        printStringStatistic(statistics);
//        String rvs = isPalindrome("Ala ma kota");
//        System.out.println(rvs);
//        System.out.println(isPalindrome("kajak"));
//        int sum = sumFromString("Ala ma 2 koty i 3 psy");
//        System.out.println("Ala ma " + sum + " zwierzat");
        boolean check = checkRoundBraces("(2+3)");
        System.out.println(check);
    }

    public static int[] stringStatistics(String message) {
        int[] statisticsArray = new int[26];
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                int index = charArray[i] - 97;
                statisticsArray[index]++;
            }
        }
        return statisticsArray;
    }

    public static void printStringStatistic(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }

    public static String randomLowerCase(int size) {
        Random random = new Random();
        char[] chars = new char[size];
        for (int i = 0; i < chars.length; i++) {
            int generatedValue = random.nextInt(26) + 97;
            chars[i] = (char) generatedValue;
        }
        return String.valueOf(chars);
    }

    public static String randomLowerCase1(int size) {
        Random random = new Random();
        String tmpMessage = "";
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26) + 97;
            String generatedValueAsString = String.valueOf((char) (generatedValue));
            tmpMessage += generatedValueAsString;
        }
        return tmpMessage;
    }

    public static String randomLowerCase2(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26) + 97;
            stringBuilder.append((char) generatedValue);
//            stringBuilder.insert(0,(char)generatedValue); //nowy znak dopisujemy na początku, a nie na końcu
        }
        return stringBuilder.toString();
    }

    public static String convertSpaces(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 95) {
                charArray[i] = ' ';
                //charArray[i] = (char) 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static String reverseString(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
//            char a = charArray[i];
//            char b = charArray[charArray.length - i -1];
//            char tmp = a;
//            a=b;
//            b=tmp;
//            charArray[i] = a;
//            charArray[charArray.length - i - 1]=b;
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tmp;
        }
        return String.valueOf(charArray);
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int sumFromString(String message) {
        char[] charArray = message.toCharArray();
        int wynik = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                wynik += (int) (charArray[i] - 48);
            }
        }
        return wynik;
    }

    public static boolean checkRoundBraces(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                counter++;
            } else if (charArray[i] == ')') {
                counter--;
                if (counter < 0) {
                    return false;
                }
            }
        }
        return counter == 0;
    }
}
