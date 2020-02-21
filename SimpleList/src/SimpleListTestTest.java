import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleListTestTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public static void main(String[] args) {
	      
	       SimpleList list=new SimpleList();
	      
	       for(int i=1; i<=9; i++){
	           list.add(i);
	       }
	       System.out.println("List: "+list.toString());
	       System.out.println("Count: "+list.count());
	      
	       for(int i = 35; i > 25; i--){
	           list.add(i);
	       }
	       System.out.println("List: "+list.toString());
	       System.out.println("Count: "+list.count());
	     
	       list.remove(28);
	       list.remove(15);
	       System.out.println("List: "+list.toString());
	       System.out.println("Count: "+list.count());
	      
	       System.out.println("Item 35 found at index: " + list.search(35));
	       System.out.println("Item 28 found at index: " + list.search(28));
	   }

	}
	

