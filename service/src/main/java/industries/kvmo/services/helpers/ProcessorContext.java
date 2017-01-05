package industries.kvmo.services.helpers;

import java.util.concurrent.ConcurrentHashMap;

/**
 * A processor context to be passed around by the system
 */
public class ProcessorContext {

    private final ConcurrentHashMap<String, Object> properties = new ConcurrentHashMap<>();

    public ProcessorContext() {
    }

    public Object get(String key) {
        return properties.get(key);
    }

    public void set(String key, Object object) {
        properties.put(key, object);
    }

    public void remove(String key) {
        properties.remove(key);
    }
}
