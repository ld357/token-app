package ui;

import model.*;
import people.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class WellnessJournal {
    private ArrayList<CuriosityBox> operationLog;
    private Scanner scanner;

    public WellnessJournal() {
        operationLog = new ArrayList<>();
        scanner = new Scanner(System.in);
        processOperations();
    }

    private void processOperations() {
        String operation = "";
        CuriosityBox curiosityBox = new CuriosityBox();

        while (true) {
            // while is a loop, end with break
            System.out.println("Please select an option (add thought or remove a thought or quit):");
            operation = scanner.nextLine();
            System.out.println("You selected: " + operation);

            if (operation.equals("quit")) {
                break;
            }

            if (operation.equals("add thought")) {
                CuriosityBox thoughtA = new CuriosityBox();
            }

            if (operation.equals("remove a thought")) {
                operationLog.remove(operation);
            }

        }
    }

    private String processOperation(CuriosityBox curiosityBox, String operation) {
        String result = "";

        System.out.println("What are you currently curious about?" + operation);
        String first = scanner.next();
        System.out.println("What else would you like to add?" + operation);
        String second = scanner.next();
        scanner.nextLine();

        if (operation.equals("")) {
            result = first + second;
        }

        logResult(curiosityBox, operation, first, second, result);

        return result;

    }

    private void logResult(CuriosityBox curiosityBox, String operation, String first, String second, String result) {
    }


    private void logResult(CuriosityBox curiosityBox, String operation, String result) {
        CuriosityBox.setOperation(operation);
        CuriosityBox.setResult(result);

    }


    public static void main(String[] args) {
        Quotes mySet = new Quotes();
        mySet.insert("Never let your fear decide your fate.");
        mySet.insert("Dwell on the beauty of life. Watch the stars, and see yourself running with them.");

        System.out.println(mySet.size());

        new ActivityReminder();
        new CuriosityBox();
        new GoalSetter();
        new MoodTracker();

        Person p = new Person();
        p.findPeace();
        p.doBetter();
        p.stayHydrated();


    }


}


