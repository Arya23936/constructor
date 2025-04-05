
import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;
    double hra;
    double tax;

    public Employee(String name, double basicSalary, double hra, double tax) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.tax = tax;
    }

    public double calculateSalary() {
        return basicSalary + hra - tax;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, basicSalary, hra, tax);
        double totalSalary = employee.calculateSalary();
        System.out.println("Total Salary for " + name + " is: " + totalSalary);
    }
}
