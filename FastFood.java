
import java.util.ArrayList;
import java.util.List;

public class FastFood extends FoodPlace {

    private List<Staff> staff = new ArrayList<>();

    public FastFood(String name, double fixedCosts, Owner owner, List<Staff> staff) {
        /* TODO: Add your code here */
        /* TODO: Also edit the super call */
        super(name, fixedCosts, owner);
        this.staff = new ArrayList<Staff>(staff);
    }

    public List<Staff> getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name of FastFood: " + this.getName() +
                "\n" + "Owner: " + this.getOwner());
        int index = 1;
        for (Staff staff: staff) {
            builder.append("\n" + "Staff " + index++ + " : " + staff );
        }
        return builder.toString();
    }

    @Override
    public void workShift(int hours) {
        /* TODO: Add your code here */
    	for(Staff i : getStaff()) {
    		double expense = i.workHours(hours);
    		super.getOwner().setSalaryExpenses(super.getOwner().getSalaryExpenses() + expense);
    	}
    }

    @Override
    public List<IncomeTaxPayer> getIncomeTaxPayers() {
        /* TODO: Add your code here */
        /* TODO: Also remove return statement below*/
    	ArrayList<IncomeTaxPayer> itp = new ArrayList<IncomeTaxPayer>();
    	itp.add(getOwner());
    	for (Staff i : staff) {
    		itp.add(i);
    	}
    	ArrayList<IncomeTaxPayer> sCopy = new ArrayList<IncomeTaxPayer>(itp);
        return sCopy;
    }

    @Override
    public void distributeIncomeAndSalesTax(Check check) {
        /* TODO: Add your code here */
    	int size = staff.size();
    	double income1 = check.getMenuPrice();
    	double tip = check.getTip();
    	super.getOwner().setIncome(super.getOwner().getIncome() + income1);
    	double tipPart = tip/size;
    	for(Staff s : staff) {
    		s.setIncome(s.getIncome() + tipPart);
    		}
    	super.setTotalSalesTax(super.getTotalSalesTax() +check.getSalesTax());
    }

    @Override
    public double getTipPercentage() {
        return 0;
    }
}
