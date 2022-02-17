import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter string");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final String s = br.readLine();

        System.out.println("Input String:" + s);
    }
}
