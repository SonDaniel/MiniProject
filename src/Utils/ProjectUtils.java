package Utils;

import java.util.LinkedList;
import java.util.List;

public class ProjectUtils {
    /**
     * The method, convertStringToList, allows the user to input a String and a delimiter character
     * which then takes the string and separates each string determined by the delimiter.
     * @param sourceString A String given to separate into a List
     * @param delimiter A character that determines end of string
     * @return A List with the strings separated by the delimiter
     */
    public List convertStringToList(String sourceString, char delimiter) {
        List<String> storageList = new LinkedList<>();
        String storageString = "";
        for(int ii = 0; ii < sourceString.length(); ii++) {
            if (sourceString.charAt(ii) != delimiter) {
                storageString = storageString.concat(Character.toString(sourceString.charAt(ii)));
                if (ii == sourceString.length() - 1) { //checks to see if last index
                    storageList.add(storageString);
                }
            } else { //if delimiter found, store string
                if (!(storageString.equals(""))) { //checks to see if any character
                    storageList.add(storageString);
                    storageString = ""; //reset string value
                }
            }
        }
        return storageList;
    }

    /**
     * The method, convertArrayToList, will take the String array parameter and convert
     * it into a List.
     * @param sourceArray A String array that will be converted to a List
     * @return A List with the content of the String array
     */
    public List convertArrayToList(String[] sourceArray) {
        List<String> storageList = new LinkedList<>();
        for(String index : sourceArray) {
            storageList.add(index);
        }
        return storageList;
    }

    /**
     * The method, convertListToString, will take a List and convert the content back
     * into one string using the delimiter character to separate each string.
     * @param sourceList A List of Strings
     * @param delimiter A character that separates each string
     * @return A String of the concatenated List using a delimiter
     */
    public String convertListToString(List sourceList, char delimiter) {
        String storageString = null; //initialize temporary string
        for(Object list : sourceList) {
            if (storageString == null) { //initialize storageString with value
                storageString = list.toString();
            } else { //concat string and delimiter
                storageString = storageString.concat(Character.toString(delimiter)).concat(list.toString());
            }
        }
        return storageString;
    }
}
