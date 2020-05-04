//Properties in the collections framework are used to maintain lists of key-value pairs where both are of the String class.

import java.util.*;

public class Example20 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        Set setOfKeys;
        String key;

        properties.put("OS", "Ubuntu Linux");
        properties.put("version", "18.04");
        properties.put("language", "English (UK)");
        //we will use put method rather than add method like Map.
        // iterate through the map
        setOfKeys = properties.keySet();
        Iterator iterator = setOfKeys.iterator();

        while(iterator.hasNext()) //hasNext is used to check if there is next Node or not which has value embedded in it.
        {
            key = (String)iterator.next(); // traverses to next node
            System.out.println(key +
                    " = " + properties.getProperty(key));
        }
        System.out.println();

        // looking for URL that not in list
        String value = properties.getProperty("keyboard layout", "not found");

        System.out.println("keyboard layout = " + value);
     }
}
