package Day3;
import java.util.*;
import java.io.*;
class Edge{
	public final int fromNode;
	public final int toNode;
	private  Edge(int fromNode,int toNode) {
		this.fromNode=fromNode;
		this.toNode=toNode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fromNode, toNode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		return fromNode == other.fromNode && toNode == other.toNode;
	}
	
	@Override
	public String toString() {
		return "From node=" + this.fromNode + " To node:" + this.toNode ;
	}
	
	public static Edge createEdge(int fromNode,int toNode) {
		return new Edge(fromNode,toNode);
	}
}
public class Activity25 {

public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//PrintWriter out = new PrintWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


String[] arr;

int numberOfQueries = Integer.parseInt(br.readLine().trim());


StringBuilder sb = new StringBuilder();

HashSet<Edge> set = new HashSet<>();


for (int i = 1; i <= numberOfQueries; i++) {

arr = br.readLine().trim().split(" ");

int u = Integer.parseInt(arr[0]);

int v = Integer.parseInt(arr[1]);

Edge edge = Edge.createEdge(u, v);

if (set.contains(edge)) {

continue;

}

set.add(edge);

sb.append(edge.toString()).append("\n");

}


System.out.println(set.size());

System.out.println(sb);


System.out.flush();

System.out.close();

}

}
