package com.test.algorithem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphAdajancyListImpl {

	private Map<Vertex, List<Vertex>> adjVerticesMap;
	
	public GraphAdajancyListImpl() {
		this.adjVerticesMap = new HashMap<>();
	}
	
	void addVertex(String label) {
		adjVerticesMap.putIfAbsent(new Vertex(label), new ArrayList<>());
	}
	
	void removeVertex(String label) {
		Vertex v = new Vertex(label);
		adjVerticesMap.values().stream().forEach(list -> list.remove(v));
		adjVerticesMap.remove(v);
	}
	
	 void addEdge(String label1, String label2) {
	        Vertex v1 = new Vertex(label1);
	        Vertex v2 = new Vertex(label2);
	        adjVerticesMap.get(v1).add(v2);
	        adjVerticesMap.get(v2).add(v1);
	    }

	    void removeEdge(String label1, String label2) {
	        Vertex v1 = new Vertex(label1);
	        Vertex v2 = new Vertex(label2);
	        List<Vertex> eV1 = adjVerticesMap.get(v1);
	        List<Vertex> eV2 = adjVerticesMap.get(v2);
	        if (eV1 != null)
	            eV1.remove(v2);
	        if (eV2 != null)
	            eV2.remove(v1);
	    }

	    List<Vertex> getAdjVertices(String label) {
	        return adjVerticesMap.get(new Vertex(label));
	    }
	    
	    String print() {
	        StringBuffer sb = new StringBuffer();
	        for(Vertex v : adjVerticesMap.keySet()) {
	            sb.append(v);
	            sb.append(adjVerticesMap.get(v));
	        }
	        return sb.toString();
	    }
	    
	    static Set<String> depthFirstTraversal(GraphAdajancyListImpl graph, String root) {
	        Set<String> visited = new LinkedHashSet<String>();
	        Stack<String> stack = new Stack<String>();
	        stack.push(root);
	        while (!stack.isEmpty()) {
	            String vertex = stack.pop();
	            if (!visited.contains(vertex)) {
	                visited.add(vertex);
	                for (Vertex v : graph.getAdjVertices(vertex)) {              
	                    stack.push(v.label);
	                }
	            }
	        }
	        return visited;
	    }

	    static Set<String> breadthFirstTraversal(GraphAdajancyListImpl graph, String root) {
	        Set<String> visited = new LinkedHashSet<String>();
	        Queue<String> queue = new LinkedList<String>();
	        queue.add(root);
	        visited.add(root);
	        while (!queue.isEmpty()) {
	            String vertex = queue.poll();
	            for (Vertex v : graph.getAdjVertices(vertex)) {
	                if (!visited.contains(v.label)) {
	                    visited.add(v.label);
	                    queue.add(v.label);
	                }
	            }
	        }
	        return visited;
	    }
	    
	    
	    
	
	class Vertex{
		
		String label;
		Vertex(String label){
			this.label = label;
		}
		
		@Override
		public int hashCode() {
			int prime = 31;
			int result = 1;
			result = prime*result + ((label == null) ? 0 : label.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj == null)
				return false;
			
			if(obj == this)
				return true;
			
			if(getClass() != obj.getClass())
				return false;
			
			Vertex other = (Vertex)obj;
			if(label == null) {
				if(other.label != null) {
					return false;
				}
			}else if(label.equals(other.label)) {
				return false;
			}
			return true;
		}
		
		public String toString() {
			return label;
		}
	}
	
	
	public static void main(String[] args) {
		
		GraphAdajancyListImpl graph = new GraphAdajancyListImpl();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        
		
	}
	

}
