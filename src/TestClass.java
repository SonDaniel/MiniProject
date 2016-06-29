import Utils.ProjectUtils;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestClass {

    private static Scanner input = new Scanner(System.in);
    private static ProjectUtils utils = new ProjectUtils();

    public static void main(String args[]) {
        menu();
    }

    public static void menu() {
        System.out.println("---------------------------------------");
        System.out.println("[1] convert String to List");
        System.out.println("[2] convert array to List");
        System.out.println("[3] convert List to delimited String");
        System.out.println("");
        System.out.println("[0] exit");
        System.out.println("---------------------------------------");
        System.out.print("choice: ");

        try {
            int choice = input.nextInt();
            input.nextLine();
            decision(choice);

        } catch (InputMismatchException ex) {
            System.out.println("Please enter a valid Integer");
            ex.printStackTrace();
        }
    }

    public static void decision(int choice) {
        switch (choice) {
            case 1:
                choice1();
                menu();
                break;
            case 2:
                choice2();
                menu();
                break;
            case 3:
                choice3();
                menu();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Not a valid choice.");
                menu();

        }
    }

    public static void exit() {
        System.out.println("bye");
    }

    public static void choice1() {
        System.out.println("Please enter a string however you like.");
        System.out.print("STRING: ");
        try {
            String testString = input.nextLine();
            System.out.println("Please enter a delimiter.");

            System.out.print("DELIMITER: ");
            char testDelimiter = input.nextLine().charAt(0);

            List testList = utils.convertStringToList(testString, testDelimiter);

            System.out.println("RESULT: ");
            for(Object item : testList) {
                System.out.println(item);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input.");
            ex.printStackTrace();
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("You need a delimiter.");
        }
    }

    public static void choice2() {
        System.out.println("");
        System.out.println("TESTING CONVERTING ARRAY TO LIST");

        String[] testArray = {"daniel", "david", "you"};
        String[] testArray2 = {null, "daniel", "david"};
        System.out.print("CONTENT OF ARRAY: ");
        for(String string : testArray) {
            System.out.print(string + " ");
        }
        System.out.println("");
        System.out.println("RESULT:");
        List testerList = utils.convertArrayToList(testArray);

        for(Object item : testerList) {
            System.out.println(item);
        }

        System.out.print("CONTENT OF ARRAY2: ");
        for(String string : testArray2) {
            System.out.print(string + " ");
        }
        System.out.println("");
        System.out.println("RESULT:");
        List testerList2 = utils.convertArrayToList(testArray2);

        for(Object item : testerList2) {
            System.out.println(item);
        }
    }

    public static void choice3() {
        List<String> tester = new LinkedList<>();
        char testDelimiter= ' ';
        tester.add("This");
        tester.add("is");
        System.out.println("CONTENT OF LIST:");
        for(Object item : tester) {
            System.out.println(item);
        }
        String resultString = utils.convertListToString(tester, testDelimiter);

        System.out.println("RESULTS:");
        System.out.println(resultString);
    }

}
