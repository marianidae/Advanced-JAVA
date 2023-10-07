package DefiningClasses.CarSalesman_05;

import java.util.HashMap;
import java.util.Map;

public class EngineRepository {
    private final Map<String, Engine> engines = new HashMap<>();

    public void add(Engine engine) {
        engines.put(engine.getModel(), engine);
    }

    public Engine get(String model) {
        return engines.get(model);
    }
}
