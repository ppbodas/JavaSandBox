import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CFileWriter {
    BufferedWriter br;

    CFileWriter(String fileName, boolean append) {
        try {
            br = new BufferedWriter(new FileWriter(fileName, append));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeLine(String line) {
        try {
            br.write(line + '\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void close() {
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
