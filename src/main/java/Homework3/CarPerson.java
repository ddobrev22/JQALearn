package Homework3;

public class CarPerson {
    public static void main(String[] args) {

        car car1 = new car(2000,5000.0,true,50,10,"benzin");
        car car2 = new car(2020,40000.0,false,60,10,"electric");

        car1.useFuel(35);
        car2.changeЕngineFuelOperationSystem("dizel");

        System.out.println(car1);
        System.out.println(car2);


    }
}
