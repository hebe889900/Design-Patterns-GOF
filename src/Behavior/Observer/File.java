package Behavior.Observer;

import java.util.Vector;

import Behavior.Iterator.Node;
import Structural.Proxy.Directory;

class File extends Node {
	 File(String n, Directory p, String c){
	 super(n,p);
	 _contents = c;
	 }
	 public void attach(Observer o){
	 if (!_observers.contains(o)){
	 _observers.add(o);
	 }
	 }
	 public void detach(Observer o){
	 _observers.remove(o);
	 }
	 public void notifyObservers(){
		 for (int t=0; t < _observers.size(); t++){
		 ((Observer)_observers.elementAt(t)).update();
		 }
		 }
		 public void write(String s){
		 _contents = s;
		 notifyObservers();
		 }

		 private String _contents;
		 private Vector _observers = new Vector();
		public String getAbsoluteName() {
			// TODO Auto-generated method stub
			return null;
		}
		}
