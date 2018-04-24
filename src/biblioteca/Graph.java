package biblioteca;

public interface Graph {
	public void addEdge(Integer source, Integer sink);
	public String graphRepresentation(RepresentationType type);
	public Integer getEdgeNumber();
	public Integer getVertexNumber();
	
}
