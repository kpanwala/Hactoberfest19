// Java Program to demonstrate adjacency list 
// representation of graphs 
import java.util.LinkedList; 
class Graph 
{ 
		int V; 
		LinkedList<Integer> adjListArray[]; 
		
		// constructor 
		public Graph(int V) 
		{ 
			this.V = V; 
			
			// define the size of array as 
			// number of vertices 
			adjListArray = new LinkedList[V]; 
			
			// Create a new list for each vertex 
			// such that adjacent nodes can be stored 
			for(int i = 0; i < V ; i++){ 
				adjListArray[i] = new LinkedList<>(); 
			} 
		} 

        
	static void addEdge(Graph graph, int src, int dest) 
	{ 
		// Add an edge from src to dest. 
		graph.adjListArray[src].add(dest); 
		
		// Since graph is undirected, add an edge from dest 
		// to src also 
		graph.adjListArray[dest].add(src); 
	} 
	
	// A utility function to print the adjacency list 
	// representation of graph 
	static void printGraph(Graph graph) 
	{	 
		for(int v = 0; v < graph.V; v++) 
		{ 
			System.out.println("Adjacency list of vertex "+ v); 
			System.out.print("head"); 
			for(Integer pCrawl: graph.adjListArray[v]){ 
				System.out.print(" -> "+pCrawl); 
			} 
			System.out.println("\n"); 
		} 
	}
}

class GFG 
{ 
	public static void main(String args[]) 
	{ 
		// create the graph given in above figure 
		int V = 5; 
		Graph graph = new Graph(V); 
		graph.addEdge(graph, 0, 1); 
		graph.addEdge(graph, 0, 4); 
		graph.addEdge(graph, 1, 2); 
		graph.addEdge(graph, 1, 3); 
		graph.addEdge(graph, 1, 4); 
		graph.addEdge(graph, 2, 3); 
		graph.addEdge(graph, 3, 4); 
	
		// print the adjacency list representation of 
		// the above graph 
		graph.printGraph(graph); 
	} 
} 
// This code is contributed by Sumit Ghosh 
