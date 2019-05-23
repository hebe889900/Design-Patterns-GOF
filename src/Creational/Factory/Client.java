package Creational.Factory;

public class Client {
	 public static void main(String[] args){
		 MazeGame game = new EnchantedMazeGame();
		 Maze maze = game.createMaze();
	}

} 