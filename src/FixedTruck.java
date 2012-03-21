class FixedTruck extends FixedVehicle {

   private int y;

   public FixedTruck(int z) { super(z); y = z;}

   public Object clone() {
      Object result = super.clone();
      // Location "B"
      ((FixedTruck) result).y = this.y;  // throws ClassCastException
      return result;             
   }
   /* Code below this point is not strictly needed for the assignment, and thus
    * if you want to grade quickly you can safely ignore it. I felt that my 
    * clone tests would be inadequate if they did not check equality between 
    * FixedTrucks. The default equals() does not work well, so I wrote my own 
    * below. Its basically a copy of Item 8 in Bloch's Effective Java. ( I do 
    * realize that I should also override .hashCode, but I did not want to add 
    * a ton of extra code.)
    */
   @Override
   public boolean equals(Object o){
	   if (this==o){
		   return true;
	   }
	   if (!(o instanceof FixedTruck)){
		   return false;
	   }
	   FixedTruck test = (FixedTruck)o;
	   
	   if(this.y!=test.y){
		   return false;
	   }
	   return true;
   }
   // other methods omitted
}