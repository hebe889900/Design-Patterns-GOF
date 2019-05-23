package Behavior.Visitor;


interface Visitor {
	 public void visit(File f);
	 public void visit(Directory d);
	 public void visit(Link l);
	}