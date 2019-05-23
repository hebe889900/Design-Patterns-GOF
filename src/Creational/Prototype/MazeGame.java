package Creational.Prototype;

class MazeGame {
	 // factory methods that create the products
	 public Maze makeMaze(){ return new Maze(); }
	 public Room makeRoom(){ return new Room(); }
	 public Wall makeWall(){ return new Wall(); }
	 public Door makeDoor(Room r1, Room r2){
	 return new Door(r1, r2);
	 }
	 // create a maze by calling the factory methods
	 public Maze createMaze(MazeFactory factory){
		 Maze aMaze = factory.makeMaze();
		 Room r1 = factory.makeRoom();
		 Room r2 = factory.makeRoom();
		 Door theDoor = factory.makeDoor(r1,r2);
		 aMaze.addRoom(r1); aMaze.addRoom(r2);
		 r1.setSide(Direction.North, factory.makeWall());
		 r1.setSide(Direction.East, theDoor);
		 r1.setSide(Direction.South, factory.makeWall());
		 r1.setSide(Direction.West, factory.makeWall());
		 r2.setSide(Direction.North, factory.makeWall());
		 r2.setSide(Direction.East, factory.makeWall());
		 r2.setSide(Direction.South, factory.makeWall());
		 r2.setSide(Direction.West, theDoor);
		 return aMaze;
		 }

	}	 