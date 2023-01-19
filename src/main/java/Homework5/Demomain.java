package Homework5;

public class Demomain {

    public static void main(String[] args) {
         Person[]  arrayPerson = new Person[10];

        arrayPerson[0] = new Person("Person1", 20, true);
        arrayPerson[1] = new Person("Person2", 21, false);
        arrayPerson[2] = new Student("Student1", 15, true,6);
        arrayPerson[3] = new Student("Student2", 16, false,5);
        arrayPerson[4] = new Employee("Emp1", 35, true,1000);
        arrayPerson[5] = new Employee("Emp2", 34, false,2000);

        for (Person person : arrayPerson   ) {
            if (person == null) continue;
            if (person instanceof Student){
                ((Student)person).showStudentInfo();
            } else if (person instanceof Employee){
                ((Employee)person).showEmployeeInfo();
            } else {
                person.showPersonInfo();
            }


        }
        //        for (int i = 0; i < arrayPerson.length; i++) {
//            try {
//                arrayPerson[i].showPersonInfo();
//                arrayPerson[i].showStudentInfo();
//                arrayPerson[i].showEmployeeInfo();
//            } catch ( Exception e){}
//        }
            
        }
    }

