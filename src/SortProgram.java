import java.util.ArrayList;
import java.util.Scanner;

public class SortProgram {

    private Scanner myScanner = new Scanner(System.in);

    public void startProgram() {
        ArrayList myList = new ArrayList();
        addToList(myList);
        System.out.println(myList+"\n");
        do {
            printBitch("[ADD]\n[REMOVE]\n");
            String menuInput = myScanner.next();
            if (menuInput.equals("ADD")) {
                printBitch("What would you like to add, bitch?");
                String item = myScanner.next();
                myList.add(item);
                printBitch(myList);
            } else if (menuInput.equals("REMOVE")) {
                printBitch("What would you like to remove, bitch?");
                String item = myScanner.next();
                int idx = 0;
                while (idx < myList.size()) {
                    if (myList.get(idx) == item) {
                        myList.remove(idx);
                    } else {
                        ++idx;
                    }
                }
                printBitch(myList);
            } else {
                break;
            }
        }while(true);
    }

    private void addToList(ArrayList myList) {
        String testLoop;
        do{
            printBitch("Hello, bitch, gimme something to list!\n");
            String item = myScanner.next();
            myList.add(item);
            printBitch("Anything else, bitch? (y/n)\n");
            testLoop = myScanner.next();
        }while(testLoop.equals("y"));
    }

    private void printBitch(String source) {
        System.out.println(source+", bitch");
    }

    private void printBitch(ArrayList source) {
        System.out.println(source+", bitch");
    }
}
