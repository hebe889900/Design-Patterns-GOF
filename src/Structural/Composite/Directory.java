package Structural.Composite;

import java.util.Vector;

class Directory extends Node {
	 private Vector _children;
	 Directory(String n){ this(n, null); }
	 Directory(String n, Directory p){
	 super(n,p);
	 _children = new Vector();
	 }
	 public String getAbsoluteName(){
	 return super.getAbsoluteName() + "/";
	 }
	 public void add(Node n){
	 _children.addElement(n);
	 } 
	 public Vector find(String s){
		 Vector result = new Vector();
		 if (getName().indexOf(s) != -1){
		 result.add(getAbsoluteName());
		 }
		 for (int t=0; t < _children.size(); t++){
		 Node child = (Node)_children.elementAt(t);
		 result.addAll(child.find(s));
		 }
		 return result;
		 }
		}
