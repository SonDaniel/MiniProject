package Utils;

import java.util.ArrayList;
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
        if (sourceString.isEmpty()) {
            return null;
        } else {
            String[] storageArray = sourceString.split(Character.toString(delimiter));
            return convertArrayToList(storageArray);
        }
    }

    /**
     * The method, convertArrayToList, will take the String array parameter and convert
     * it into a List.
     * @param sourceArray A String array that will be converted to a List
     * @return A List with the content of the String array
     */
    public List<String> convertArrayToList(String[] sourceArray) {
        List<String> storageList = new ArrayList<>();
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
