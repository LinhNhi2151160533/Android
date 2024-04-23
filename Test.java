import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create an ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Initialize 10 employees
        for (int i = 1; i <= 10; i++) {
            employees.add(Employee.createDefaultEmployee(i));
        }

        // Display list of employees
        displayEmployees(employees);

        // Function to add a new employee
        addEmployee(employees);

        // Display list of employees after adding
        displayEmployees(employees);

        // Function to remove an employee
        removeEmployee(employees);

        // Display list of employees after removing
        displayEmployees(employees);
    }

    // Function to display list of employees
    public static void displayEmployees(ArrayList<Employee> employees) {
        System.out.println("List of Employees:");
        for (Employee employee : employees) {
            employee.display();
        }
        System.out.println();
    }

    // Function to add a new employee
    public static void addEmployee(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details of the new employee:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();
        employees.add(new Employee(id, name, age, department, code, salaryRate));
    }

    // Function to remove an employee
    public static void removeEmployee(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of the employee to remove:");
        int id = scanner.nextInt();
        boolean removed = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Employee with ID " + id + " has been removed.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
}
