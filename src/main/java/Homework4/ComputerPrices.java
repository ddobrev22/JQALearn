package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {

    Computer pc1 = new Computer();
    Computer pc2 = new Computer(2019,1000,"windows");

        System.out.println(pc1);
        System.out.println(pc2);

    System.out.println("pc1.price ? pc2.price = " + pc1.comparePrice(pc2));
    System.out.println("pc1.price ? pc2.price = " + pc2.comparePrice(pc1));


    }
}
