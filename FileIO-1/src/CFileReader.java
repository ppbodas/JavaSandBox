import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CFileReader {
    BufferedReader br;

    CFileReader(String fileName) {
        try {
            br = new BufferedReader(new java.io.FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.printf("Exception reading file %s", e.getMessage());
        }
    }


    String realNextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            System.out.printf("Exception while reading file Line %s", e.getMessage());
        }
        return "";
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
