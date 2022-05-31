
import java.util.List;
import java.util.ArrayList;

public class Restaurant extends FoodPlace {

	private Staff cook;
	private Server server;

	public Restaurant(String name, double fixedCosts, Owner owner, Staff cook, Server server) {
		/* TODO: Add your code here */
		/* TODO: Also edit the super call */
		super(name, fixedCosts, owner);
		this.cook = cook;
		this.server = server;
		
	}

	public Staff getCook() {
		return cook;
	}

	public Server getServer() {
		return server;
	}

	@Override
	public String toString() {
		return "Name of restaurant: " + this.getName() +
				"\n" + "Owner: " + this.getOwner() +
				"\n" + "Cook: " + cook +
				"\n" + "Server: " + server;
	}

	@Override
	public void workShift(int hours) {
		/* TODO: Add your code here */
		double expense1 = cook.getSalaryPerHour() * hours;
		double expense2 = server.getSalaryPerHour() * hours;
		cook.setIncome(cook.getIncome() + expense1);
		server.setIncome(server.getIncome() + expense2);
		super.getOwner().setSalaryExpenses(super.getOwner().getSalaryExpenses() + expense1 + expense2);
	}

	@Override
	public List<IncomeTaxPayer> getIncomeTaxPayers() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		ArrayList<IncomeTaxPayer> itp = new ArrayList<IncomeTaxPayer>();
		itp.add(getCook());
		itp.add(getServer());
		itp.add(super.getOwner());
		return itp;
	}

	@Override
	public void distributeIncomeAndSalesTax(Check check) {
		/* TODO: Add your code here */
		double ownerincome = super.getOwner().getIncome();
		super.getOwner().setIncome(ownerincome + check.getMenuPrice()); 
		double tip = check.getTip();
		cook.setIncome(cook.getIncome() + tip * 0.2);
		server.setIncome(server.getIncome() + tip * 0.8);
		super.setTotalSalesTax(super.getTotalSalesTax() + check.getSalesTax()); // i added super.getTotalSalesTax()
	}

	@Override
	public double getTipPercentage() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		return server.getTargetTipPct();
	}

}
