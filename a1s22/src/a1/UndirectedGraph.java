package a1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UndirectedGraph<T extends Comparable<T>> extends Graph<T> {

	private Map<T, Set<T>> graph;
	// the following class variable will be used by
	// UndiretedGraphAlgorithms class
	private Map<T, Boolean> visited;
	
	public UndirectedGraph() {
		this.graph = new HashMap<>();
		this.visited = new HashMap<>();
	}
	
	public boolean isEmpty() {
		// TASK 1: Complete this method
		// Hint: An empty graph contains zero vertices
		return graph.isEmpty();
	}

	public int getSize() {
		// TASK 2: compute the size (number of vertices)
		return graph.size();
	}
	
	public void addVertex(T vertex) throws VertexExistsException {
		// TASK 3: Complete this method
		// Hint: A new vertex is by default not visited.
		if(graph.containsKey(vertex)) {
			throw new VertexExistsException("already exists");
		}
		else graph.put(vertex, new HashSet<>());
		visited.put(vertex, false);

	}
	
	public List<T> getAdjacent(T vertex) {
		return new ArrayList<>(graph.get(vertex));
	}

	public void addEdge(T fromVertex, T toVertex) {
		// TASK 4: Complete this method
		// Hint: Recall, both vertices already exist. Also,
		//       our graphs are not oriented, hence both edges
		//       need to be added.
	graph.get(toVertex).add(fromVertex);
	graph.get(fromVertex).add(toVertex);
	}
	
	@Override
	public void reset() {
		// TASK 5: This method resets values
		// of visited map to false
		for(T vertex : graph.keySet()) {
			visited.put(vertex, false);
		}
	}

	@Override
	public String toString() {
		// TASK 6: Override toString() method
		// note: for an empty graph, just return an empty string.

		// NOTE: as of Jun 12, 2023, the implementation of this method is no longer a requirement.
		// It won't be graded.
		// however, you can still implement it (perhaps return set of vertices and edges)
		// as a way to self-validate your work
		StringBuilder builder = new StringBuilder();
		 
        for (T v : graph.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : graph.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
 
        return (builder.toString());
	}

	@Override
	public List<T> getVertices() {
		return graph.keySet().stream()
                .collect(Collectors.toList());
	}

	@Override
	public List<T> getVisited() {
		// TASK 7-0: code this method
		List<T> vis = new ArrayList<T>();
		  for(T v  : visited.keySet()) {
			  if(visited.get(v)==true) {
				  vis.add(v);
			  }
		  }
		  return vis;
	
	}

	@Override
	public void setVisited(T vertex) {
		// TASK 7-1: code this method
		// you may assume vertex T exists in the graph
		visited.put(vertex, true);
	}

}
