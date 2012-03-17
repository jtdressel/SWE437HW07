class Vehicle implements Cloneable {

   private int x;

   public Vehicle(int y) { x = y;}

   public Object clone() { 
      Object result = new Vehicle(this.x);
      // Location "A"
      return result;
   }
   // other methods omitted
}