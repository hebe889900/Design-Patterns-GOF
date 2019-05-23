package Structural.Bridge;

class Stack {
	 Stack(String implType){
	 if (implType.equals("array")){
	 _impl = new ArrayBasedStack();
	 } else if (implType.equals("linkedlist")){
	 _impl = new LinkedListBasedStack();
	 }
	 }
	 public void push(Object o){ _impl.push(o); }
	 public Object pop(){ return _impl.pop(); }
	 public boolean isEmpty(){ return _impl.isEmpty(); }
	 public boolean isFull(){ return _impl.isFull(); }

	 private StackImpl _impl;
}
