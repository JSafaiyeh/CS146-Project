package CS146;

import java.util.HashMap;
import java.util.Map;

/**
 * Node that represents a location with a name and coordinates.
 */
public class Node {
    private String locationName;
    private double latitude;
    private double longitude;
    private Map<Node, Double> edges;
    private Node path;
    private boolean visited;
    private double distance;

    /**
     * Constructor of the Node
     * @param locationName the name of the location
     * @param latitude the latitude of the location
     * @param longitude the longitude of the location
     */
    public Node(String locationName, double latitude, double longitude) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        edges = new HashMap<>();
    	path = this;
    	visited = false;
    	distance = Double.POSITIVE_INFINITY;
    }

    /**
     * Adds a two way edge linked to the current Node.
     * @param node
     */
    public void addEdge(Node node) {
        edges.put(node, distanceFrom(node));
        
        if(!node.edges.keySet().contains(this))
        	node.addEdge(this);
    }

    /**
     * @return the name of the location
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * @return the latitude of the location
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude of the location
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Calculates the distance away from each node.
     * Haversine formula
     * @param node
     * @return distance in miles
     */
    private double distanceFrom(Node node) {
        final double R = 3959.87433; //Radius of earth

        double latitudeDifference = Math.toRadians(node.getLatitude() - this.latitude);
        double longitudeDifference = Math.toRadians(node.getLongitude() - this.longitude);

        double latitude1 = Math.toRadians(this.latitude);
        double latitude2 = Math.toRadians(node.getLatitude());
        //double latitude2 = Math.toRadians(this.longitude);

        double a = Math.pow(Math.sin(latitudeDifference / 2), 2)
                + Math.pow(Math.sin(longitudeDifference / 2), 2)
                * Math.cos(latitude1)
                * Math.cos(latitude2);

        double c = 2 * Math.asin(Math.sqrt(a));

        return R * c;
    }
    
    /**
     * Get map of edges associated with the Node.
     * @return map of edges
     */
	public Map<Node, Double> getEdges() {
		return edges;
	}

    /**
     * Returns the path of the node
     * @return
     */
	public Node getPath() {
		return path;
	}

    /**
     * Adds the Node to the path
     * @param N
     */
	public void addNodeToPath(Node N){
		path = N;
	}

    /**
     * Set the distance of the node
     * @param d
     */
	public void setDistance(double d){
		distance = d;
	}

    /**
     * Gets the distance of the node
     * @return
     */
	public double getDistanceFromS(){
		return distance;
	}

    /**
     * Resets the path of to the node
     */
	public void reset(){
		path = this;
		visited = false;
		distance = Double.POSITIVE_INFINITY;
	}
}