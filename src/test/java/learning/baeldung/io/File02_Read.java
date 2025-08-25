package learning.baeldung.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;

public class File02_Read {

    public static void main(String[] args) throws IOException {
    
        // read from InputStream
    try (BufferedReader br = new BufferedReader
                                    (new FileReader("src\\test\\java\\resources\\readFile.txt")))
    {
        System.out.println(br.readLine());
    }   


    // path class
    
}
}
