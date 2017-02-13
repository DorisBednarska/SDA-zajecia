package zajecia.Zajecia10;

import zajecia.Zajecia9.Address;
import zajecia.Zajecia9.User;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Poniedzialek2 {
    public static void main(String[] args) {
        Client client = new Client("Doris", "Bednarska");
        client.setPhoneNumber("123567897");
        Comodity potato = new Comodity("potato", "from Poland", 2.50);
        Comodity orange = new Comodity("orange", "from Spain", 2.70);
        Comodity banana = new Comodity("banana", "from Marocco", 10.50);
        HashMap<Comodity, Integer> products = new HashMap<>();
        products.put(potato, 500);
        products.put(orange, 23);
        products.put(banana, 58);
        Warehouse warehouse = new Warehouse(products);
        HashMap<Comodity, Integer> productsIntegerHashMap = warehouse.get(potato, 20);
        System.out.println();
//        Order order = new Order(client, products);
//        System.out.println("Total price for this order is " + order.getPrice());
    }

    public static void test() {
        //Map demo
//        HashMap<String, User> map = new HashMap<>();
//        map.put("1234567", new User("Doris", "Bednarska", "qwdsfghtgrfes"));
//        map.put("8765432", new User("Jan", "Kowalski", "tfrewsacxds", new Address()));
//        map.forEach((k, v) -> {
//            System.out.println(k);
//            System.out.println(v);
//            System.out.println();
//        });
    }

}
