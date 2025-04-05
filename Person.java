
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    String department;

    Employee(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class SuperExample2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, 101, "HR");
        emp.displayDetails();
    }
}
