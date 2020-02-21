/* Author: Mei Jia Lu
 * Class ID: 200
 * Assignment 1: SimpleList.java
 * Description: This is a program called SimpleList that will illustrated different
 *              methods like SimpleList(),add(),remove(),count(),toString()and search().
 *              This program is designed to provide practice for Javadoc, creating unit 
 *              test and using Junit.
*/

package assign1;

//The SimpleList class will implement the following methods:
//SimpleList(),add(),remove(),count(),toString()and search().

public class SimpleList {
	
	private int[] list;
	private int count;

	//This method will create an array to hold 10 integers and set count to 0.
	
	public SimpleList() {
		list = new int[10];
		this.count = 0;	
	}

	//This method will add the parameter to the list at the beginning (index = 0).
	//Move all the other integers in the list over so there is room.
	//If the list is full, the last element falls off the list.
	//Increment the count as needed
	
	//The add method accepts the integer parameter. 
	
	public void add(int num) {
		
		//If the index is 0, then increment the count.
		
		if (count == 0) {
			list[count] = num;
			count++;
		
		//Shift all integers on the list over.
			
	    } else if (count < 10) {
	    	for (int item = count - 1; item >= 0; item--) {
	    		list[item + 1] = list[item];
	        }
	    	
	    	//Adding new integer at index 
	    	
	    	list[0] = num;
	        
	    	//Incrementing the value of count.
	    	count++;
	        
	    //Else if the list is full, the last element will falls off the list.
	        
	    } else {
	    	for (int item = count - 2; item >= 0; item--) {
	    		list[item + 1] = list[item];
	    	}
	    	
	    	//Adding new integer at index 
	    	list[0] = num;
	    }
	}
	
	//If the parameter is in the list, then remove it.
	//The other values in the list may need to be moved down.
	//Adjust the count as needed
	
	//This remove method accepted integer parameters
	
	public void remove(int num) {
		int index = search(num);
		
		//If the parameter is in the list, then remove and shift the value.
		
		if (index != -1) {
			for (int item = index; item <= count - 1; item++) {
				list[item] = list[item + 1];
	         }
			
			//Decrement the value of count
			
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
		
		//Initializes a empty string called str
		
		String str = "";
		
		//Using the for loop to separated the element by a space and 
		//ensuring that there is no space after the last integer.
		
		for (int item = 0; item < count; item++) {
			str += list[item];
			if (item != count - 1) {
				str += " ";
	        }
	    }
		
		//Return the string
		
		return str;
	}

	//Return the location of the parameter in the list.
	//If the parameter is not in the list, then return -1

	//This search method accepted integers in the parameters.
	
	 public int search(int num) {
		 int index = -1;
		 for (int item = 0; item < count; item++) {
			 if (list[item] == num) {
				 index = item;
	         }
	     }	 
		 
		 //Return -1, when parameter is not on the list.
		 
		 return index;
	  }
}

