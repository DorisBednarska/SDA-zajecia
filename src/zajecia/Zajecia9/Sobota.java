package zajecia.Zajecia9;

/**
 * Created by RENT on 2017-02-11.
 */
public class Sobota {
    public static void main(String[] args) {
//        user.firstName = "Doris";
//        user.lastName = "Bednarska";
////        user.birthDate = "18.09.1992 r.";
//        User user2 = new User();
//        user2.firstName = "Jan";
//        user2.lastName = "Kowalski";
//        user2.birthDate = "18.02.1995 r.";
//        User[] users = new User[2];
//        users[0] = user;
//        users[1] = user2;
//        printUsers(users);
        User user = new User("Doris", "Bednarska", "18.09.1992 r.");
        Address address = new Address("Poznan", "Poznanska", 30, "12-345", "Poland");
        user.address = address;
        user.print();

    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();
        }
    }
}
