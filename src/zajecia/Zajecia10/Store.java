package zajecia.Zajecia10;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Store {
    private Warehouse warehouse;

    public Store(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Order createOrder(Client client) {
        return new Order(client, new HashMap<>());
    }

    public void addToBasket(Order order, Comodity comodity, int amount) {
        if (warehouse.hasAmount(comodity, amount)) {
            order.addToOrder(comodity, amount);
        } else {
            System.out.println("Sorry");
        }
    }

    public void finish(Order order) {
        HashMap<Comodity, Integer> basket = order.getBasket();
        basket.forEach((productInBasket, amountOfProductInBasket) -> {
            warehouse.get(productInBasket, amountOfProductInBasket);
        });
    }
}
