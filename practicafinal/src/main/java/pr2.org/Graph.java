package pr2.org;

import java.lang.NullPointerException;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class Graph<V>{
        private Map<V, Set<V>> adjacencyList = new HashMap<>();

	List<Integer> conjunto = new ArrayList<>();
	private final int infinito = 2147483647;


	public boolean addVertex(V v){
		if(adjacencyList.containsKey(v)){ return false;
		}else
			adjacencyList.put(v, new HashSet<V>());
		return true;
	}


	public boolean addEdge(V v1, V v2){
		if(!adjacencyList.get(v1).contains(v2) && !adjacencyList.get(v2).contains(v1)){
			adjacencyList.get(v1).add(v2);
			adjacencyList.get(v2).add(v1);
			return true;
		}else return false;
	}

	public Set<V> obtainAdjacents(V v) throws Exception{
		return adjacencyList.get(v);
	}

	public boolean containsVertex(V v){
		return adjacencyList.keySet().contains(v);
	}


	@Override
	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		for(V v: adjacencyList.keySet()){
			mensaje.append(v.toString() + ": ");
			for(V conect: adjacencyList.get(v)){
				mensaje.append(conect.toString() + " ");
			}
		}
		return mensaje.toString();
	}

	public List<Integer> shortestPath(V v1, V v2) throws Exception {
		int menor = infinito;
		int Vmin = 0;
		int[] distancia = new int[adjacencyList.size()];
		int[] ant = new int[adjacencyList.size()];
		inicializar(distancia, ant, v1);

		while (!conjunto.contains((int) v2)) {
			menor = infinito;

			for (int i = 0; i < distancia.length; i++) {
				if(distancia[i]<menor&&!conjunto.contains(i+1) ){
					menor = distancia[i];
					Vmin = i+1;
				}
			}
			conjunto.add(Vmin);
			for(V i: adjacencyList.get(Vmin)){
				if (menor<distancia[(int) i-1]){
					distancia[(int) i-1] = menor + 1;
					ant[(int)i-1] = Vmin;
				}
			}
		}
		System.out.println("---------");
		return construirCamino(ant,(int) v1,(int) v2);
	}


	public List<Integer> construirCamino(int[] ant, int a, int b){
		if(a == b){
			return new ArrayList<>(Arrays.asList(a));
		}else {
			List<Integer> l = construirCamino(ant, a, ant[b-1]);
			System.out.println(b);
			System.out.println(l.add(b));
			return l;
		}
	}
	
	public void inicializar(int[] distancia,int[] ant, V v1) throws Exception {
		conjunto.clear();
		conjunto.add((int) v1);
		for (int j = 0; j < adjacencyList.size(); j++) {

			ant[j] = (int) v1;
			distancia[j] = infinito;
		}
		for(V v: obtainAdjacents(v1)){
			distancia[(int) v - 1] = 1;
		}

	}

}
