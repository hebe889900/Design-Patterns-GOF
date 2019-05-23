package Structural.Proxy;

public class Main {
	 public static void main(String[] args){
	 Directory root = new Directory("");
	 File core = new File("core", root, "hello");
	 Directory usr = new Directory("usr", root);
	 File adm = new File("adm", usr, "there");
	 Directory foo = new Directory("foo", usr);
	 File bar1 = new File("bar1", foo, "abcdef");
	 File bar2 = new File("xbar2", foo, "abcdef");
	 File bar3 = new File("yybarzz3", foo, "abcdef");
	 Link link = new Link("link-to-usr", usr, root);
	 Link linkToLink =
	 new Link("link-to-link", link, root);
	 System.out.println(root.find("bar"));
	 }
	}

