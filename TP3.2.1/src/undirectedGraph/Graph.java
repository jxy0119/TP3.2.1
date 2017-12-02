package undirectedGraph;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
	private int nodeCount;
	private int edgeCount;
	private List<Integer>[] adj;
	
	public Graph(String filePath) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(filePath),
				StandardCharsets.UTF_8);
		nodeCount = getNodeCountOfGraphFromFileContent(lines);
		adj = new ArrayList[nodeCount];
		addEdgesToGraph(adj, lines);
	}

	public int getNodeCountOfGraphFromFileContent(List<String> lines) {
		Set<String> set = new HashSet<String>();
		for (String line : lines) {
			String[] nodesNumber = line.split(" ");
			for (String nodeNumber : nodesNumber) {
				set.add(nodeNumber);
			}
		}
		return set.size();
	}
	
	private void addEdgesToGraph(List<Integer>[] adj, List<String> lines) {
		for (String line : lines) {
			String[] nodesNumber = line.split(" ");
			int node1Index = Integer.parseInt(nodesNumber[0]);
			int node2Index = Integer.parseInt(nodesNumber[1]);
			addEdgeToNode(node1Index, node2Index);
			//addEdgeToNode(node2Index, node1Index); //Commented when it¡¯s a directed graph as input. We could activate this line via a flag/boolean value.
		}
	}

	public void addEdgeToNode(int node1Index, int node2Index) {
		List<Integer> edges = adj[node1Index];
		if (edges == null) {
			edges = new ArrayList<Integer>();
		}
		edges.add(node2Index);
		adj[node1Index] = edges;
	}
	
	public void print() {
		for(int i=1;i<4;i++){
		System.out.println(i+"->"+adj[i]);
		}
	}
	public void degree(){
	    
	}
	public void Neighbors(){
	   
	}
}
