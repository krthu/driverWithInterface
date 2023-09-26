public class MilitaryTank implements Vehicle{

    private String name;
    private int ageToDrive;

    private int miles;

    private Driver driver;

    private int consumption;

    public MilitaryTank(){
        name = "Tank";
        ageToDrive = 25;
        miles = 2000;
        consumption = 5;


        System.out.println("Tank created. " + miles + " miles to go!");

    }

    @Override
    public void drive() {
        if(driver != null){
            System.out.println(name +" drove "+ consumption +" miles - " + (miles - consumption) + "  miles to go");
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
