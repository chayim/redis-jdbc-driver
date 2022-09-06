package jdbc.client.structures.result;

import java.util.Map;

public class RedisMapResult implements RedisResult {

    private final String type;
    private final Map<String, Object> result;

    public RedisMapResult(String type, Map<String, Object> result) {
        this.type = type;
        this.result = result;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Map<String, Object> getResult() {
        return result;
    }
}
