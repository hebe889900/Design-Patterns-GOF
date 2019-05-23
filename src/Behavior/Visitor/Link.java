package Behavior.Visitor;

public class Link extends Node {

	public Link(String string, Directory usr, Directory root) {
		// TODO Auto-generated constructor stub
	}

	public Link(String string, Link link, Directory root) {
		// TODO Auto-generated constructor stub
	}

	 public void accept(Visitor v){
		 v.visit(this);
		 } 
}
