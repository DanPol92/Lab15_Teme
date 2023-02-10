package Tema1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checker = false;
        Path ph = null;
        Set<String> groceryList = new TreeSet<>();

        while (!checker) {
            System.out.println("""
                    Chose option:
                    0-close program and save the list to file
                    1-add item to list
                    2-remove item from list
                                        
                    Enter your option: """);
            switch (sc.nextInt()) {
                case 0:
                    System.out.println("Your final list is:");
                    checker = true;
//                    try {
//                        ph = Paths.get("cumparaturi.txt");
//                        Files.write(ph, groceryList);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }

                    try (BufferedWriter br = new BufferedWriter(new FileWriter("groceries.txt"))) {
                        for (String str : groceryList) {
                            br.write(str + ",");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 1:
                    System.out.println("Add item to grocery list, separated by \",\":");
                    sc.nextLine();
                    String[] items = sc.nextLine().split(",");
                    groceryList.addAll(List.of(items));
                    break;
                case 2:
                    System.out.println("Remove item from grocery list:");
                    sc.nextLine();
                    String[] removable = sc.nextLine().split(",");
                    groceryList.removeAll(List.of(removable));
                    break;
                default:
                    checker = true;
            }
            System.out.println(groceryList);

        }
        Iterator<String> i = groceryList.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }
    }
}