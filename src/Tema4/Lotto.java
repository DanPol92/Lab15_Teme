package Tema4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {

         myTicket();
    }
    public static Set generateTicket() {

        Set<Integer> nrextrase=new HashSet<>();
        nrextrase.add(new Random().nextInt(49) + 1);
        nrextrase.add(new Random().nextInt(49) + 1);
        nrextrase.add(new Random().nextInt(49) + 1);
        nrextrase.add(new Random().nextInt(49) + 1);
        nrextrase.add(new Random().nextInt(49) + 1);
        nrextrase.add(new Random().nextInt(49) + 1);

       return nrextrase;
    }
    public static void myTicket() {

        Set<Integer> ticket = generateTicket();
        System.out.println("Biletul extras este: " + ticket);
        int counter = 0;
        int incercari = 1;
        boolean checker = true;
        int cost = 10;

        while (checker) {
//            Set<Integer> biletulmeu = new HashSet<>();
//            biletulmeu.add(new Random().nextInt(49) + 1);
//            biletulmeu.add(new Random().nextInt(49) + 1);
//            biletulmeu.add(new Random().nextInt(49) + 1);
//            biletulmeu.add(new Random().nextInt(49) + 1);
//            biletulmeu.add(new Random().nextInt(49) + 1);
//            biletulmeu.add(new Random().nextInt(49) + 1);
            Set<Integer> biletulmeu = generateTicket();

            for (int i : ticket) {
                for (int j : biletulmeu) {
                    if (i == j) {
                        counter++;
                    }
                }
            }

            if (counter == 5) {
                cost = cost * incercari;
                System.out.println("S-au ghicit 5 numere din " + incercari + " incercari si a costat un total de " + cost + " lei");
                System.out.println("Biletul tau este: " + biletulmeu);
                checker = false;
            }else if (counter == 4) {
                cost = cost * incercari;
                System.out.println("S-au ghicit 4 numere din " + incercari + " incercari si a costat un total de " + cost + " lei");
                System.out.println("Biletul tau este: " + biletulmeu);
                checker = false;
            }else if (counter == 3) {
                cost = cost * incercari;
                System.out.println("S-au ghicit 3 numere din " + incercari + " incercari si a costat un total de " + cost + " lei");
                System.out.println("Biletul tau este: " + biletulmeu);
                checker = false;
            }
            incercari++;
            counter = 0;
        }
    }
}

