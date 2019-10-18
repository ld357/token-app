package ui;

import model.moods.Amazing;
import model.moods.Bad;

import java.util.ArrayList;
import java.util.Scanner;

public class MoodSelector {
    public ArrayList<MoodEntry> operationLog;
    private Scanner scanner;

    private MoodSelector() {
        operationLog = new ArrayList<>();
        scanner = new Scanner(System.in);
        processOperations();

    }

    private void processOperations() {
        String operation = "";
        MoodEntry moodEntry = new MoodEntry();

        while (true) { // while is a loop, end with break
            System.out.println("Please select an option ([1] amazing [2] bad or [3] quit):");
            operation = scanner.nextLine();
            System.out.println("You wrote: " + operation);

            if (operation.equals("3")) {
                break;
            }

            if (operation.equals("1")) {
                String result = processOperation(moodEntry, operation);
                Amazing amazing = new Amazing();
            }

            if (operation.equals("2")) {
                String result = processOperation(moodEntry, operation);
                Bad bad = new Bad();
            }

        }
    }



    private String processOperation(MoodEntry moodEntry, String operation) {
        String result = "";

        System.out.println("How are you feeling?");
        String first = scanner.nextLine();
        scanner.nextLine();

        result = " " + first;

        logResult(moodEntry, operation, first, result);

        return result;

    }



    private void logResult(MoodEntry moodEntry, String operation,
                           String first, String result) {
        moodEntry.addThought(first);
        operationLog.add(moodEntry);

    }


    public static void main(String[] args) {
        new MoodSelector();

    }
}
