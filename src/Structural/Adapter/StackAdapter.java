package Structural.Adapter;

import java.util.Vector;

class StackAdapter extends Vector implements Stack {
	 StackAdapter(){
	 super();
	 }
	 public void push(Object o){
	 insertElementAt(o, size());
	 }
	 public Object pop(){
	 Object o = elementAt(size()-1);
	 removeElementAt(size()-1);
	 return o;
	 }
	 public int nrElements(){
	 return size();
	 }
	}
