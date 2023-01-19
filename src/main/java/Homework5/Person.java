package Homework5;

public class Person {
    private String name;
    private int age;
    private boolean isMan;

    public Person(String n, int a, boolean sex)
    {
        name = n;
        age = a;
        isMan = sex;
    }

    public String allPersonInfo()
    {
        return String.format("name= %s ,Age= %d ,isMan = %s", name, age, isMan);
    }
    public void showPersonInfo()
    {
        System.out.println("Person=" + allPersonInfo() + "]");
    }


}
