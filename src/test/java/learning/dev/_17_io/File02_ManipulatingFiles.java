package learning.dev._17_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File02_ManipulatingFiles {

    public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("src\\test\\java\\resources");

        // checking for a file/dir
        boolean exists = Files.exists(path);
        System.out.println("path exists : " + exists);

        // same file ?
        // copy file
        
        // delete file
        try {
            Files.delete(path);
            System.out.println("file deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
        // no exception thrown
        Files.deleteIfExists(path);
        //
    }
    
}
