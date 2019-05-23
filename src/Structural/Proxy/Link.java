package Structural.Proxy;

import java.util.Vector;

class Link extends Node {
	 private Node _realNode;
	//either file or directory
	 Link(String n, Node w, Directory p){
	 super(n,p); _realNode = w;
	 }

	public Link(String n, Directory usr, Directory root) {
		// TODO Auto-generated constructor stub
		super(n,root);
	}

	public String getAbsoluteName(){
	 return super.getAbsoluteName() + "@";
	 } 
	 public Vector find(String s){
		 Vector result = new Vector();
		 if (getName().indexOf(s) != -1){
		 result.add(getAbsoluteName());
		 }

		Vector resultsViaLink = _realNode.find(s);
		 String realNodePath = _realNode.getAbsoluteName();
		 int n = realNodePath.length();
		 for (int t=0; t < resultsViaLink.size(); t++){
		 String r = (String)resultsViaLink.elementAt(t);
		 String rr = super.getAbsoluteName() + "/" +
		 r.substring(n);
		 result.add(rr);
		 }
		 return result;
		 }	 
}