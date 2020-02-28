/**
* @author  Mei Jia Lu
* Class ID: 200
* Assignment #: 2
* <p>
* 
* <h1>SimpleList</h1>
* This is a program called SimpleList that will illustrated 
* nine different methods.This program  is designed
* to give practice with using a version control system.
* 
*/

package cse360assign2;

/**
* The SimpleList class will implement an simple array list the
* following methods:add,remove,count,toString, search, first,last,
* size and append.
 */
public class SimpleList 
{
	/**
	* Declaring Variables
	*  Creating the array.
	*  Creating the counter.
	*/
	private int[] list;
	private int count;

	
	/**
	* Constructor
	*  This method will creates an array list that holds 10 integers.
	*  The count is set to 0.
	*/
	public SimpleList() 
	{
		list = new int [10];
		this.count = 0;	
	}

	
	/**
	* Add the parameter to the list at the beginning (index = 0)
	* <p>
	* Move all the other integers in the list over so there is room.
	* If the list is full, then increase the size by 50% for more room.
	*
	* @param num   The number will be added at index 0
	*/
	public void add(int num) 
	{
		if (count == list.length)
		{
			//calculating the array increase by 50%
			int increaseFifty = count + (count / 2); 
			
			// new array for the increase
			int updateArray[] = new int[increaseFifty];
			
			//copying the list into appendArray
			for (int secondArray = 0; secondArray < increaseFifty && secondArray < count; secondArray++) 
			{
				updateArray[secondArray] = list[secondArray];
			}

			//replace original array with new append array
			list = updateArray;

			//adjust count
			if (increaseFifty < count) 
			{
				count = increaseFifty;
			}
		}
		
		//array is empty
		if (count == 0)
		{
			//at position 0, add parameter to list at the beginning
			list[0] = num;
			
			//incrementing the value of count.
			count++;
		} 
		
		//array with less than 10 elements, but not empty
		else
		{
	    	for (int item = count; item >= 0; item--) 
	    	{
	    		if(list[item] != 0)
	    		{
	    			//shift all array to the right
	    			list[item + 1] = list[item];
	    		}
	        }
	    	
	    	//add new integer at index 
	    	list[0] = num;
	        
	    	//incrementing the value of count.
	    	count++;
		}
	}
		
	
	/**
	* If the parameter is in the list, then remove it. 
	* <p>
	* The other values in the list may need to be moved down.
	* Adjust the count as needed. If the list has more than 25%
	* empty places, decrease the size of the list.
	* The list cannot be reduced to less than 1 entry.
	* 
	* @param num  The parameter number to be removed.
	*/
	public void remove(int num) 
	{
		//locating the location(index) of first instance of parameter 
		int index = search(num);
				
		if (index != -1)
		{
			//remove the array in position 0
			for (int item = index; item < list.length - 1; item++) 
			{
				//shift array left
				list[item] = list[item + 1];
	         }
			
			//decrement the value of count
			count--;
		}
		
		//calculate 75% of capacity
        int listCapacity = 3 * list.length / 4;

        //checking if list has more than 25% empty places
        if (count < listCapacity)
        {
        	//creating a new array
        	int decreaseArray[] = new int[count];

        	//copy list array elements into the decrease the size of the list.
        	for (int secondArray = 0; secondArray < count; secondArray++) 
        	{
        		decreaseArray[secondArray] = list[secondArray];
        	}

        	//replace original array with new down sized array
        	list = decreaseArray;

        	//adjust the count
        	if (listCapacity < count) 
        	{
        		count = listCapacity;
        	}
        }
	}
	
	
	/**
	* Returns the number of elements stored in the array list.
	*
	* @return count The number of elements in the array list.
	*/
	public int count()
	{
		return count;
	}

	
	/**
	* Returns a String with the array list.
	* <p>
	* The elements will be separated by a space.
	* There is not space after the last integer.
	*
	* @return str  Returns the array list as a string.
	*/
	public String toString() {
		
		//initializes a empty string
		String str = "";
		
		//checking that the array list is filled
		for (int item = 0; item < count; item++)
		{
			//concatenate array list and string
			str += list[item];
			
			//checking to see if its the last element of array
			if (item != count - 1) 
			{
				str += " ";
	        }
	    }
		
		//return the string
		return str;
	}

	
	/**
	* Return the location of the parameter in the list.
	* <p>
	* If the parameter is not in the list, return -1
	*
	* @param num     The number to be searched.
	* @return index  Returns the index
	*/
	 public int search(int num) 
	 {
		 //setting index to -1
		 int index = -1;
		 
		 //the number the last element in the array 
		 for (int item = 0; item < count; item++)
		 {
			 // the number is locate in the array 
			 if (list[item] == num)
			 {
				 //found location of index
				 index = item;
	         }
	     }	 
		 
		 //returning the index
		 return index;
	  }
	 
	 
	 /**
	 * The append method should append the parameter to the end of the list.  .
	 * <p> 
	 * If the list was full, then increase the size by 50% so there will be room.  
	 * Increment the count.
	 *
	 * @param appendParameter  The parameter to be appended to end of list
	 */
	 public void append(int appendParameter)
	 {
		 //if  list is full, increase the size by 50%
		 if (count == list.length)
		 {
			 //calculating the array increase by 50%
			 int increaseFifty = count + (count / 2 ); 
			 
			 // new array for append
			 int appendArray[] = new int[increaseFifty];
			 
			 //copying the list into appendArray
			 for (int secondArray = 0; secondArray < increaseFifty && secondArray < count; secondArray++) 
			 {
				 appendArray[secondArray] = list[secondArray];
			 }
			 
			 //replace original array with new append array
			 list = appendArray;

			 //adjust count
			 if (increaseFifty < count) 
			 {
				 count = increaseFifty;
			 }
		}
		 
		 //adding the count at index
		 list[count] = appendParameter;
		 
		 //increment the count.
		 count++;
    }

		
    /**
	* Returns the first element in the list.
	* <p>
	* If the parameter is not in the list, return -1
	*
	* @return  Returns the parameter at index 0.
	*/
	public int first()
	{
		if (count == 0)
		{
			//if there are no elements n the list, then return -1.
			return -1;
		}
		
		else
		{
			//returning the first element
			return list[0];
		}
	}

	
	/**
	* Returns the last element in the list.
	* <p>
    * If the parameter is not in the list, return -1
	*
	* @return  Returns the last element in the list.
	*/
	public int last()
	{
		if (count == 0)
		{
			//if there are no elements n the list, then return -1.
			return -1;
		}
		
		else
		{
			//returning the last element
			return list[count - 1];
		}
	}

	
	/**
	* Returns the current number of possible locations in the list.
	*
	* @return  Returns the length of the array list.
	*/
	public int size()
	{
		//returning the length of the array list
		return list.length;
	}
}
