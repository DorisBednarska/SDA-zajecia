package zajecia.Zajecia10;

import java.util.*;

/**
 * Created by RENT on 2017-02-13.
 */
public class Order {
    private HashMap<Comodity, Integer> basket;
    private Client client;
    private Date date;
    private double price;

    public Order(Client client, HashMap<Comodity, Integer> basket) {
        this.client = client;
        this.basket = basket;
        this.date = new Date();
        this.price = countPrice();
    }

    public double finish() {
        return countPrice();
    }

    public Order addToOrder(Comodity comodity, int amount) {
        if (basket.containsKey(comodity)) {
            Integer amountInBasket = basket.get(comodity);
            basket.put(comodity, amountInBasket + amount);
        } else {
            basket.put(comodity, amount);
        }
        return this;
    }

    private double countPrice() {
        Set<Map.Entry<Comodity, Integer>> entries = basket.entrySet();
        Iterator<Map.Entry<Comodity, Integer>> iterator = entries.iterator();
        double totalPrice = 0;
        while (iterator.hasNext()) {
            Map.Entry<Comodity, Integer> next = iterator.next();
            Comodity product = next.getKey();
            Integer amount = next.getValue();
            double price = product.getPrice();
            totalPrice += amount * price;
        }
        return totalPrice;
    }

    public HashMap<Comodity, Integer> getBasket() {
        return basket;
    }

    public Client getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
}
