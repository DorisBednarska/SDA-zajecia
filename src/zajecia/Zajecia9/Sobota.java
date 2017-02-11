package zajecia.Zajecia9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by RENT on 2017-02-11.
 */
public class Sobota {
    public static void main(String[] args) {
        String message = "Lorem ipsum dolor sit amet enim. Etiam ullamcorper. Suspendisse a pellentesque dui, non felis. Maecenas malesuada elit lectus felis, malesuada ultricies. Curabitur et ligula. Ut molestie a, ultricies porta urna. Vestibulum commodo volutpat a, convallis ac, laoreet enim. Phasellus fermentum in, dolor. Pellentesque facilisis. Nulla imperdiet sit amet magna. Vestibulum dapibus, mauris nec malesuada fames ac turpis velit, rhoncus eu, luctus et interdum adipiscing wisi. Aliquam erat ac ipsum. Integer aliquam purus. Quisque lorem tortor fringilla sed, vestibulum id, eleifend justo vel bibendum sapien massa ac turpis faucibus orci luctus non, consectetuer lobortis quis, varius in, purus.";
        BookShelf bookShelf = new BookShelf();
        Author henrykSienkiewicz = new Author("Henryk", "Sienkiewicz");

        Book book = new Book("Krzyzacy", henrykSienkiewicz, 2000, message.split(" "));
        Book book2 = new Book("Ogniem i mieczem", henrykSienkiewicz, 1998, message.split(" "));
        Book book3 = new Book("Potop", henrykSienkiewicz, 2000, message.split(" "));
        Book book4 = new Book("Pan Wolodyjowski", henrykSienkiewicz, 1976, message.split(" "));
        Book book5 = new Book("Dziady", new Author("Adam", "Mickiewicz"), 2012, message.split(" "));
        bookShelf.add(book);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);
        bookShelf.add(book5);
    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();
        }
    }
}
