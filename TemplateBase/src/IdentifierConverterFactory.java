import java.util.Map;

public class IdentifierConverterFactory extends GenericFactory<String, Integer> {
    public IdentifierConverterFactory(final Map<String, Integer> registeredKeyValueMap) {
        super(registeredKeyValueMap);
    }
}
