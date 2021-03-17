package uk.co.bernardmcgeever;

public class Droid
{
    String name;
    int batteryLevel;

    // Constructor method
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // Perform Task method
    public void performTask(String task){
        System.out.println(name + "is performing task: " + task);
        batteryLevel -= 10;
    }

    // to String method
    public String toString(){
        return "Droid: " + name + ", battery Level: " + batteryLevel;
    }
}
