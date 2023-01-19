package Homework5;

public class Employee extends Person {
        private double daySalary;

	public Employee(String n, int a,boolean sex, double ds)
        {
            super(n ,a ,sex);
            daySalary = ds;
        }
    public void showEmployeeInfo()
        {
            System.out.println("Employee[super=" + super.allPersonInfo() + ",salary=" + daySalary + "]");
        }
    public double calculateOvertime(double hours, int age)
    {
        if (age < 18 ){
            return 0;
        } else {
            return (daySalary / 8) * 1.5 * hours;
        }
    }
}
