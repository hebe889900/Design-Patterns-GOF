package Creational.Builder;

interface MazeBuilder {
	public void buildMaze();
	public Room buildRoom();
	public void buildDoor(Room from, Direction side1,
	 Room to, Direction side2);
	public Maze getMaze();
}