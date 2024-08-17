package application;

// -------------------------------------------
// Pseudocode
// Author: Hailey King-Winterton
// Due Date: 08/18/2024
// -------------------------------------------
// Start
//		1. initialize bag
//		2. add contents
//		3. display menu
//			1. print
//			2. contains
//			3. count
//			4. remove
//			5. exit
// 		4. case set up for menu
// End
// -------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Bag<String> bag = new Bag<>();
    	
    	// Adding items to bag
    	bag.add("apple");
    	bag.add("carrot");
    	bag.add("lemon");
    	bag.add("blueberry");
    	bag.add("lemon");
    	bag.add("apple");
   
    	// Scanner object
    	Scanner scanner = new Scanner(System.in);
    	
    	// Menu options
        while (true) {
            System.out.println("-----------------");
            System.out.println("Menu:");
            System.out.println("-----------------");
            System.out.println("1. Print test.");
            System.out.println("2. Contains test.");
            System.out.println("3. Count test");
            System.out.println("4. Remove test.");
            System.out.println("5. Exit.");
            System.out.println("-----------------");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println(" Bag contents:");
                    bag.printBag();
                    break;
                case 2:
                    System.out.print("Check if bag contains item (case sensitive): ");
                    String containsElement = scanner.nextLine();
                    boolean containsItem = bag.contains(containsElement);
                    System.out.println("Bag contains '" + containsElement + "': " + containsItem);
                    break;
                case 3:
                    System.out.print("Get count of item (case sensitive): ");
                    String countElement = scanner.nextLine();
                    System.out.println("Count of '" + countElement + "': " + bag.count(countElement));
                    break;
                case 4:
                    System.out.print("Remove item (case sensitive): ");
                    String removeElement = scanner.nextLine();
                    bag.remove(removeElement);
                    System.out.println(" Updated bag contents:");
                    bag.printBag();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
