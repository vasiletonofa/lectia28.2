import java.util.HashMap;
import java.util.Map;

public class CustomHashMap<K, V> implements CustomMap<K, V> {

    private Map<K, V> map = new HashMap<>();

    @Override
    public V put(K key, V value) {
        return map.put(key, value);
    }

}
