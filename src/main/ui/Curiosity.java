package ui;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Curiosity {
    public ArrayList<CuriosityEntry> operationLog;
    private Scanner scanner;
    private static ArrayList<String> savedthoughts;
    private ArrayList<String> removedthoughts;

    private Curiosity() {
        operationLog = new ArrayList<>();
        scanner = new Scanner(System.in);
        processOperations();
        ArrayList<String> savedthoughts = new ArrayList<>();
        ArrayList<String> removedthoughts = new ArrayList<>();


    }

    private void processOperations() {
        String operation = "";
        CuriosityEntry curiosityEntry = new CuriosityEntry();

        while (true) {
            // while is a loop, end with break
            System.out.println("What would you like to do ([1] add a thought "
                    + "[2] cross off a thought [3] show all thoughts [4] quit):");
            operation = scanner.nextLine();
            System.out.println("you selected: " + operation);

            if (operation.equals("4")) {
                break;
            }

            if (operation.equals("1")) {
                System.out.println("enter what thought you'd like to add");
                operation = scanner.nextLine();
                savedthoughts.add(operation);
                System.out.println("you wrote: " + operation);
               logResult(curiosityEntry, operation);

            }

            if (operation.equals("2")) {
                System.out.println("which thought would you like to cross off");
                getSavedThoughts();
                operation = scanner.nextLine();

                if (operation.equals(savedthoughts.indexOf("The weather is quite cold today."))) {
                    savedthoughts.remove(0);
                    removedthoughts.add(0, "The weather is quite cold today.");
                }

                if (operation.equals(savedthoughts.indexOf("I'm looking for a job!"))) {
                    savedthoughts.remove(1);
                    removedthoughts.add(0, "I'm looking for a job!");
                }
                System.out.println("the thought has been crossed off");
            }

            if (operation.equals("3")) {
                getSavedThoughts();

            }


        }

        System.out.println("Operation log: " + operationLog);
    }



    private void logResult(CuriosityEntry curiosityEntry, String operation) {
        curiosityEntry.addThought(operation);
        operationLog.add(curiosityEntry);

    }


    public static void main(String[] args) {
        new Curiosity();

    }

    public ArrayList<String> getSavedThoughts() {
        savedthoughts.add(0,"The weather is quite cold today.");
        savedthoughts.add(1, "I'm looking for a job!");
        return this.savedthoughts;
    }


}