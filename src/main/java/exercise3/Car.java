package exercise3;

public class Car {
  public double fuelLevel;
  public double mileage;
  public String licensePlate;
  public double fuelConsumption;
  public int fuelCapacity;

  public Car(int fuelLevel, int mileage, String licensePlate, double fuelConsumption, int fuelCapacity) {
     this.fuelLevel = fuelLevel;
     this.mileage = mileage;
     this.licensePlate = licensePlate;
     this.fuelConsumption = fuelConsumption;
     this.fuelCapacity = fuelCapacity;

  }

  //declare vars


  //Create constructor

  public void drive(int distance) {
    //do stuff
      double maxdistance = fuelLevel / fuelConsumption;
      System.out.println("Max distance: " + maxdistance);
      double distanceToDrive = distance;
      System.out.println(fuelLevel);
      if(distance > maxdistance){
          distanceToDrive =maxdistance;
      }
      this.fuelLevel -= distanceToDrive * this.fuelConsumption;
      this.mileage = Math.round ((this.mileage + distanceToDrive) * 100.0) / 100.0;
      if (this.fuelLevel < 0) {
          this.fuelLevel = 0;




      }
  }

  public void refuel(int amount) {
    //do
      this.fuelLevel += amount;
      if(this.fuelLevel > this.fuelCapacity){
          this.fuelLevel = this.fuelCapacity;
      }
  }

  //add toString
    public String toString(){
      return "Car{" +
              "licensePlate='" + licensePlate + '\'' +
              ", mileage=" + mileage +
              ", fuelConsumption=" + fuelConsumption +
              ", fuelCapacity=" + fuelCapacity +
              ", fuelLevel=" + fuelLevel +
              '}';
    }
}
