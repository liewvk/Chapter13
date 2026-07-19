public class DeveloperDemo {

    static class Employee {
        private String employeeId;
        private String name;
        private double basicSalary;

        public Employee(String employeeId, String name, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.basicSalary = basicSalary;
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

    static class Developer extends Employee {
        private String programmingLanguage;
        private double projectAllowance;

        public Developer(String employeeId, String name, double basicSalary,
                         String programmingLanguage, double projectAllowance) {
            super(employeeId, name, basicSalary);
            this.programmingLanguage = programmingLanguage;
            this.projectAllowance = projectAllowance;
        }

        @Override
        public double calculateMonthlyPay() {
            return getBasicSalary() + projectAllowance;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Language    : " + programmingLanguage);
            System.out.printf("Allowance   : $ %.2f%n", projectAllowance);
        }
    }

    public static void main(String[] args) {
        Developer developer1 = new Developer(
                "DEV1001",
                "Ravi Kumar",
                4500.00,
                "Java",
                800.00
        );

        developer1.displayDetails();
    }
}
