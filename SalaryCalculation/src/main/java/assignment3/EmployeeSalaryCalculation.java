/**
 * 
 */
package assignment3;

/**
 * @author chira
 *
 */
public class EmployeeSalaryCalculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Employee Employee1 = new Employee();
		Employee1.employeeLevel = 1;
		Employee1.basicPay = 15000;
		Employee1.boa = 17000;
		Employee1.bonus = 4000;
		Employee1.isNewTaxRate = false;

		Employee1.pf = Employee1.caluculatePF();

		System.out.println("pf is " + Employee1.pf);

		Employee1.monthlyGross = Employee1.caluculateMonthlyGross();

		System.out.println("monthlyGross is " + Employee1.monthlyGross);

		Employee1.yearlyGross = Employee1.caluculateYearlyGross();
		System.out.println("yearlyGross is " + Employee1.yearlyGross);
		
		Employee1.calculateTaxRate();
		System.out.println("oldTaxRate is " + Employee1.oldTaxRate);
		System.out.println("newTaxRate is " + Employee1.newTaxRate);
		
		Employee1.yearlyTax = Employee1.caluculateYearlyTax();
		System.out.println("yearlyTax is " + Employee1.yearlyTax);

		Employee1.monthlyTax = Employee1.caluculateMonthlyTax();
		System.out.println("monthlyTax is " + Employee1.monthlyTax);

		Employee1.MonthlyTakeHomeSalary = Employee1.caluculateMonthlyTakeHome();
		System.out.println("monthlyTakeHome is " + Employee1.MonthlyTakeHomeSalary);

	}

}
