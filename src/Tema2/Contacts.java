package Tema2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {

    List<Person> listOfContacts=new ArrayList<>();
    Person person=new Person();


    public void addToContacts(Person p){
        listOfContacts.add(p);
    }

    public void showContacts(){
        for(Person p:listOfContacts){
            System.out.println(p);
        }
    }

    public void searchContact(){
        boolean finder=false;
        System.out.println("Introdu numele dupa care cautam:");
        String find=new Scanner(System.in).nextLine();
        for(Person p:listOfContacts){
            if(p.getName().equalsIgnoreCase(find)){
                System.out.println(p);
            }
        }
    }
    public void deleteContact(){
        System.out.println("Introdu numele contactului pe care urmeaza sa il stergi:");
       String find=new Scanner(System.in).nextLine();
        for(Person p:listOfContacts){
            if(p.getName().equalsIgnoreCase(find)){
                listOfContacts.remove(p);
            }
        }
    }
    public void replaceContact(){
        System.out.println("Introdu numele dupa care cautam:");
        String find=new Scanner(System.in).nextLine();
        System.out.println("Introdu noul nume:");
        String nume=new Scanner(System.in).nextLine();
        System.out.println("Introdu noul numar de telefon:");
        String telefon=new Scanner(System.in).nextLine();
        Person persona=new Person(nume,telefon);
        for(Person p:listOfContacts){
            if(p.getName().equalsIgnoreCase(find)){
                int index= listOfContacts.indexOf(p);
                listOfContacts.set(index,persona);
            }
        }
    }
    public void checkifEqualsOrAdd(String name,String phone){
        String nameTolowercase=name.toLowerCase();
        Person pp=new Person(nameTolowercase,phone);
            if(listOfContacts.equals(pp)){
                System.out.println("elementul este deja in lista");
            }else{
                listOfContacts.add(pp);
            }
        }
    }

