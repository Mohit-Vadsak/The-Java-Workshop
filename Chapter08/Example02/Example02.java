import java.io.IOException;
import java.nio.file.*;
import java.util.*;


public class Example02 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("java.io.tmpdir");

        List<String> fileNames = new ArrayList<>();
        DirectoryStream<Path> directoryStream;
        //DirectoryStream is used to get the full path of he files in the temp folder in windows system.
        directoryStream = Files.newDirectoryStream(Paths.get(pathString));
        for (Path path : directoryStream) {
            fileNames.add(path.toString());
        }

        for (int i = 0; i < 5; i++ ) {
            System.out.println(fileNames.get(i));
        }
    }
}
