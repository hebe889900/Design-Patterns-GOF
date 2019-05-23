package Creational.Factory;

class EnchantedMazeGame extends MazeGame {
	 public Room makeRoom(){
	 return new EnchantedRoom(castSpell());
	 }
	 public Door makeDoor(Room r1, Room r2){
	 return new DoorNeedingSpell(r1, r2);
	 }
	 private Spell castSpell(){return new Spell(); }
	}