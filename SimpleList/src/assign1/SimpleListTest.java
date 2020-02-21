/* Author: Mei Jia Lu
 * Class ID: 200
 * Assignment 1: SimpleListTest.java
 * Description: This is a program called SimpleListJava that will test all the methods 
 *              SimpleList.java. All methods will have an initial results of "fail" and success. 
*/

package assign1;

import static org.junit.Assert.*;

import org.junit.Test;

//This is a class called SimpleListTest. It is use to test the fail and success 
//of the methods in SimpleList.


public class SimpleListTest {
	
	private SimpleList list= new SimpleList();
	
	// Testing the success of method add(int num)
	
	 @Test
	 public void testAdd() {
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 String expectedValue = "3 2 1";
		 String actual = list.toString();
		 assertEquals(expectedValue, actual);
	 }
	 
	// Testing the fail of method add(int num)
	 
	 @Test
	 public void testAddFail() {
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 String expectedValue = "1 2 3";
		 String actual = list.toString();
		 assertEquals(expectedValue, actual);
	 }
	 
	// Testing the success of method remove(int num)
	 
	 @Test
	 public void testRemove() {
		 list.add(1);
		 list.add(2);
		 list.remove(3);
		 String expectedValue = "2 1";
		 String actual = list.toString();
		 assertEquals(expectedValue, actual);
	 }
	 
	// Testing the fail of method remove(int num)
	 
	 @Test
	 public void testRemoveFail() {
		 list.add(1);
		 list.add(2);
		 list.remove(3);
		 String expectedValue = "3 2 1";
		 String actual = list.toString();
		 assertEquals(expectedValue, actual);
	 }
	
	//Testing the success of method int count()
	 
	 @Test
	  public void testCount() {
		  list.add(1);
	      list.add(2);
		  list.add(3);
		  int expectedValue = 3;
		  int acutal = list.count();
	      assertEquals(expectedValue, list.count());	 
	  }
	  
	// Testing the fail of method int count();
	  
	  @Test
	  public void testCountFail() {
		  list.add(1);
	      list.add(2);
		  list.add(3);
		  int expectedValue = 2;
		  int acutal = list.count();
	      assertEquals(expectedValue, list.count());	
	      
	  }
	  
	  //Testing the success of method toString
	  
	  @Test
	  public void testToString() {
		  list.add(1);
		  list.add(2);
		  list.add(3);
		  String expectedValue = "3 2 1";
		  String actual = list.toString();
	      assertEquals(expectedValue, actual);
		 }
	  
	  //Testing the failure of toString;
	  
	  @Test
	  public void testToStringFail() {
		  list.add(1);
		  list.add(2);
		  list.add(3);
		  String expectedValue = "3 2";
		  String actual = list.toString();
	      assertEquals(expectedValue, actual);
		 }
	  
	  //Testing the success of search(int num) 
	  
	   @Test
	   public void testSearch() {
		   list.add(1);
		   list.add(2);
		   list.add(3);
		   int expectedValue = 2;
		   int actual = list.search(1);
		   assertEquals(expectedValue, actual);	  
	   }
	   
	   //Testing the failure of search(int num)
	   
	   @Test
	   public void testSearchFail() {
		   list.add(1);
		   list.add(2);
		   list.add(3);
		   int expectedValue = 3;
		   int actual = list.search(1);
		   assertEquals(expectedValue, actual);
	   }
}
