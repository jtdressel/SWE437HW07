class FixedTruck extends FixedVehicle {

   private int y;

   public FixedTruck(int z) { super(z); y = z;}

   public Object clone() {
      Object result = super.clone();
      // Location "B"
      ((FixedTruck) result).y = this.y;  // throws ClassCastException
      return result;             
   }
   // other methods omitted
}