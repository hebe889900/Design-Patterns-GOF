package Structural.Proxy;

import java.util.Vector;

abstract class Node {
	 private String _name;
	private Directory _parent;
	Node(String n, Directory p){
	 _name = n; _parent = p;
	 if (_parent != null)
	 { p.add(this); }
	 }
	 public String getName(){ return _name; }
	 public String getAbsoluteName(){
	 if (_parent != null){
	 return _parent.getAbsoluteName() + getName();
	 }
	 return getName();
	 }
	public Vector find(String s) {
		// TODO Auto-generated method stub
		return null;
	} 
	 
}