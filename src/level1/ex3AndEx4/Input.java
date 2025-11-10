package level1.ex3AndEx4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static File askDir(String message) {
        while (true) {
            System.out.println(message);
            File dir = new File(sc.next());
            try {
                if (!dir.isDirectory()) {
                    throw new IOException("The path provided is not a directory or does not exist.");
                }
                return dir;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
