package undirectedGraph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws IOException {
		Graph graph = new Graph("C:/Users/jxy01/Desktop/文件pdf/BDD/graph.txt");
		graph.print();
	}

}

/*public class Main {
   private static class Edge{
    	private int st;
    	private int en;
    	public Edge(int start,int end){
    	   this.st =start;	
    	   this.en =end;
    	}
    	public int hashCode(){
    		return (int)(Math.pow(2, st)*Math.pow(3, en));
    	}
    	public boolean equals(Object o){
    		if(!(o.getClass().equals(Edge.class))) return false;
    		Edge oe =(Edge)o;
    		return (oe.st==st)&&(oe.en==en);
    	}
    	
		
    }
    public static void main(String[] args){
		Set<Edge> edgeSet=new HashSet();
		edgeSet.add(new Edge(1,2));
		edgeSet.add(new Edge(1,3));
		edgeSet.add(new Edge(2,3));
		Edge a= new Edge(2,3);
		edgeSet.add(a);
		edgeSet.add(a);
		System.out.println(a);
		System.out.println(edgeSet.size());
	}
	public static void main_file(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	try(BufferedReader br= new BufferedReader(new FileReader("C:/Users/jxy01/Desktop/文件pdf/Algo/graph.txt"))){
		String line =br.readLine();
	
		while(line!=null){
	    	 String[] s=line.split(" ");
	    	 Integer st=Integer.parseInt(s[0]);
	    	 Integer en=Integer.parseInt(s[1]);
	    	 line=br.readLine();
	    	 System.out.println(st+"->"+en);
	     
		    }
		}
	}
	
}*/ 
     
	
