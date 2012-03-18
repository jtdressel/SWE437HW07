//dresselJames07.java
//A Identify the fault:
//b If possible, identify a test case that does not execute the fault.
//c If possible, identify a test case that executes the fault, but does not result in an error state
//d if possible identify a test case that results in an error, but not a failure. Hint: Don't forget about the program counter
//e For the given test case, identify the first error state. Be sure to describe the complete state. 
//f Fix the fault and verify that the given test now produces the expected output. 

//A
//B
//C
//D
//E
//F



//Fault: static defect
//Error: incorrect interal state
//Failure: External, incorrect behavior

import static org.junit.Assert.*;

import org.junit.Test;


public class dresselJames07 {
	
	/*Part A
	 * The fault is that Vehicle's clone returns new Vehicle(this.x) instead of 
	 * using super.clone. The result is that Object's clone is never called, so
	 * the result is not of the correct class, and thus, cannot be cast into a 
	 * Truck.   
	 */

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
