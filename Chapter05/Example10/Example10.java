import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Example10 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Collections.emptyList();

        try {
            // provoke an exception because there is no readme file
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NoSuchFileException fe) {
            System.out.println("Exception: File Not Found");
            //fe.printStackTrace();
        }

        // you will never see this print
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
