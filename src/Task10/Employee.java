//QUS:2


package Task10;

public class Employee {
    public int id;
    public String name;
    public double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary; 
        
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to increase salary by a certain percentage
    public void riseSalary(double percentage) {
        this.salary += this.salary * percentage / 100;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Employee emp = new Employee(10365, "Sandhiya", 50000);
        
        System.out.println("The final output will be: "+ "\n" );
        
        System.out.println("Before salary rise: " + emp);
        
        emp.riseSalary(12); // Raising salary by 10%
        
        System.out.println("After salary rise: " + emp);
    }
}
 /*
  
  The final output will be: 

Before salary rise: Employee{id=10365, name='Sandhiya', salary=50000.0}
After salary rise: Employee{id=10365, name='Sandhiya', salary=56000.0}
  
  
  */

