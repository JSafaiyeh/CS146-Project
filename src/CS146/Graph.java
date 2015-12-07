package CS146;

import java.util.*;

/**
 * Represents a graph of locations
 * ArrayList of Nodes
 */
public class Graph {

    private ArrayList<Node> vertices;
    private Node sourceNode;
    private Node destinationNode;

    /**
     * Constructor
     */
    public Graph() {
        vertices = new ArrayList<>();
    }

    /**
     * Dijkstra's algorithm.
     * Worse Case: O(E + VlogV)
     * @param source the starting point
     * @param destination the ending point
     * @return a list of strings that represent the path
     */
    public List<String> shortestpath(Node source, Node destination) {
    	sourceNode = source;
    	destinationNode = destination;
    	
    	// reset nodes
		for (int i = 0; i < vertices.size(); i++)
			vertices.get(i).reset();
		
		// start a queue to keep track of nodes that need to be checked
		Queue<Node> q = new LinkedList<Node>();
		//q.add(sourceNode);
		
		// set sourceNode distance to 0
		sourceNode.setDistance(0);
		
		// add sourceNode to queue
		q.add(sourceNode);
		
		while(!q.isEmpty())
		{
			// pop a node off the queue to check if surrounding vertices have been visited
			Node v = q.remove();
			for(Map.Entry<Node, Double> edge: v.getEdges().entrySet())
			{
				Node w = edge.getKey();
				if(w.getDistanceFromS() == Double.POSITIVE_INFINITY)
				{
					double cvw = edge.getValue(); // all v-w distances have been calculated in node class
					if(v.getDistanceFromS() + cvw < w.getDistanceFromS()) // if v.distance (distance from source to v) + cost to go to next node is < distance from source to w node 
					{
						// update w node to reflect the shorter distance
						w.setDistance(v.getDistanceFromS() + cvw);
						// add 
						w.addNodeToPath(v);
						q.add(w);
					}
				}
			}	
		}
		
		List<String> result = new LinkedList<String>();
		result.add(destinationNode.getLocationName());
		Node tmp = destinationNode;
		while(tmp!=sourceNode)
		{
			result.add(tmp.getPath().getLocationName());
			tmp = tmp.getPath();
		}
        
        return result;
    }

    /**
     * Return the array list of vertices
     * @return
     */
	public ArrayList<Node> getVertices() {
		return vertices;
	}

    /**
     * Adds a vertice to the graph.
     * @param node
     */
    public void addVertice(Node node) {
        vertices.add(node);
    }
}