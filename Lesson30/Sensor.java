public abstract class Sensor {
    private String name; 
    private int modelNumber;

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;

    }

     public int GetModelNumber(){
        return modelNumber;

    }

    public void SetModelNumber(int modelNumber){
        this.modelNumber=modelNumber;
    }
/*reffered back to class slideshow for the following
//had to look up what/how to implemented abstract method
An abstract method is a method that is declared but not implemented in a parent class.*/

public abstract void recordMeasurement();




}
