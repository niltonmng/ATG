package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ListAdj implements Graph {
	
	private static final String TYPE = "MA";
	private static final String NEW_LINE = System.lineSeparator();
	
	private List<Integer>[] graph;
	private Integer edgeNumber;
	private Integer vertexNumber;
	
	public ListAdj(int size) {
		this.graph = (ArrayList<Integer >[]) new ArrayList[size+1];
		this.initializeGraph();
		this.vertexNumber = size;
		this.edgeNumber = 0;
	}
	
	@Override
	public void addEdge(Integer source, Integer sink) {
		this.graph[source].add(sink);
		this.graph[sink].add(source);
		this.edgeNumber++;
		
	}

	@Override
	public String graphRepresentation() {
		int size = this.graph.length;
		
		String graphRepresentation = "";
		for (int i = 1; i < size; i++) {
			graphRepresentation += i + " -";
			for (Integer vertex : this.graph[i]) {
				graphRepresentation += " " + vertex;
			}
			graphRepresentation += NEW_LINE;
		}
	
		return graphRepresentation;
	}
	
	private void initializeGraph() {
		for (int i = 0; i < this.graph.length; i++) {
			this.graph[i] = new ArrayList<Integer>();
		}
	}
	
	@Override
	public Integer getEdgeNumber() {
		return this.edgeNumber;
	}

	@Override
	public Integer getVertexNumber() {
		return this.vertexNumber;
	}
	
	public String getType() {
		return TYPE;
	}

}
