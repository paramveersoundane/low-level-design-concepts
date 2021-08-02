package oops.SOLID.openClosePrinciple.before.employees;

public class FullTimeEmployee extends Employee {
	private final static String TYPE = "FTE";
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }
}
