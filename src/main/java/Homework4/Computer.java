package Homework4;

public class Computer {
    private int year;
    private double price;
    private String operationSystem;

    public Computer(){
        this(2022,2000,"Linux");
    }

    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

     int comparePrice(Computer compare) {
         double priceToCompare = this.price;
         if (compare.price < priceToCompare) {
             return 1;
         } else if (compare.price > priceToCompare) {
             return -1;
         } else {
             return 0;
         }
     }

     public String toString() {
             return String.format("year %d, price %.2f, operationSystem %s", this.year, this.price, this.operationSystem);
         }

}
