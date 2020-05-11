import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Example04 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("java.io.tmpdir");

        List<String> fileNames = new ArrayList<>();
        DirectoryStream<Path> directoryStream;

        directoryStream = Files.newDirectoryStream(Paths.get(pathString));
        for (Path path : directoryStream) {
            fileNames.add(path.toString());
        }
        //We are now able to distinguish that it is a File of a Directory. It will simply show that before path that
        //it is a File or Dir.
        for (int i = 0; i < 5; i++ ) {
            String filePath = fileNames.get(i);
            String fileType = Files.isDirectory(Paths.get(filePath)) ? "Dir" : "Fil";
            System.out.println(fileType + " " + filePath);
        }
    }
}
