package Homework5;

public class Student extends Person {
    private double score;

    public Student(String n, int a,boolean sex, double s)
    {
        super(n , a , sex);
        score = s;
    }

    public void showStudentInfo()
    {
        System.out.println("Student[super=" + super.allPersonInfo() + ",score=" + score + "]");
    }
}
