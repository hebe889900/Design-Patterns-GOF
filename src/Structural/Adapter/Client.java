package Structural.Adapter;

public class Client {
	 public static void main(String[] args) {
	 Stack s = new StackAdapter();
	 s.push("foo");
	 s.push("bar");
	 s.push("baz");
	 System.out.println(s.pop());
	 System.out.println(s.pop());
	 System.out.println(s.pop());
	 }
	}
