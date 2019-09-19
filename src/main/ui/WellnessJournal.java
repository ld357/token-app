package ui;

import model.*;
import people.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class WellnessJournal {
    private ArrayList<CuriosityBox> operationLog;
    private Scanner scanner;

    private WellnessJournal() {
        operationLog = new ArrayList<>();
        scanner = new Scanner(System.in);
        processOperations();

    }

    private void processOperations() {
        String operation = "";
        CuriosityBox curiosityBox = new CuriosityBox();

        while (true) {
            // while is a loop, end with break
            System.out.println("Please select an option (add thought or remove most recent thought or quit):");
            operation = scanner.nextLine();
            System.out.println("You selected: " + operation);

            if (operation.equals("quit")) {
                break;
            }

            String result = processOperation(curiosityBox, operation);
            System.out.println("you wrote:" + result);
        }

        System.out.println("Your full message: " + operationLog);
    }


    private String processOperation(CuriosityBox curiosityBox, String operation) {
        String result = "";

        System.out.println("What are you currently curious about?");
        String first = scanner.next();
        System.out.println("What else are you thinking about?");
        String second = scanner.next();
        scanner.nextLine();

        if (operation.equals("I am curious about..." + operation)) { // ASK TA!!!
            result = first + second;
        }

        logResult(curiosityBox, operation, first, second, result);

        return result;

    }


    private void logResult(CuriosityBox curiosityBox, String operation, String first, String second, String result) {
        //CuriosityBox.setOperation(operation);
        //CuriosityBox.addOperand(first);
       // CuriosityBox.addOperand(second);
       // CuriosityBox.setResult(result);
        operationLog.add(curiosityBox);

    }


    public static void main(String[] args) {
        new WellnessJournal();
        Quotes mySet = new Quotes();
        mySet.insert("Never let your fear decide your fate.");
        mySet.insert("Dwell on the beauty of life. Watch the stars, and see yourself running with them.");

        System.out.println(mySet.size());

        new ActivityReminder();
        new CuriosityBox();
        new GoalSetter();
        new MoodTracker();

        GoalSetter p2 = new GoalSetter();
        p2.countGoals(2);




    }


}


