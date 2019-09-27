package ui;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CuriosityBox {
    public ArrayList<CuriosityBoxEntry> operationLog;
    private Scanner scanner;

    private CuriosityBox() {
        operationLog = new ArrayList<>();
        scanner = new Scanner(System.in);
        processOperations();

    }

    private void processOperations() {
        String operation = "";
        CuriosityBoxEntry curiosityBoxEntry = new CuriosityBoxEntry();

        while (true) {
            // while is a loop, end with break
            System.out.println("Please select an option (add thought or remove most recent thought or quit):");
            operation = scanner.nextLine();
            System.out.println("You wrote: " + operation);

            if (operation.equals("quit")) {
                break;
            }

            if (operation.equals("add thought")) {
                String result = processOperation(curiosityBoxEntry, operation);
                System.out.println("you wrote:" + result);
            }

            if (operation.equals("remove most recent thought")) {
                // remove most recent thought!!!! operationLog.remove()
                System.out.println("Your thought has been removed.");
            }


        }

    }


    private String processOperation(CuriosityBoxEntry curiosityBoxEntry, String operation) {
        String result = "";

        System.out.println("What are you currently curious about?");
        String first = scanner.nextLine();
        System.out.println("What else are you thinking about?");
        String second = scanner.next(); //only keeps first word in second entry? curiosityboxentry has no purpose?
        scanner.nextLine();

        result = " " + first + " " + "and" + " " + second;

        logResult(curiosityBoxEntry, operation, first, second, result);

        return result;

    }


    private void logResult(CuriosityBoxEntry curiosityBoxEntry, String operation,
                           String first, String second, String result) {
        operationLog.add(curiosityBoxEntry);

    }


    public static void main(String[] args) {
        new CuriosityBox();

    }


}