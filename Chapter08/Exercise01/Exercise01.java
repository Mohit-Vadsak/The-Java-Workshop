//Listing the Contents of Subdirectories
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class Exercise01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(System.getProperty("user.home"));
        //User home Directory
        Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                System.out.println(dir.toString());
                return FileVisitResult.CONTINUE;
            }
            //Exception generated if we access and administritive files or access denied files.
            //It willl show the name but wont be able to access the file/folder. mostly happens with hidden files.
            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.out.println("visitFileFailed: " + file);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
