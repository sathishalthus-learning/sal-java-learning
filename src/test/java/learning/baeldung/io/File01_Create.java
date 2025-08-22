package learning.baeldung.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

public class File01_Create {

public static void main(String[] args) throws IOException {
    
    // java.io.File
    File newFile = new File("src\\test\\java\\resources\\newFile.txt");
    boolean status = newFile.createNewFile();
    System.out.println("File Status : "+status );

    // java.nio
    Path newFilePath = Paths.get("src\\test\\java\\resources\\", "nioFile.txt");
    try {
            Files.createFile(newFilePath);
    // boolean isCreated = Files.exists(newFilePath);
    System.out.println("File Status : created" );
    } catch (Exception e) {
        System.out.println("File Status : exists" );
    }

    // fileoutputstream
    try (FileOutputStream fos = new FileOutputStream("src\\test\\java\\resources\\fosFile.txt"))
    {
        System.out.println("File Status : created" );
    } catch (Exception e) {
        System.out.println("File Status : overwrited" );
    }

    // commons.io
      try {
            FileUtils.touch(new File("src\\test\\java\\resources\\commonsFile.txt"));
            System.out.println("File Status : created" );
        } catch (Exception e) {
        System.out.println("File Status : exists" );
    }


}   

}
