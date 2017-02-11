package zajecia.Zajecia9;

/**
 * Created by RENT on 2017-02-11.
 */
public class Address {
    public String city;
    public String street;
    public int houseNumber;
    public String zipCode;
    public String land;

    public Address(String city, String street, int houseNumber, String zipCode, String land) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.land = land;
    }

    //konstruktor


    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(zipCode)
                .append(" ")
                .append(city)
                .append(", ")
                .append(street)
                .append(" ")
                .append(houseNumber)
                .append(" ")
                .append(land);
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);
    }
    public Address(){

    }

}
