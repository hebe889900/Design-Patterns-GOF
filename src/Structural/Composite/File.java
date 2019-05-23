package Structural.Composite;

import java.util.Vector;

class File extends Node {
	 private String _contents;

	 File(String n, Directory p, String c){
	 super(n,p); _contents = c;
	 }
	 public Vector find(String s){
	 Vector result = new Vector();
	 if (getName().indexOf(s) != -1){
	// s is found
	 result.add(getAbsoluteName());
	 }
	 return result;
	 }
	}
