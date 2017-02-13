package zajecia.Zajecia10;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Warehouse {
    private HashMap<Comodity, Integer> warehouse;

    public Warehouse(HashMap<Comodity, Integer> warehouse) {
        this.warehouse = warehouse;
    }

    public boolean hasAmount(Comodity comodity, int amount) {
        boolean returnValue = false;
        if (warehouse.containsKey(comodity)) {
            Integer amountInWarehouse = warehouse.get(comodity);
            returnValue = amountInWarehouse >= amount;
        }
        return returnValue;
    }

    //dodawanie towaru
    public void add(Comodity comodity, int amount) {
        if (warehouse.containsKey(comodity)) {
            Integer amountInWarehouse = warehouse.get(comodity);
            warehouse.put(comodity, amountInWarehouse + amount);
        } else {
            warehouse.put(comodity, amount);
        }
    }

    public HashMap<Comodity, Integer> get(Comodity comodity, int amount) {
        if (!hasAmount(comodity, amount)) {
            System.out.println("Brak towaru");
            return new HashMap<>();
        }
        Integer amountInWarehouse = warehouse.get(comodity);
        warehouse.put(comodity, amountInWarehouse - amount);

        HashMap<Comodity, Integer> products = new HashMap<>();
        products.put(comodity, amount);
        return products;
    }
}
