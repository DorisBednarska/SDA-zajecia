package zajecia.Zajecia10;

/**
 * Created by RENT on 2017-02-13.
 */
public class Comodity {
    private String name;
    private String description;
    private double price;

    public Comodity(String name) {
        this.name = name;
    }

    public Comodity(String name, String description, double price) {
        this(name);
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + description + ", " + price + "]";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


