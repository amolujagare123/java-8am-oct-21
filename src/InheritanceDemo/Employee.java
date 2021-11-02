package InheritanceDemo;

public class Employee {

    int salary = 10000;

    /*Employee()
    {
        salary =5000;
    }*/


    void methodEmployee()
    {
        System.out.println(salary);
        System.out.println("methodEmployee");
    }
}

class Programmer extends  Employee
{
    int bonus = 5000;
    void methodProgrammer()
    {
        System.out.println("methodProgrammer");
    }
    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary);

        p.methodProgrammer();
        p.methodEmployee();
    }
}
