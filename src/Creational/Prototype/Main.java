package Creational.Prototype;

public class Main {
	 public static void main(String[] args){
	 MazeGame game = new MazeGame();

	 // create the prototypes
	 Maze mazeProto = new Maze();
	 Wall wallProto = new Wall();
	 Room roomProto = new Room();
	 Door doorProto = new Door(roomProto,roomProto);
	 MazeFactory factory =
	 new MazePrototypeFactory(mazeProto, wallProto,
	 roomProto, doorProto);
	 game.createMaze(factory);
	 
	 Room roomProto2 = new EnchantedRoom(new Spell());
	 Door doorProto2 =
	 new DoorNeedingSpell(roomProto2,roomProto2);
	 factory =
	 new MazePrototypeFactory(mazeProto, wallProto,
	 roomProto2, doorProto2);
	 game.createMaze(factory); 
	 }
	}
