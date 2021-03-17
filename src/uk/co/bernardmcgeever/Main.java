package uk.co.bernardmcgeever;

public class Main {

    public static void main(String[] args) {
        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid);
        myDroid.performTask("Fly");
        System.out.println(myDroid.batteryLevel);
    }
}
