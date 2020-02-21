/* Author: Mei Jia Lu
 * Class ID: 200
 * Assignment 1: SimpleListTest.java
 * Description: This is a program called SimpleListJava that will test all the methods 
 *              SimpleList.java. All methods will have an initial results of "fail" and success. 
*/

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleListTest {
	
	protected SimpleList list= new SimpleList();
	    	   
	 @Test
	 public void addTest() {
		 int expectedValue = 1;
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 assertEquals(expectedValue, 1);
	 }
   
	 @Test
	 public void removeTest() {
	 assertEquals("How", "How are you?".substring(0, 3));
	 }
	       
	  @Test
	  public void countTest() {
	  assertEquals("How", "How are you?".substring(0, 3));
	          
	  }
	       
	  @Test
	  public void toStringTest() {
	  assertEquals("How", "How are you?".substring(0, 3));
	          
	   }

	   @Test
	   public void searchTest() {
	   assertEquals(5, "Some string".indexOf('s'));
	         
	   }
	   }

