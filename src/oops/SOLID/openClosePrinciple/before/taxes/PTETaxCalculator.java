package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PTETaxCalculator {
	private final static int INCOME_TAX_PERCENTAGE = 20;
	private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
	private final static int EDUCATIONAL_CESS = 1;
	public double calculate(Employee employee) {
		double tax= (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
    	tax=tax+(tax*EDUCATIONAL_CESS)/100;
        return tax;
	}
}
