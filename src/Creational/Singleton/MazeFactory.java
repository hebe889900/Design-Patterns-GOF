package Creational.Singleton;

class MazeFactory {

	// constructor is PRIVATE so it cannot be called from
	//outside the class
	private MazeFactory(){ }
	 // method for returning the unique instance of MazeFactory
	 public static MazeFactory instance(){
	 if (_theFactory == null){
	 _theFactory = new MazeFactory();
	 }
	 return _theFactory;
	 }
	// private static field to store the unique instance
	 private static MazeFactory _theFactory = null;
	 public Maze makeMaze(){ return new Maze(); }
	 public Wall makeWall(){ return new Wall(); }
	 public Room makeRoom(){ return new Room(); }
	 public Door makeDoor(Room r1, Room r2){
	 return new Door(r1,r2);
	 }
	}
