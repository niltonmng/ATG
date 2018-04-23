package biblioteca;

public class Biblioteca implements IPratica1 {
	
	@Override
	public boolean readGraph(String path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readWeightedGraph(String path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getVertexNumber(Graph graph) {
		return graph.getVertexNumber();
	}

	@Override
	public int getEdgeNumber(Graph graph) {
		return graph.getEdgeNumber();
	}

	@Override
	public float getMeanEdge(Graph graph) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String graphRepresentation(Graph graph, String type) {
		return graph.graphRepresentation();
	}

	@Override
	public String BFS(Graph graph, Integer v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DFS(Graph graph, Integer v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SCC(Graph graph) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shortestPath(Integer v1, Integer v2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mst(Graph graph) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void main(String[] args) {
		 System.out.println("#### Lista de Adjacencia ####");
		 System.out.println();
		 
		 Graph list = new ListAdj(5);
		 
		 list.addEdge(1, 2);
		 list.addEdge(2, 5);
		 list.addEdge(5, 3);
		 list.addEdge(4, 5);
		 list.addEdge(1, 5);
		 
		 System.out.println(list.getVertexNumber());
		 System.out.println(list.getEdgeNumber());
		 System.out.println(list.graphRepresentation());   
		 
		 System.out.println();
		 System.out.println("#####################");
		 System.out.println();
		 
		 System.out.println("#### Matriz de Adjacencia ####");
		 System.out.println();
		 
		 Graph matrix = new MatrixAdj(5);
		 
		 matrix.addEdge(1, 2);
		 matrix.addEdge(2, 5);
		 matrix.addEdge(5, 3);
		 matrix.addEdge(4, 5);
		 matrix.addEdge(1, 5);
		 
		 System.out.println(matrix.getVertexNumber());
		 System.out.println(matrix.getEdgeNumber());
		 System.out.println(matrix.graphRepresentation()); 
		 
	}

}
