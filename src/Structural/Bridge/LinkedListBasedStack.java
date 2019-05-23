package Structural.Bridge;

class LinkedListBasedStack implements StackImpl {

	 // use an inner class for linked list nodes
	 private class Node {
	 Node(Object o){
	 value = o;
	 next = null;
	 prev = null;
	 }
	 public Object value;
	 public Node next;
	 public Node prev;
	 }
	 public boolean isEmpty(){ return _tail == null;}
	 public boolean isFull(){ return false; }
	 public void push(Object o){
		 if (_tail == null){
		 _tail = new Node(o);
		 } else {
		 _tail.next = new Node(o);
		 _tail.next.prev = _tail;
		 _tail = _tail.next;
		 }
		 }
		 public Object pop(){
		 if (isEmpty()) return null;
		 Object ret = _tail.value;
		 _tail = _tail.prev;
		 return ret;
		 }
		 private Node _tail;
		}
