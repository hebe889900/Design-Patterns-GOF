package Creational.Prototype;

class Wall extends MapSite {
	 Wall(){
	 _wallNr = _wallCnt++;
	 System.out.println("creating Wall #" +
	new Integer(_wallNr).toString());
	 }
	 
	 public Object clone(){
		 Wall wall = new Wall();
		 return wall;
		 }
	 public String toString()
	 { return "Wall #" + new Integer(_wallNr).toString(); }
	 private int _wallNr;
	 private static int _wallCnt = 1;
}