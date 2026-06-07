public class Car{
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public void drive(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is Out of fuel");
        }else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserved , you need to refuel");
            currentFuelInLiters--;

        }else{
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
        
    }
    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(4);

        System.out.println(myCar.getCurrentFuelLevel());
    }
}