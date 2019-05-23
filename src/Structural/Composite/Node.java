package Structural.Composite;

import java.util.Vector;

abstract class Node {
	 Node(String n, Directory p){
	 _name = n; _parent = p;
	 if (_parent != null){ p.add(this); }
	 }
	 public String getName(){ return _name; }
	 public String getAbsoluteName(){
	 if (_parent != null){
	 return _parent.getAbsoluteName() + getName();
	 }
	 return getName();
	 }
	 public abstract Vector find(String s);
	 protected String _name;
	 protected Directory _parent;
	}