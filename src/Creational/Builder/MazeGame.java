package Creational.Builder;

class MazeGame {
public static Maze createMaze(MazeBuilder
builder){
	builder.buildMaze();
	Room r1 = builder.buildRoom();
	Room r2 = builder.buildRoom();
	builder.buildDoor(r1, Direction.North,
	 r2, Direction.South);
	return builder.getMaze();
	}
}