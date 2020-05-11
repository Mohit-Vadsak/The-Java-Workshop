//Reading an Existing File
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Example08 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";
        Path pathFile = Paths.get(pathString);
        try {
            List<String> fileContent = Files.readAllLines(pathFile);
            //readAllLines() to open the existing file and reads the contents into the computer's memory, putting them into the fileContent list.
            // this will go through the buffer containing the whole file
            // and print it.
            for (String content:fileContent){
                System.out.print(content);
            }
        } catch (IOException ioe) {
            System.out.println("WARNING: there was an issue with the file");
        }
    }
}
