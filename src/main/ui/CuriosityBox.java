package ui;

import java.util.ArrayList;
import java.util.Scanner;

public class CuriosityBox {
    public ArrayList<CuriosityEntry> operationLog;
    private Scanner scanner;
    CuriosityEntry curiosityEntry;

    private CuriosityBox() {
        operationLog = new ArrayList<>();
        scanner = new Scanner(System.in);
        processOperations();

    }

    private void processOperations() {
        String operation = "";
        curiosityEntry = new CuriosityEntry();

        while (true) { // while is a loop, end with break
            System.out.println("Please select an option ([1] add thought " + " or [2] remove a thought"
                    + " or [3] quit):");
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
                removeThought(operation);
            }


        }
    }


    // MODIFIES: this
    // EFFECTS: removes thought specified from light of thoughts
    public void removeThought(String operation) {
        System.out.println(curiosityEntry.getAllThoughts());
        System.out.println("Which thought would you like to remove?");
        operation = scanner.nextLine();
        System.out.println(operation);
        int originalsize = curiosityEntry.allthoughts.size();

        for (int i = 0; i < curiosityEntry.allthoughts.size(); i++) {
            if (curiosityEntry.allthoughts.get(i).equals(operation)) {
                curiosityEntry.removeThought(curiosityEntry.allthoughts.get(i));
                System.out.println("Your thought has been removed.");
            }
        }
    }


    private String processOperation(CuriosityEntry curiosityEntry, String operation) {
        String result = "";

        System.out.println("What are you currently curious about?");
        String first = scanner.nextLine();
      //  scanner.nextLine();

        result = " " + first;

        logResult(curiosityEntry, operation, first, result);

        return result;

    }



    private void logResult(CuriosityEntry curiosityEntry, String operation,
                           String first, String result) {
        curiosityEntry.addThought(first);
        operationLog.add(curiosityEntry);

    }


    // EFFECTS: instantiates new CuriosityBox
    public static void main(String[] args) {
        new CuriosityBox();

    }
}

//  private void processOperations() {
//        String operation = "";
//        CuriosityEntry curiosityEntry = new CuriosityEntry();
//
//        while (true) { // while is a loop, end with break
//            System.out.println("Please select an option ([1] add thought "
//                    + "[2] remove most recent thought or [3] enter mood or [4] quit):");
//            operation = scanner.nextLine();
//            System.out.println("You wrote: " + operation);
//
//            if (operation.equals("4")) {
//                break;
//            }
//
//            if (operation.equals("1")) {
//                String result = processOperation(curiosityEntry, operation);
//                System.out.println("you wrote:" + result);
//            }
//
//            if (operation.equals("2")) {
//             //   curiosityEntry.getAllThoughts();
//             //   System.out.println("Which thought would you like to remove?");
//             //   operation = scanner.nextLine();
//              //  curiosityEntry.removeThought(operation);
//                System.out.println("Your thought has been removed.");
//            }
//
//            if (operation.equals("3")) {
//                System.out.println("How are you feeling?");
//                operation = scanner.nextLine();
//                if (operation.equals("Amazing")) {
//                    Amazing amazing = new Amazing();
//                    amazing.announceMood();
//                    amazing.soundMood();
//
//                }
//
//            }
//        }
//
//    }







// with two thoughts...
//    private void logResult(CuriosityEntry curiosityEntry, String operation,
//                           String first, String second, String result) {
//        operationLog.add(curiosityEntry);
//
//    }

//  result = " " + first + " " + "and" + " " + second;

// logResult(curiosityEntry, operation, first, second, result);

// System.out.println("What else are you thinking about?");
//  String second = scanner.nextLine(); //only keeps first word in second entry? curiosityboxentry has no purpose?