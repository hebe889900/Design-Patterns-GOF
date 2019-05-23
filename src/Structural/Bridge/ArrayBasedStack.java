package Structural.Bridge;

class ArrayBasedStack implements StackImpl {
	 public void push(Object o){
	 if ( !isFull()){ _elements[++_size] = o; }
	 }
	 public boolean isEmpty(){ return (_size == -1); }
	 public boolean isFull(){
	 return (_size == MAX_SIZE-1);
	 }
	 public Object pop(){
	 if (isEmpty()){ return null; }
	 return _elements[_size--];
	 }
	 private final int MAX_SIZE = 100;
	 private Object[] _elements = new Object[MAX_SIZE];
	 private int _size = -1;
	}