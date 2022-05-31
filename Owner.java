
public class Owner extends IncomeTaxPayer {

	final private int incomeTaxPct = 10;
	private double salaryExpenses;

	private FoodPlace foodPlace;

	public Owner(String name) {
		/* TODO: Add your code here */
		/* TODO: Also edit the super call */
		super(name);
		
	}

	public int getIncomeTaxPct() {
		return incomeTaxPct;
	}

	public double getSalaryExpenses() {
		return salaryExpenses;
	}

	public void setSalaryExpenses(double salaryExpenses) {
		this.salaryExpenses = salaryExpenses;
	}

	public void setFoodPlace(FoodPlace foodPlace) {
		this.foodPlace = foodPlace;
	}
	public FoodPlace getFoodPlace() {
		return foodPlace;
	}
	

	@Override
	public double calculateIncomeTax() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		double income = super.getIncome();
		double expense = getSalaryExpenses() + foodPlace.getFixedCosts();
		if (income - expense <0) {
			return 0;
		}
		else {
			return (income - expense)*incomeTaxPct/100;
		}
	}
}
