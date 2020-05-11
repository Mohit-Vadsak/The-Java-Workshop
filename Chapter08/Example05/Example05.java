import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Example05 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("user.home");
        //will traverse to the users folder of the windows
        //Files.walk() will extract the directory structure up to a certain depth, in our case, one.
        List<Path> subDirectories = Files.walk(Paths.get(pathString), 1)
            .filter(Files::isDirectory)
            .collect(Collectors.toList());
        //used to ensure the selection of a directory.
        for (int i = 0; i < 10; i++ ) {
            Path filePath = subDirectories.get(i);
            String fileType = Files.isDirectory(filePath) ? "Dir" : "Fil";
            System.out.println(fileType + " " + filePath);
        }
    }
}
