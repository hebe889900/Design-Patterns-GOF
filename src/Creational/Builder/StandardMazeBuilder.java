package Creational.Builder;

class StandardMazeBuilder implements MazeBuilder {
public void buildMaze(){
_currentMaze = new Maze();
}
public Room buildRoom(){
Room r = new Room();
_currentMaze.addRoom(r);
r.setSide(Direction.North,new Wall());
r.setSide(Direction.South,new Wall());
r.setSide(Direction.East, new Wall());
r.setSide(Direction.West, new Wall());
return r;
} 

public void buildDoor(Room r1, Direction side1,
Room r2, Direction side2){
Door d = new Door(r1, r2);
r1.setSide(side1,d);
r2.setSide(side2,d);
}
public Maze getMaze(){
return _currentMaze;
}
private Maze _currentMaze;
}
