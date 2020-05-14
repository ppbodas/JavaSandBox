import java.util.Map;

public abstract class GenericFactory<K, V> {
    private Map<K,V> registeredKeyValueMap;

    GenericFactory(final Map<K, V> registeredKeyValueMap) {
        this.registeredKeyValueMap = registeredKeyValueMap;
    }

    public void register(final K type, final V value) {
        registeredKeyValueMap.put(type, value);
    }

    public V get(final K key) {
        return registeredKeyValueMap.get(key);
    }
}
