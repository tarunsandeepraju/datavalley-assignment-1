import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        // Adding employees to the linked list
	employees.add(new Employee(20, "Abc", "Designer", 52000));
        employees.add(new Employee(10, "Xyz", "Analyst", 55000));
        employees.add(new Employee(50, "Pqr", "Manager", 58000));
        employees.add(new Employee(30, "Uvw", "Developer", 60000));


        // Sorting the linked list based on employee name
        Collections.sort(employees, Comparator.comparing(Employee::getName));

        // Displaying sorted employees by name
        System.out.println("Employees sorted by name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sorting the linked list based on employee salary
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));

        // Displaying sorted employees by salary
        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
