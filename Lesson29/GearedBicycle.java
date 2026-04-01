 public class GearedBicycle extends Bicycle {
    private int gear =1;
    final private int MAX_GEAR = 6;
    final int MAX_GEARED_SPEED = 50;

    public int getGear(){
        return gear;
    }

    public void setGear(int gear){
        if(gear>0 && gear<= MAX_GEAR){
            this.gear = gear;
        }
    }

    public void shiftUp(){
        gear = gear +1; 
        if(gear>MAX_GEAR){
            gear = MAX_GEAR;
        }
    }

     public void shiftDown(){
        gear = gear -1; 
        if(gear<1){
            gear = 1;
        }}

//overide pedal method

public void pedal() {
        int newSpeed = getSpeed() + gear;
        if (newSpeed > MAX_GEARED_SPEED) {
            newSpeed = MAX_GEARED_SPEED;
        }
        this.setSpeed(newSpeed);
    }

public void brake() {
       int newSpeed = getSpeed() - 2;
        if (newSpeed < 0) {
        newSpeed = 0;
        }
    }


    //overide display method
    public void display(){
        super.display();
        System.out.println("Current Gear = " + gear);


    }
    


    public static void main(String[] args) {
        Bicycle regular = new Bicycle();
        GearedBicycle geared = new GearedBicycle();

        for(int i=0; i<5; i++){
            regular.pedal();
            geared.pedal();
        }
        regular.brake();
        geared.brake();
        System.out.println("Regular: ");
        regular.display();
         System.out.println("Geared: ");
        geared.display();
    }
    
}



