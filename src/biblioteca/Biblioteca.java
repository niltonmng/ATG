package biblioteca;

public class Biblioteca implements IPratica1 {
	
	private Graph grafo;
	
	public Biblioteca(){
		grafo = new Graph();
	}

	@Override
	public boolean readGraph(String path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readWightedGraph(String path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getVertexNumber(Graph graph) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEdgeNumber(Graph graph) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMeanEdge(Graph graph) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String graphRepresentation(Graph graph, String type) {
		if(type == "AL") {
			return grafo.toString();
		}
		else {
			throw new RuntimeException("Fazer esta representacao!");
		}
	}

	@Override
	public String BFS(Graph graph, Vertice v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DFS(Graph graph, Vertice v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SCC(Graph graph) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shortestPath(Vertice v1, Vertice v2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mst(Graph graph) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void main(String[] args) {
		
	     Biblioteca b = new Biblioteca();
	     
	     Vertice s = b.grafo.addVertice("s");
	     Vertice t = b.grafo.addVertice("t");
	     Vertice y = b.grafo.addVertice("y");
	     Aresta st = b.grafo.addAresta(s, t);
	     Aresta sy = b.grafo.addAresta(s, y);
	     Aresta ty = b.grafo.addAresta(t, y);
	     Aresta yt = b.grafo.addAresta(y, t);
	     
	     System.out.println(b.graphRepresentation(b.grafo, "AL"));
	 }

}
