package Tema2;

import java.util.ArrayList;
import java.util.List;

public class PP {

    public static void main(String[] args) {
        Person p1=new Person("ionut", "0722333444");
        Person p2=new Person("dan", "0711222333");
        Person p3=new Person("iulia", "0744555666");
        Person p4=new Person("george", "0755888999");
        Contacts c = new Contacts();
        c.addToContacts(p1);
        c.addToContacts(p2);
        c.addToContacts(p3);
        c.addToContacts(p4);

       c.showContacts();
//        c.searchContact();
//        c.deleteContact();
//        c.showContacts();
//        c.replaceContact();
//        c.showContacts();
          c.checkifEqualsOrAdd("lorena","95695965965");
        c.showContacts();

    }
}
