
import java.util.List;

public abstract class FoodPlace {

    private static int currentMaxFoodPlaceID;
    private int foodPlaceID;
    private String name;
    private double fixedCosts;
    private double totalSalesTax;
    private Owner owner;

    public FoodPlace(String name, double fixedCosts, Owner owner){
        /* TODO: Add your code here */
    	this.name = name;
    	this.fixedCosts = fixedCosts;
    	this.owner = owner;
    	currentMaxFoodPlaceID++;
    	this.foodPlaceID = currentMaxFoodPlaceID;
    	owner.setFoodPlace(this);
    }

    public static int getCurrentMaxFoodPlaceID() {
        return currentMaxFoodPlaceID;
    }

    public int getFoodPlaceID() {
        return foodPlaceID;
    }

    public String getName() {
        return this.name;
    }

    public double getFixedCosts() {
        return this.fixedCosts;
    }

    public double getTotalSalesTax() {
        return this.totalSalesTax;
    }

    public void setTotalSalesTax(double totalSalesTax) {
        this.totalSalesTax = totalSalesTax;
    }

    public Owner getOwner() {
        return this.owner;
    }

    @Override
    public boolean equals(Object obj) {
        /* TODO: Add your code here */
        /* TODO: Also remove return statement below*/
    	
    	if(obj instanceof FoodPlace) {
    		final FoodPlace f = (FoodPlace) obj;
        	if(this.getFoodPlaceID() == f.getFoodPlaceID()) {
        		return true;
        	}
    	}
    	
    	return false;
    }

    abstract void workShift(int hours);

    abstract List<IncomeTaxPayer> getIncomeTaxPayers();

    abstract void distributeIncomeAndSalesTax(Check check);

    abstract double getTipPercentage();
}
