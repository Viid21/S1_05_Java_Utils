package level1.ex3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ResourceInteractor {
    public static void writeLine(String filePath, String docName, String line) throws IOException {
        Path dir = Path.of(filePath);
        Path file = dir.resolve(docName + ".txt");

        Files.createDirectories(dir);

        Files.writeString(
                file,
                line,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

}
