package Tema3;

import Tema2.Person;

import java.util.*;

public class Agenda {

    Hashtable<String, String> listOfContacts = new Hashtable<>();

    public void addToAgenda() {
        listOfContacts.put("ionut", "0722333444");
        listOfContacts.put("dan", "0711222333");
        listOfContacts.put("iulia", "0744555666");
        listOfContacts.put("george", "0755888999");

    }

    public void showAgenda() {
        for (Map.Entry<String, String> e : listOfContacts.entrySet())
            System.out.println(e.getKey() + ","
                    + e.getValue());
    }

    public void searchInAgenda() {
        System.out.println("Introdu numele dupa care cautam:");
        String find = new Scanner(System.in).nextLine();
        for (Map.Entry<String, String> e : listOfContacts.entrySet()) {
            if (e.getKey().equalsIgnoreCase(find)) {
                System.out.println(e.getKey() + ","
                        + e.getValue());
            }
        }
    }

    public void deleteFromAgenda() {
        System.out.println("Introdu numele contactului pe care urmeaza sa il stergi:");
        String find = new Scanner(System.in).nextLine();
        if (listOfContacts.containsKey(find.toLowerCase())) {
            listOfContacts.remove(find);
        }

    }

    public void replaceInAgenda() {
        System.out.println("Introdu numele dupa care cautam:");
        String find = new Scanner(System.in).nextLine();
        System.out.println("Introdu noul numar:");
        String telefon = new Scanner(System.in).nextLine();

        for (Map.Entry<String, String> e : listOfContacts.entrySet())
        if (e.getKey().equalsIgnoreCase(find)) {
            listOfContacts.replace(e.getKey(),telefon);
        }
    }


    public void checkifEqualsOrAdd(String name,String phone){
       listOfContacts.putIfAbsent(name,phone);
        }
    }

