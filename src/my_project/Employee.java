package my_project;

public class Employee {

    private String FIO;
    private String posit;
    private int age;
    private String email;
    private String telNum;
    private double salary;

    public Employee() {//System.out.println("конструктор создан");


    }

    public Employee(String FIO, String posit, int age, String email, String telNum, double salary) {

        this.FIO = FIO;
        this.posit = posit;
        this.age = age;
        this.email = email;
        this.telNum = telNum;
        this.salary = salary;


    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FIO ='" + FIO + '\'' +
                ", posit =" + posit +
                ", age =" + age +
                ", email ='" + email + '\'' +
                ", telNum ='" + telNum + '\'' +
                ", salary =" + salary +
                '}';
    }
}