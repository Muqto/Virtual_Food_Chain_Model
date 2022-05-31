
public class Staff extends IncomeTaxPayer {

	private int salaryPerHour;
	final private int incomeTaxPercentage = 25;

	public Staff(String name, boolean isCook) {
		/* TODO: Add your code here */
		/* TODO: Also edit the super call */
		super(name);
		if(isCook) {
			this.salaryPerHour = 20; //cook is paid 20$/h
		}
		else {
			this.salaryPerHour = 10; // other staffs are paid 10$/hour
		}
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public int getIncomeTaxPercentage() {
		return incomeTaxPercentage;
	}

	public double workHours(int numHours) {// **increase the salary of the staff depending on the hours in a shift???
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		double moneyEarned = numHours * getSalaryPerHour();
		super.setIncome(super.getIncome() + moneyEarned);
		return moneyEarned;
	}

	@Override
	public double calculateIncomeTax() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		double tax = super.getIncome() * getIncomeTaxPercentage()/100;
		return tax;
	}

}
