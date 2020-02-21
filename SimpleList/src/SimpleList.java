/* Author: Mei Jia Lu
 * Class ID: 200
 * Assignment 1: SimpleList.java
 * Description: This is a program called SimpleList that will illustrated different
 *              methods like SimpleList(),add(),remove(),count(),toString()and search().
 *              This program is designed to provide practice for Javadoc, creating unit 
 *              test and using Junit.
*/

//The SimpleList class will implement the following methods:
//SimpleList(),add(),remove(),count(),toString()and search().

public class SimpleList {
	
	private int[] list;
	private int count;

	//Create an array to hold 10 integers and set count to 0.
	
	public SimpleList() {
		list = new int[10];
		this.count = 0;	
	}

	//Adding the parameter to the list at the beginning (index = 0).
	//Moving all the other integers in the list over so there is room.
	//If the list is full, the last element falls off the list.
	//Increment the count as needed
	
	public void add(int num) {
		if (count == 0) {
			list[count] = num;
			count++;
			
	    } else if (count < 10) {
	    	for (int item = count - 1; item >= 0; item--) {
	    		list[item + 1] = list[item];
	        }
	    	list[0] = num;
	        count++;
	        
	    } else {
	    	for (int item = count - 2; item >= 0; item--) {
	    		list[item + 1] = list[item];
	    	}
	    	list[0] = num;
	    }
	}
	
	//If the parameter is in the list, then remove it.
	//The other values in the list may need to be moved down.
	//Adjust the count as needed
	
	public void remove(int num) {
		int index = search(num);
		if (index != -1) {
			for (int item = index; item <= count - 1; item++) {
				list[item] = list[item + 1];
	         }
			count--;
		}
	}

	//Return the number of elements stored in the list.
	
	public int count(){
		return count;
	}

	//The elements will be separated by a space.
	//There is not space after the last integer.
	
	public String toString() {
		String str = "";
		for (int item = 0; item < count; item++) {
			str += list[item];
			if (item != count - 1) {
				str += " ";
	        }
	    }	
		return str;
	}

	//Return the location of the parameter in the list.
	//If the parameter is not in the list, then return -1

	 public int search(int num) {
		 int index = -1;
		 for (int item = 0; item < count; item++) {
			 if (list[item] == num) {
				 index = item;
	         }
	     }	 
		 return index;
	  }
}

