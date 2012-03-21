//dresselJames07.java

//Fault: static defect
//Error: incorrect interal state
//Failure: External, incorrect behavior

import static org.junit.Assert.*;

import org.junit.Test;


public class dresselJames07 {
	
	/*Part A Identify the fault:
	 * The fault is that Vehicle's clone returns new Vehicle(this.x) instead of 
	 * using super.clone. The result is that Object's clone is never called, so
	 * the result is not of the correct class, and thus, cannot be cast into a 
	 * Truck.   
	 */

	/* Part B: If possible, identify a test case that does not execute the fault.
	 * I don't believe that any meaningful test can be run that does not 
	 * execute the fault. There are only two methods in Vehicle, the 
	 * constructor and the clone method. Executing the clone method would 
	 * result in executing the fault. Testing the constructor would be rather 
	 * pointless. 
	 */
	
	@Test
	public void testCNoErrorState() {
		//Part C
		//Test that executes fault, but does not result in an error state
		Vehicle vehicleOriginal = new Vehicle(23);
		Vehicle vehicleClone = (Vehicle)vehicleOriginal.clone();
		
		assertFalse(vehicleOriginal==vehicleClone);
		assertEquals(vehicleOriginal.getClass(), vehicleClone.getClass());
		assertEquals(vehicleOriginal, vehicleClone);//Not strictly necessary, but Bloch recommends
		
		}
	

	/* Part D if possible identify a test case that results in an error, but not
	 * a failure. Hint: Don't forget about the program counter
	 * 
	 * There are no possible test cases that result in an error state but do not
	 * result in an observable failure. The error state happens when a truck is 
	 * cloned, and the super.clone method creates a vehicle instead. Because 
	 * truck.clone casts to truck, an exception is raised, so there is always a
	 *  failure. 
	 */
	

	/* Part E For the given test case, identify the first error state. Be sure 
	 * to describe the complete state.
	 * 
	 * For the given test case below (cloning a truck) the error is caused by
	 * the code at location C.  
	 * 
	 * In the code under test, the error state is thus:
	 * result: a Vehicle (instead of being a truck) 
	 * x: 4
	 * pc: location "A" (just before the return.)
	 * 
	 * 
	 */
	@Test
	public void testEFirstErrorState() {
		
		Truck truckOriginal = new Truck(4);
		Truck truckClone = (Truck)truckOriginal.clone();//Exception happens here	
		//Location C
		assertFalse(truckOriginal==truckClone);
		assertEquals(truckOriginal.getClass(), truckClone.getClass());
		assertEquals(truckOriginal, truckClone);//Not strictly necessary, but Bloch recommends
		
	}
	
	
	//Part F Fix the fault and verify that the given test now produces the expected output. 
	

}
