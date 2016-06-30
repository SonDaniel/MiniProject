import Utils.ProjectUtils;

import java.util.*;

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

            List<String> testList = utils.convertStringToList(testString, testDelimiter);

            System.out.println("RESULT: ");
            for(String item : testList) {
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
        String[] testArray3 = {null};

        System.out.print("CONTENT OF ARRAY: ");
        for(String string : testArray) {
            System.out.print(string + " ");
        }
        System.out.println("");
        System.out.println("RESULT:");
        List<String> testerList = utils.convertArrayToList(testArray);

        for(String item : testerList) {
            System.out.println(item);
        }

        System.out.print("CONTENT OF ARRAY2: ");
        for(String string : testArray2) {
            System.out.print(string + " ");
        }
        System.out.println("");
        System.out.println("RESULT:");
        List<String> testerList2 = utils.convertArrayToList(testArray2);

        for(String item : testerList2) {
            System.out.println(item);
        }

        System.out.print("CONTENT OF ARRAY3: ");
        for(String string : testArray3) {
            System.out.print(string + " ");
        }
        System.out.println("");
        System.out.println("RESULT:");
        List<String> testerList3 = utils.convertArrayToList(testArray3);

        for(String item : testerList3) {
            System.out.println(item);
        }

    }

    public static void choice3() {
        char testDelimiter= ' ';
        List<String> tester1 = new ArrayList<>();
        tester1.add("This");
        tester1.add("is");
        tester1.add("a");
        tester1.add("test");
        List<String> tester2 = new ArrayList<>();
        tester2.add("This");

        List<String> tester3 = new ArrayList<>();
        tester3.add(null);
        tester3.add("is");
        tester3.add("a");
        tester3.add("test");

        List<String> tester4 = new ArrayList<>();
        tester4.add(null);

        System.out.println("CONTENT OF LIST1:");
        for(String item : tester1) {
            System.out.println(item);
        }
        String resultString1 = utils.convertListToString(tester1, testDelimiter);

        System.out.println("RESULTS:");
        System.out.println(resultString1);

        System.out.println("CONTENT OF LIST2:");
        for(String item : tester2) {
            System.out.println(item);
        }
        String resultString2 = utils.convertListToString(tester2, testDelimiter);

        System.out.println("RESULTS:");
        System.out.println(resultString2);

        System.out.println("CONTENT OF LIST3:");
        for(String item : tester3) {
            System.out.println(item);
        }
        String resultString3 = utils.convertListToString(tester3, testDelimiter);

        System.out.println("RESULTS:");
        System.out.println(resultString3);

        System.out.println("CONTENT OF LIST4:");
        for(String item : tester4) {
            System.out.println(item);
        }
        String resultString4 = utils.convertListToString(tester4, testDelimiter);

        System.out.println("RESULTS:");
        System.out.println(resultString4);
    }

}
