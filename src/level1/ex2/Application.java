package level1.ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Application {
    public void play() {
        listDirectory(Input.askDir("Enter the path you want to sort."), "");
    }

    public static void listDirectory(File dir, String tab) {
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("The path is not a valid directory: " + dir);
            return;
        }

        File[] files = dir.listFiles();

        if (files != null) {
            Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

            for (File file : files) {
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                        .format(new Date(file.lastModified()));

                System.out.printf("%s[%s] %s (Last modified: %s)%n", tab, type, file.getName(), lastModified);

                if (file.isDirectory()) {
                    listDirectory(file.getAbsoluteFile(), tab + "  ");
                }
            }
        }
    }
}
