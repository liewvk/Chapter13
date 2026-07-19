public class EmployeeListDemo {

    static class Employee {
        private String employeeId;
        private String name;
        private double basicSalary;

        public Employee(String employeeId, String name, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.basicSalary = basicSalary;
        }

        public double getBasicSalary() {
            return basicSalary;
        }

        public double calculateMonthlyPay() {
            return basicSalary;
        }

        public void displayDetails() {
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name        : " + name);
            System.out.printf("Monthly Pay : $ %.2f%n", calculateMonthlyPay());
        }
    }

    static class Manager extends Employee {
        private double allowance;

        public Manager(String employeeId, String name, double basicSalary, double allowance) {
            super(employeeId, name, basicSalary);
            this.allowance = allowance;
        }

        @Override
        public double calculateMonthlyPay() {
            return getBasicSalary() + allowance;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.printf("Allowance   : $ %.2f%n", allowance);
        }
    }

    static class Developer extends Employee {
        private double projectAllowance;

        public Developer(String employeeId, String name, double basicSalary, double projectAllowance) {
            super(employeeId, name, basicSalary);
            this.projectAllowance = projectAllowance;
        }

        @Override
        public double calculateMonthlyPay() {
            return getBasicSalary() + projectAllowance;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.printf("Project Allowance: $ %.2f%n", projectAllowance);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("EMP1001", "Mei Ling", 3500.00);
        employees[1] = new Manager("MGR1001", "Alex Tan", 6000.00, 1500.00);
        employees[2] = new Developer("DEV1001", "Ravi Kumar", 4500.00, 800.00);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}
