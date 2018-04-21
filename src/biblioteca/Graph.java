package biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Graph {

	List<Vertice> vertices;
	List<Aresta> arestas;

	public Graph() {
		vertices = new ArrayList<Vertice>();
		arestas = new ArrayList<Aresta>();
	}

	Vertice addVertice(String nome) {
		Vertice v = new Vertice(nome);
		vertices.add(v);
		return v;
	}

	Aresta addAresta(Vertice origem, Vertice destino) {
		Aresta e = new Aresta(origem, destino);
		origem.addAdj(e);
		arestas.add(e);
		return e;
	}

	public String toString() {
		String saida = "";
		for (Vertice x : vertices) {
			saida += x.nome + " -> ";
			for (Aresta e : x.adj) {
				Vertice v = e.destino;
				saida += v.nome + " ";
			}
			saida += "\n";
		}
		return saida;
	}
}

