package Creational.Prototype;

import java.util.HashSet;
import java.util.Set;

class Maze {
	 Maze(){ System.out.println("creating a Maze"); }
	 void addRoom(Room r){
	 if (!_rooms.contains(r)){
	 _rooms.add(r);
	 }
	 }
	 protected Object clone() {
	 if (!_rooms.isEmpty()){
	 throw new Error("cloning of non-empty mazes not supported.");
	 }
	 Maze maze = new Maze();
	 maze._rooms = new HashSet();
	 return maze;
	 }
	 private Set _rooms = new HashSet();
	}
