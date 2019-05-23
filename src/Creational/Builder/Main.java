package Creational.Builder;

public class Main {
	 public static void main(String[] args){
		 MazeBuilder builder = new StandardMazeBuilder();
		 MazeGame game = new MazeGame();
		 Maze maze = game.createMaze(builder);
	 }
	}