package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   for (Node node : nodes) {
		   checkName(node, p, node.name);
	   }   
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   for (Edge edge : edgeList) {
		   checkName(edge, p, edge.name);
	   }   
      // other implementation
      return null;
   }

   private <E> void checkName(E object, String p, String name)
   {
	   if(name.contains(p))
	   {
		   System.out.println(object);
	   }
   }
   
   
   //This alternative to the implemented solution might be closer to what you're looking for, but I felt
   //that this wasn't quite right. The other alterative would have been making a superclass or something 
   //similar, but I again felt that that would be against the idea of simply extracting a method.
   /*private <E> void checkAll(List<E> list, String p) {
	   for(E e: list) {
		   if(e instanceof Node && ((Node) e).contains(p))
			   System.out.println(e);
		   else if(e instanceof Edge && ((Edge) e).contains(p))
			   System.out.println(e);
	   }
   }*/
   
   
}

class Node{
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge{
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}
