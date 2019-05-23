package Creational.Factory;

class MazeGame {
	 // factory methods that create the products
	 public Maze makeMaze(){ return new Maze(); }
	 public Room makeRoom(){ return new Room(); }
	 public Wall makeWall(){ return new Wall(); }
	 public Door makeDoor(Room r1, Room r2){
	 return new Door(r1, r2);
	 }
	 // create a maze by calling the factory methods
	 public Maze createMaze(){
	 Maze aMaze = makeMaze();
	 Room r1 = makeRoom();
	 Room r2 = makeRoom();
	 Door theDoor = makeDoor(r1,r2);
	 aMaze.addRoom(r1); aMaze.addRoom(r2);
	 r1.setSide(Direction.North, makeWall());
	 r1.setSide(Direction.East, theDoor);
	 r1.setSide(Direction.South, makeWall());
	 r1.setSide(Direction.West, makeWall());
	 r2.setSide(Direction.North, makeWall());
	 r2.setSide(Direction.East, makeWall());
	 r2.setSide(Direction.South, makeWall());
	 r2.setSide(Direction.West, theDoor);
	 return aMaze;
	 }
	}	 