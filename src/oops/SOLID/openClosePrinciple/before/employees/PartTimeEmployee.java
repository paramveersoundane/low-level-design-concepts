package oops.SOLID.openClosePrinciple.before.employees;

public class PartTimeEmployee extends Employee {
	private final static String TYPE = "PTE";
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }
}