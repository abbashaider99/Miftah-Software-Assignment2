/*Create a class named 'Member' having the following members:
Data members
- Name
- Age
- Phone number
- Address
- Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/

class Employee extends Member {
    String specialization;
    String department;

}

class Manager extends Member {
    String specialization;
    String department;
}

class Member {
    int age, salary;
    String name, phone, address;

    public void printSalary() {

        System.out.println(
                "Name: " + name + " Salary: " + salary + " Age: " + age + " Phone: " + phone + " Address: " + address);
    }

    public static void main(String[] args) {
        Member m = new Member();
        Employee e = new Employee();
        Manager mg = new Manager();

        // assinging values to the Employee
        e.name = "Abbas";
        e.age = 22;
        e.address = "Delhi";
        e.phone = "9456916070";
        e.salary = 50000;

        // assigning values to the Manager
        mg.name = "Raza";
        mg.age = 24;
        mg.address = "Noida";
        mg.phone = "9517771770";
        mg.salary = 45000;

        // printing the values
        e.printSalary();
        mg.printSalary();
    }
}
