package Behavior.Visitor;



class DuVisitor implements Visitor {
	 DuVisitor(){
	 _nrFiles = 0;
	 _nrDirectories = 0;
	 _nrLinks = 0;
	 _totalSize = 0;
	 }
	// visit a file
	 
	 
	 
	 public void visit(File f){
	 _nrFiles++;
	 _totalSize += f.size();
	 }
	 
	 public void visit(Directory d){
		 _nrDirectories++;
		 Iterator it = d.iterator();
		 for (it.first(); !it.isDone(); it.next()){
		 Node n = (Node) it.current();
		 if (n instanceof File){
		 visit((File) n);
		 } else if (n instanceof Directory){
		 visit((Directory) n);
		 } else if (n instanceof Link){
		 visit((Link) n);
		 }
		 }
		 }
	 
	 public void visit(Link l){
		 _nrLinks++;
		 }
		 public void report(){
		 System.out.println("number of files: " + _nrFiles);
		 System.out.println("number of directories: " + _nrDirectories);
		 System.out.println("number of links: " + _nrLinks);
		 System.out.println("total size of files: " + _totalSize);
		 }
		 int _totalSize; int _nrFiles; int _nrLinks; int _nrDirectories;
		}
