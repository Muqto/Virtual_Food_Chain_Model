
public class Try {

	public static void main(String[] args) {
		WorkingOwner owner = new WorkingOwner("Mike", 15);
		FoodStand hotdog = new FoodStand("hot dog stand", 500, owner);
		Check bill = new Check(5);
		
		FoodStand botdog = new FoodStand("hot dog stand", 500, owner);
		
		
		Owner Amara = new Owner("Amara");
		Staff Sade = new Staff("Sade", false);
		Server Nia = new Server("Nia", 20);
		Restaurant MamaAfrica = new Restaurant("Mama Africa", 1200, Amara, Sade, Nia);
		
		hotdog.equals(MamaAfrica);
		
		System.out.println(hotdog.equals(MamaAfrica));

	}

}
