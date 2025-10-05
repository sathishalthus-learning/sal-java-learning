package learning.dev._17_io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class b_AccesingResources {
    public static void main(String[] args) {
        // File Class
        File file = new File("src\\test\\java\\resources\\commonsFile.txt");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        // Path Interface
        Path path = Paths.get("src\\test\\java\\resources\\commonsFile.txt");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
        System.out.format("%s%n", path.toUri());
    }
}
