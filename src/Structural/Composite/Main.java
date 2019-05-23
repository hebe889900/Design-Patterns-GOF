package Structural.Composite;

public class Main {
	 public static void main(String[] args){
	 Directory root = new Directory("");
	 File core = new File("core", root, "hello");
	 Directory usr = new Directory("usr", root);
	 File adm = new File("adm"
	, usr, "there");
	 Directory foo = new Directory("foo"
	, usr);
	 File bar1 = new File("bar1"
	, usr,
	"abcdef");
	 File bar2 = new File("xbar2"
	, usr,
	"abcdef");
	 File bar3 = new File("yybarzz3"
	, usr,
	"abcdef");
	 System.out.println(root.find("bar"));
	 }
	}
