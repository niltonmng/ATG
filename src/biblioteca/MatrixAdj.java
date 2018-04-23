package biblioteca;

import java.util.ArrayList;

public class MatrixAdj implements Graph {

	private static final String TYPE = "MA";
	private static final String NEW_LINE = System.lineSeparator();

	private Integer[][] graph;
	private Integer edgeNumber;
	private Integer vertexNumber;

	public MatrixAdj(int size) {
		this.graph = new Integer[size + 1][size + 1];
		this.initializeGraph();
		this.vertexNumber = size;
		this.edgeNumber = 0;
	}

	@Override
	public void addEdge(Integer source, Integer sink) {
		this.graph[source][sink] = 1;
		this.graph[sink][source] = 1;
		this.edgeNumber++;
	}

	public Integer getEdgeNumber() {
		return edgeNumber;
	}

	public Integer getVertexNumber() {
		return vertexNumber;
	}

	public String getType() {
		return TYPE;
	}
	
	private void initializeGraph() {
		int size = this.graph.length;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				this.graph[i][j] = 0;
			}
		}
	}
	
	@Override
	public String graphRepresentation() {
		int size = this.graph.length;

		String graphRepresentation = "";
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0 && j == 0) {
					graphRepresentation += " ";
				} else if (i == 0) {
					graphRepresentation += " " + j;
				} else if (j == 0) {
					graphRepresentation += i;
				} else {
					graphRepresentation += " " + graph[i][j];
				}
			}
			graphRepresentation += NEW_LINE;
		}

		return graphRepresentation;
	}

}
