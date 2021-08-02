package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator {
	private final static int INCOME_TAX_PERCENTAGE = 15;
	private final static int MIN_ANNUAL_INCOME = 300000;
	public double calculate(Employee employee) {
		if(employee.getMonthlyIncome()<MIN_ANNUAL_INCOME) {
			return 0;
		}
		double tax= (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
        return tax;
	}
}
