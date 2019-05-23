package Behavior.Iterator;

import java.util.Vector;

class Directory extends Node {

	 public Directory(String n, Structural.Proxy.Directory p) {
		super(n, p);
		// TODO Auto-generated constructor stub
	}
	public Vector _children;
	public Iterator iterator(){
	 return new DirectoryIterator(this);
	 }
	 // use a private inner class because:
	 // - it is not visible outside the class
	 // - its methods have access to Directory¡¯s
	 // private field _children
	 private class DirectoryIterator implements Iterator {
	 private Vector _files;
	 private int _fileCnt;
	 DirectoryIterator(Directory d){
	 _files = d._children;
	 _fileCnt = 0;
	 }

	 public void first(){
		 _fileCnt = 0;
		 }
		 public void next(){
		 _fileCnt++;
		 }
		 public boolean isDone(){
		 return _fileCnt == _files.size();
		 }
		 public Object current(){
		 return _files.elementAt(_fileCnt);
		 }
		 }
		}