import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortProgram {

    private ArrayList<String> myList = new ArrayList<>();

    public void startProgram() {
        printBitch("\nHello, bitch, gimme something to list!\n");
        addListItem();
        displayMenu();
    }

    private void displayMenu() {
        System.out.println("\nYour list: " + myList);
        printBitch("\n[A]DD\n[R]EMOVE\n[S]ORT\n[E]XIT");
        menuSelection(getUserInput());
    }

    private void menuSelection(String input) {
        switch (firstLetter(input)) {
            case "a":
                addListItem();
                displayMenu();
                break;
            case "r":
                removeListItem();
                displayMenu();
                break;
            case "s":
                Collections.sort(myList);
                displayMenu();
                break;
            case "e":
                endProgram();
                break;
            default:
                printBitch("Invalid selection, try again, bitch.");
                displayMenu();
                break;
        }
    }

    private void addListItem() {
        printBitch("\nWhat would you like to add, bitch?");
        myList.add(getUserInput());
    }

    private void removeListItem() {
        printBitch("\nWhat would you like to remove, bitch?");
        String item = getUserInput();

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).equals(item))
                myList.remove(i);
        }
    }

    private String getUserInput() {
        final Scanner myScanner = new Scanner(System.in);
        System.out.print("> ");
        return myScanner.next().toLowerCase();
    }

    private String firstLetter(String userInput) {
        return String.valueOf(userInput.charAt(0)).toLowerCase();
    }

    private void printBitch(String source) {
        System.out.println(source);
    }

    private void endProgram() {
        printBitch("\nBye, bitch!");
    }
}
