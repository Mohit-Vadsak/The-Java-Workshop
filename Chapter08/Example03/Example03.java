import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class Example03 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("java.io.tmpdir");

        Path path = Paths.get(pathString);
        Stream<Path> fileNames = Files.list(path);
        //this below statement replaces the for loop shows in Example01. It is just the same.
        //We get the whole path of the file.
        fileNames.limit(5).forEach(System.out::println);
    }
}
