import Utils.ProjectUtils;

public class TESTER {
    public static void main(String[] args) {
        ProjectUtils utils = new ProjectUtils();
        String testString = "This is a test .";
        char delimiter = ' ';
        String[] arrayString = testString.split(Character.toString(delimiter));
        for(String item : arrayString) {
            System.out.println(item);
        }
    }
}
