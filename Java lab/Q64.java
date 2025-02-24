// Q4
// Demonstrate constructor overloading with an example of employee class to print different
// details of an employee based on the parameters passed
class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        if (department != null) {
            System.out.println("Department: " + department);
        }
        if (salary > 0) {
            System.out.println("Salary: " + salary);
        }
        System.out.println("------------------------");
    }
}


public class Q64 {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Anshuman");
        Employee emp2 = new Employee(102, "Faizal Ali Bhutto", "chinnar");
        Employee emp3 = new Employee(103, "Aniket", "Raand", 55000.0);


        emp1.display();
        emp2.display();
        emp3.display();
    }
}