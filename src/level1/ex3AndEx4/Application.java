package level1.ex3AndEx4;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Application {
    public void play() {
        File dir = Input.askDir("Enter the path you want to sort.");
        File outputFile = new File("directory_output.txt");

        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            listDirectory(dir, "", pw);
            System.out.println("Directory listing saved to: " + outputFile.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void listDirectory(File dir, String tab, PrintWriter pw) {
        if (!dir.exists() || !dir.isDirectory()) {
            pw.println("The path is not a valid directory: " + dir);
            return;
        }

        File[] files = dir.listFiles();

        if (files != null) {
            Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

            for (File file : files) {
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                        .format(new Date(file.lastModified()));

                pw.printf("%s[%s] %s (Last modified: %s)%n", tab, type, file.getName(), lastModified);

                if (file.isDirectory()) {
                    listDirectory(file.getAbsoluteFile(), tab + "  ", pw);
                }
            }
        }
    }
}