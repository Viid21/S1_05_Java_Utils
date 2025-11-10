package level1.ex3AndEx4;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.play();

        File fileToRead = new File("directory_output.txt");
        FileReaderUtil.readFile(fileToRead);
    }
}
