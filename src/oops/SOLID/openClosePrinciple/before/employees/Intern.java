package oops.SOLID.openClosePrinciple.before.employees;

public class Intern extends Employee {
	private final static String TYPE = "Intern";
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }
}
