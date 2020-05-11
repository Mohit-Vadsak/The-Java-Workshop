import java.io.IOException;
import java.nio.file.*;

public class Example09 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";
        Path pathFile = Paths.get(pathString);
        //A different approach that gets the same result, but avoids Lists and uses Streams instead,
        try {
            Files.lines(pathFile).forEach(System.out::println);
        } catch (IOException ioe) {
            System.out.println("WARNING: there was an issue with the file");
        }
    }
}
