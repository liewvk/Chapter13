public class EmployeeManagerSystem {

    static class Employee {
        private String employeeId;
        private String name;
        private double basicSalary;

        public Employee(String employeeId, String name, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            setBasicSalary(basicSalary);
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public double getBasicSalary() {
            return basicSalary;
        }

        public void setBasicSalary(double basicSalary) {
            if (basicSalary >= 0) {
                this.basicSalary = basicSalary;
            } else {
                this.basicSalary = 0;
            }
        }

        public double calculateMonthlyPay() {
            return basicSalary;
        }

        public void displayDetails() {
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name        : " + name);
            System.out.printf("Basic Salary: $ %.2f%n", basicSalary);
            System.out.printf("Monthly Pay : $ %.2f%n", calculateMonthlyPay());
        }
    }

    static class Manager extends Employee {
        private String department;
        private double allowance;

        public Manager(String employeeId, String name, double basicSalary,
                       String department, double allowance) {
            super(employeeId, name, basicSalary);
            this.department = department;
            setAllowance(allowance);
        }

        public String getDepartment() {
            return department;
        }

        public double getAllowance() {
            return allowance;
        }

        public void setAllowance(double allowance) {
            if (allowance >= 0) {
                this.allowance = allowance;
            } else {
                this.allowance = 0;
            }
        }

        @Override
        public double calculateMonthlyPay() {
            return getBasicSalary() + allowance;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Department  : " + department);
            System.out.printf("Allowance   : $ %.2f%n", allowance);
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("EMP1001", "Mei Ling", 3500.00);

        Manager manager1 = new Manager(
                "MGR1001",
                "Alex Tan",
                6000.00,
                "Software Development",
                1500.00
        );

        System.out.println("Employee Record");
        System.out.println("---------------");
        employee1.displayDetails();

        System.out.println();

        System.out.println("Manager Record");
        System.out.println("--------------");
        manager1.displayDetails();
    }
}
