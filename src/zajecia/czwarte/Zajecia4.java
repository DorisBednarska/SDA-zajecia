package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class Zajecia4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        statistics(array);
    }

    //checkAge();
    //isEven();
    //celsiustofahrenheit();
    //showArray1();
    //showArray2();
//        oddArray();
//
    //scannerExample();
//}

    public static void checkAge() {
        int age = 5;
        if (age >= 18) {
            System.out.println("Ok, masz 18 lat");
        } else {
            System.out.println("Uwaga! Nie masz 18 lat");
        }
    }

    public static void showArray1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void showArray2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int num = array[i] * array[i];
                System.out.println(num);
            }
        }
    }

    public static void oddArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static double celsiustofahrenheit(int value) {
        return (value * (9.0 / 5.0)) + 32;
    }

    public static void statistics(int[] array) {
        System.out.println("Avg of elements is: " + avg(array));
        System.out.println("Sum of elements is: " + sumOf(array));
        System.out.println("Product of elements is: " + productOf(array));
        System.out.println("Number of even elements is: " + numberOfEven(array));
        System.out.println("Number of odd elements is: " + numberOfOdd(array));
//          1.srednia elementów
//          2.suma elementow
//          3.iloczyn elementow
//          4.ilosc parzystych elementow
//          5.ilosc niepatrzystych elementow
    }

    public static int numberOfOdd(int[] array){
        return array.length - numberOfEven(array);
    }

    public static int numberOfEven(int[] array) {
        int counter =0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])){
                counter++;
            }
        }
        return counter;
    }

    //metoda sprawdzająca czy dana liczba jest parzysta
    public static boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
    }   else{
        return false;
        }
    }

      public static double avg(int[] array){
          double avg = (double)sumOf(array)/array.length; //pierwsza zmienna definiujemy jako double, żeby nie obcięło miejsc po przecinku (rzutowanie)
          return avg;
      }
      public static int productOf(int[]array){
          int product =1;
          for(int i=0;i<array.length;i++){
              product += array[i];
          }
          return product;
      }

      public static int sumOf(int[] array){
          int sum=0;
          for (int i=0;i<array.length;i++) { //jeżeli robimy coś na wszystkich elementach tablicy}
          sum=sum+array[i]; //sum+=array[i];
          }
          return sum;
      }

    public static void isEven() {
        int number = 5;
        if (number %2==0){
            System.out.println("ta liczba jest parzysta");
        } else {
            System.out.println("ta liczba NIE JEST przysta");
        }
    }
    public static void scannerExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name:");
        String name = scanner.nextLine();
        System.out.println("Please insert your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Your name is " + name + " " + lastName);
    }

}
