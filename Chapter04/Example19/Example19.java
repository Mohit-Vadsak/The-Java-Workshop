import java.util.*;

public class Example19 {
    public static void main(String[] args) {
        List <Double> array = new ArrayList();

        array.add(5.0);
        array.add(2.2);
        array.add(37.5);
        array.add(3.1);
        array.add(1.3);

        System.out.println("Original list: " + array);

        Collections.sort(array);
        //Get the sorted order in Arraylist by using sort function. Instead in TreeMap it is sorted automatically by default
        System.out.println("Modified list: " + array);
    }
}
