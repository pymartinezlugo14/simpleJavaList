package cse360assign2;

import java.util.Arrays;

//Perla Martinez Lugo
//Class ID: 222
//Assignment 2
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
		//	list[position] = list[position - 1];
			int newsize = list.length + (list.length/2);
			list = Arrays.copyOf(list, newsize);
	
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
		if (list.length < (list.length -(list.length * 0.25))) {
			int decreaseSize = (int) (list.length - (list.length * 0.25));
			list = Arrays.copyOf(list, decreaseSize);
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
	
	public void append(int number) {
		list[number]= list.length -1;
	}
	
	public int first() {
		int firstNumber = list[0];
		return firstNumber;
	}
	
	public void size() {
		for(int index = 0; index < list.length; index++) {
			if (list[index] == 0) {
			
			int sizeleft = 0;
			sizeleft ++;

			System.out.print(list.length - sizeleft);
		}
		
	}
}
}
