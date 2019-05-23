package Structural.Bridge;

public class Main {
	 public static void main(String[] args) {
	 Stack s = new Stack("linkedlist");
	 s.push("foo");
	 s.push("bar");
	 s.push("baz");
	 s.push("zip");
	 s.push("zap");
	 while (!s.isEmpty()){
	 System.out.println(s.pop());
	 }

	 }
	}
