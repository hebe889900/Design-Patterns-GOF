package Behavior.Iterator;

interface Iterator {
	 public void first(); // set to first
	 public void next(); // advance
	 public boolean isDone(); // is done
	 public Object current(); // get current
	}