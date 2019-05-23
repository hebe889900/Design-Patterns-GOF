package Creational.Prototype;

class MazePrototypeFactory extends MazeFactory {

	 MazePrototypeFactory(Maze m, Wall w, Room r, Door d){
	 _prototypeMaze = m;
	 _prototypeWall = w;
	 _prototypeRoom = r;
	 _prototypeDoor = d;
	 }

	 public Maze makeMaze(){
	 return (Maze)_prototypeMaze.clone();
	 }

	 public Room makeRoom(){
	 return (Room)_prototypeRoom.clone();
	 }
	 
	 public Wall makeWall(){
		 return (Wall)_prototypeWall.clone();
		 }
		 public Door makeDoor(Room r1, Room r2){
		 Door door = (Door)_prototypeDoor.clone();
		 door.initialize(r1,r2);
		 return door;
		 }

		 private Maze _prototypeMaze;
		 private Wall _prototypeWall;
		 private Room _prototypeRoom;
		 private Door _prototypeDoor;
}	 