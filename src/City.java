import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<String, Integer> connections;

    public City(String name) {
        this.name = name;
        this.connections = new HashMap<>();
    }

    public City(String name, Map<String, Integer> connections) {
        this.name = name;
        this.connections = connections;
    }

    public void addConnection(City destination, int cost) {
        this.connections.put(destination.name, cost);
        destination.connections.put(this.name, cost);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.name + ": (");
        for (Map.Entry<String, Integer> way : this.connections.entrySet()) {
            result.append(way.getKey()).append(": ").append(way.getValue()).append(", ");
        }
        if (!this.connections.isEmpty()) {
            result.delete(result.length() - 2, result.length()); // Удаляем последнюю запятую
        }
        result.append(")");
        return result.toString();
    }
}