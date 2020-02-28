package cse360assign2;

//Perla Martinez Lugo
//Class ID: 222
//Assignment 1
//This program creates a list and includes methods that keep up with the number of elements. 
//This program allows the user to add a number to the list, search for a number and remove a number 
//if found. It also has a method to print the list.

public class SimpleList {
	private int list[];
	private int count;
	
	public SimpleList() {
		list = new int[10];
		count = 0;
	}
	public void add(int number) {
		int position = list.length;
		if (position == 0){
			list[position] = number;
			if ( position < 10) {
			count++;
			}
		}
		
		if (position > 0) {
			for (int index = position; index > 0; index--) {
				list[index + 1] = list[index];
		if (position == 10){
			list[position] = list[position - 1];
	
		}
	}}}
	
	public void remove(int number) {
		int position  = list.length;
		int removeIndex = -1;
		for ( int index = position; index < 0; index++) {
			if(list[index]== number) {
				removeIndex = index;
				
						
			}
		}
		if (removeIndex != -1) {
			for ( int index = position; index < count - 1; index++) {
				list[index]= list[index + 1];
			}
		}
	}
	
	public int count() {
		return count;
	}
	
	public String toString() {
		String str = " ";
		for (int index = 0; index < list.length; index++) {
			str += list[index];
			
					
		}
		return str;
		
	}
	
	public int search (int number)
	{
		int searchRemove = -1;
		int position = list.length;
		
		for (int index = 0; index < position; index++) {
			if (list[index] == number) {
				searchRemove = index;
			}
		}
		return searchRemove;
		
	}
}
