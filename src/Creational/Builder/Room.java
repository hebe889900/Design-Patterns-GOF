package Creational.Builder;

class Room extends MapSite {
Room(){
 _roomNr = _roomCnt++;
 System.out.println("creating Room #" + _roomNr);
}

void setSide(Direction d, MapSite site){

if (d == Direction.North){
 _northSide = site;
 } else if (d == Direction.South){
 _southSide = site;
 } else if (d == Direction.East){
 _eastSide = site;
 } else if (d == Direction.West){
 _westSide = site;
 }
 System.out.println("setting " + d.toString() +
 " side of " + this.toString() + " to " +
site.toString());
 }

MapSite getSide(Direction d){
	 MapSite result = null;
	 if (d == Direction.North){
	 result = _northSide;
	 } else if (d == Direction.South){
	 result = _southSide;
	 } else if (d == Direction.East){
	 result = _eastSide;
	 } else if (d == Direction.West){
	 result = _westSide;
	 }
	 return result;
	 }
	 public String toString(){
	 return "Room #" + new Integer(_roomNr).toString();
	 }
	 
	 private int _roomNr;
	 private static int _roomCnt = 1;
	 private MapSite _northSide;
	 private MapSite _southSide;
	 private MapSite _eastSide;
	 private MapSite _westSide;
}	 