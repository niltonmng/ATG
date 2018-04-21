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
		return graph.vertices.size();
	}

	@Override
	public int getEdgeNumber(Graph graph) {
		return graph.arestas.size();
	}

	@Override
	public float getMeanEdge(Graph graph) {
		float mean = 0;
		for (Aresta a : graph.arestas) {
			mean += a.peso;
		}
		mean = mean / this.getEdgeNumber(graph);
		
		return mean;
	}

	@Override
	public String graphRepresentation(Graph graph, String type) {
		if(type == "AL") {
			return graph.toString();
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
		
		
	     Graph grafo = new Graph();
	     
	     Vertice s = grafo.addVertice("s");
	     Vertice t = grafo.addVertice("t");
	     Vertice y = grafo.addVertice("y");
	     Aresta st = grafo.addAresta(s, t);
	     Aresta sy = grafo.addAresta(s, y);
	     Aresta ty = grafo.addAresta(t, y);
	     Aresta yt = grafo.addAresta(y, t);
	     
	     System.out.println(b.graphRepresentation(grafo, "AL"));
	 }

}
