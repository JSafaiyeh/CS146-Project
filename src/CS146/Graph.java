package CS146;

import sun.security.provider.certpath.Vertex;

import java.util.*;

/**
 * Represents a graph data structure.
 */
public class Graph {

    ArrayList<Node> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

    /**
     * Bellman-Ford algorithm. Calculates the distance the source is from all the nodes.
     * O(V * E), where V is the number of vertices and E is the number of edges
     * @param source the source
     * @return a map of the locations nd the distance from
     */
    public Map<String, Double> calculateBellmanFord(Node source) {
        Map<String, Double> result = new HashMap<>();
        for (Node node: vertices)
            result.put(node.getLocationName(), Double.POSITIVE_INFINITY);
        result.put(source.getLocationName(), 0.0);

        Map<String, Double> scratch = new HashMap<>();

        for (int k = 0; k < vertices.size(); ++k) {
            scratch.putAll(result);

            for (Node node: vertices) {
                for (Map.Entry<Node, Double> edge: node.getEdges().entrySet()) {

                    scratch.put(edge.getKey().getLocationName(),
                            Math.min(scratch.get(edge.getKey().getLocationName()),
                                    edge.getValue() + result.get(node.getLocationName())));
                }
            }


            Map<String, Double> temp = result;
            result = scratch;
            scratch = temp;
        }

        return result;
    }

	public ArrayList<Node> getVertice() {
		return vertices;
	}

    public void addVertice(Node node) {
        vertices.add(node);
    }
}
