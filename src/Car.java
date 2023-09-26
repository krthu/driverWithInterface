public class Car implements Vehicle{
   private String name;
   private int ageToDrive;

   private int miles;

   private Driver driver;

   private int consumption;



    public Car(){
        name = "Car";
        ageToDrive = 18;
        miles = 100;
        consumption = 10;
        System.out.println("Car created. " + miles + " miles to go!");
    }


    @Override
    public void drive() {
        if(driver != null){
            System.out.println(name +" drove "+ consumption +" miles - " + (miles-consumption) + "  miles to go");
        }
        else {
            System.out.println(name +" didn’t drive - there’s no driver!");
        }
    }

    @Override
    public void setDriver(Driver driver) {
        if(driver.getAge() < ageToDrive){
            System.out.println("Driver not changed! " + driver.getName()+" is "+ driver.getAge() + ", but must be " + ageToDrive + " or older to drive car");
        }else {
            this.driver = driver;
            System.out.println("Driver changed to " + driver.getName());
        }
    }
}
