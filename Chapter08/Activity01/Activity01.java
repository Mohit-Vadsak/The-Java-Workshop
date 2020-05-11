//Writing the Directory Structure to a File
/*
This activity's goal is to program an application that will read the directory structure,
starting from a directory that is stored in a variable.
The results will be written to a text file so that for each nesting level,
you will include either a tab space or four white spaces to indent nested folders visually
from their respective parents. Also, you will have to show only the name of the folder
and not the full path to it.
*/
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Collections;

public class Activity01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(System.getProperty("user.home"));

        String fileName = "temp.txt";
        Path pathFile = Paths.get(fileName);

        if(!Files.exists(pathFile))  {
            try {
                // Create the file
                Files.createFile(pathFile);
                System.out.println("New file created at: " + pathFile);
            } catch (IOException ioe) {
                System.out.println("EXCEPTION when creating file: " + ioe.getMessage());
            }
        }

        Files.walkFileTree(path, Collections.emptySet(), 10, new
                SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {

                        String toFile = "";

                        String [] pathArray = path.toString().split("/");
                        int depthInit = pathArray.length;
                        String [] fileArray = dir.toString().split("/");
                        int depthCurrent = fileArray.length;
                        for (int i = depthInit; i < depthCurrent; i++) {
                            toFile += "    ";
                        }
                        toFile += fileArray[fileArray.length - 1];

                        if(Files.exists(pathFile))
                            try {
                                Files.write(pathFile, Arrays.asList(toFile),
                                        StandardOpenOption.APPEND);
                            } catch (IOException ioe) {
                                System.out.println("EXCEPTION when writing to file: " + ioe.getMessage());
                            }

                        return FileVisitResult.CONTINUE;
                    }
                    @Override
                    public FileVisitResult visitFileFailed(Path file, IOException
                            exc)
                            throws IOException {
                        System.out.println("visitFileFailed: " + file);
                        return FileVisitResult.CONTINUE;
                    }
                });
    }
}
