//The finally block can be used to execute some common code after any of the catch blocks used to handle a series of different exceptions in the code.

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Example12 {
    public static void main(String[] args) {
        List<String> lines = Collections.emptyList();

        try {
            // provoking an exception
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NoSuchFileException fe) {
            System.out.println("Exception: File Not Found");
        } catch (IOException ioe) {
            System.out.println("Exception: IOException");
        } finally {
            System.out.println("Exception: Case Closed");
            /* After the catch block detects the NoSuchFileException,
            the handling mechanism jumps into the finally block and executes whatever is in it
            */
        }

        // you will never see this print
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
