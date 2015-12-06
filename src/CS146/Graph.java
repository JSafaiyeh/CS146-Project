package CS146;

import java.util.ArrayList;

/**
 * Represents a graph data structure.
 */
public class Graph {

    ArrayList<Node> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

    public void addVertice(Node node) {
        vertices.add(node);
    }

    /**
     * Algorithms to calculate shortest path
     */
    public void getPathBellmanFord() {

    }

    public void getPathDijkstrasWithList() {

    }

    public void getPathDijkstrasWithModifiedBinaryHeap() {

    }

    public void getPathDijkstrasWithModifiedFibonacciHeap() {

    }

    public void getPathGabows() {

    }

	public ArrayList<Node> getVertice() {
		return vertices;		
	}
}
