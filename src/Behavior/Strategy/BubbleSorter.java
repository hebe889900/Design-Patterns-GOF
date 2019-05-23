package Behavior.Strategy;

import java.util.Vector;

public class BubbleSorter {
	public void sort(Vector books){
		 for (int i=0; i < books.size(); i++){
		 for (int j=books.size()-1; j > i; j--){
		 if (compare(books, j, j-1)){
		 swap(books, j, j-1);
		 }
		 }
		 }
		 }

	 public static boolean compare(Vector books,int i,int j){
	 Book b1 = (Book)books.elementAt(i);
	 Book b2 = (Book)books.elementAt(j);
	 if (b1.getTitle().compareTo(b2.getTitle()) < 0){
	 return true;
	 }
	 return false;
	 }
	 public static void swap(Vector books, int i, int j){}
	}
