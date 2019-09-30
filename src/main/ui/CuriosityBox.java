package ui;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CuriosityBox {
    public ArrayList<CuriosityEntry> operationLog;
    private Scanner scanner;

    private CuriosityBox() {
        operationLog = new ArrayList<>();
        scanner = new Scanner(System.in);
        processOperations();

    }

    private void processOperations() {
        String operation = "";
        CuriosityEntry curiosityEntry = new CuriosityEntry();

        while (true) {
            // while is a loop, end with break
            System.out.println("Please select an option ([1] add thought "
                    + "[2] remove most recent thought or [3] quit):");
            operation = scanner.nextLine();
            System.out.println("You wrote: " + operation);

            if (operation.equals("3")) {
                break;
            }

            if (operation.equals("1")) {
                String result = processOperation(curiosityEntry, operation);
                System.out.println("you wrote:" + result);
            }

            if (operation.equals("2")) {
                // remove most recent thought!!!! operationLog.remove()
                System.out.println("Your thought has been removed.");
            }


        }

    }


    private String processOperation(CuriosityEntry curiosityEntry, String operation) {
        String result = "";

        System.out.println("What are you currently curious about?");
        String first = scanner.nextLine();
        System.out.println("What else are you thinking about?");
        String second = scanner.nextLine(); //only keeps first word in second entry? curiosityboxentry has no purpose?
        scanner.nextLine();

        result = " " + first + " " + "and" + " " + second;

        logResult(curiosityEntry, operation, first, second, result);

        return result;

    }


    private void logResult(CuriosityEntry curiosityEntry, String operation,
                           String first, String second, String result) {
        operationLog.add(curiosityEntry);

    }


    public static void main(String[] args) {
        new CuriosityBox();

    }
}
