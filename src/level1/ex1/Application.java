package level1.ex1;

import java.io.File;
import java.util.Arrays;

public class Application {
    public void play() {
        File dir = Input.askDir("Enter the path you want to sort.");
        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Could not list directory.");
            return;
        }

        Arrays.sort(files);

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
