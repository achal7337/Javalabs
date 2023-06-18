package a1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class UndirectedGraphAlgorithms<T extends Comparable<T>> 
								implements GraphAlgorithms<T> {

	@Override
	public List<T> DFS(Graph<T> g, T initial) {
		// TASK 8: Implement this method.
		// Your implementation must be iterative.
		// Please use the algorithm found here:
		// https://en.wikipedia.org/wiki/Depth-first_search
		List<T> visited = new ArrayList<>();
		Stack<T>  stack = new Stack<>();
		stack.push(initial);
		while  (!stack.isEmpty()) {
			T vertex = stack.pop();
			if (!visited.contains(vertex)) {
				visited.add(vertex);
				List<T> surr = g.getAdjacent(vertex);
				for(T surr1 :  surr) {
					if(!visited.contains(surr1)) {
						stack.push(surr1);
					}
				}
			}
		}
		return visited;
	}


	@Override
	public boolean isConnected(Graph<T> g) {
		// TASK 9: Implement this method.
		// You must make meaningful use of the
		// visited variable of the UndirectedGraph
		// class and the DFS method above.
		// Hint: suppose we run a DFS from a random vertex
		// of the graph. What happens to the values of
		// visited map if the graph is connected?
		if(g.isEmpty()) {
			return true;
		}
		T initial = g.getVertices().get(0);
		List<T> visited = DFS(g,initial);
		return visited.size()==g.getSize();
	}



}
