package Behavior.Visitor;

public class File extends Node {

	public File(String string, Directory root, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public void accept(Visitor v){
		 v.visit(this);
		 } 	

}
