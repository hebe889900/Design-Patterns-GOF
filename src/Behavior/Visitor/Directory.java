package Behavior.Visitor;


public class Directory extends Node {

	public Directory(String string) {
		// TODO Auto-generated constructor stub
	}

	public Directory(String string, Directory root) {
		// TODO Auto-generated constructor stub
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	 public void accept(Visitor v){
		 v.visit(this);
		 } 

}
