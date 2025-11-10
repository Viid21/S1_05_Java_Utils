package level1.ex3AndEx4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderUtil {
    public static void readFile(File file) {
        try (Scanner sc = new Scanner(file)) {
            System.out.println("Content of file: " + file.getAbsolutePath());
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found -> " + file.getAbsolutePath());
        }
    }
}