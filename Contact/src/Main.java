import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String args[]) {

        ContactsBook<Contact> contactBooks = new ContactsBook<>();

        Contact camilla = new Contact("Camilla",893567877890l);
        Contact katya = new Contact("Katya",89345678901l );


        contactBooks.add(camilla);
        contactBooks.add(katya);

        contactBooks.getByPhone(893567877890l);
        contactBooks.removeByPhone(89345678901l);

    }
}
