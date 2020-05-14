import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        IdentifierConverterFactory identifierConverterFactory = new IdentifierConverterFactory(new HashMap<>());
        identifierConverterFactory.register("Prathmesh", 100);

        System.out.println("Value = " + identifierConverterFactory.get("Prathmesh"));
    }
}
