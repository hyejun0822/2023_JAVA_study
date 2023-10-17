import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

enum Type {
	MEAT, FISH, OTHER
}

public class Test {

	public static void main(String[] args) {
		List<Food> menu = new ArrayList<>();
		
		menu.add(new Food("Salad", true , 150, Type.OTHER));
		menu.add(new Food("Chicken", false, 350, Type.MEAT));
        menu.add(new Food("Fish", false, 250, Type.FISH));
        menu.add(new Food("Broccoli", true, 80, Type.OTHER));
        
        List<String> veggieLowCarlorieFoods = menu.stream()
        		.filter(food -> food.getCalories() <= 300 && food.isVege())
        		.map(Food :: getName)
        		.collect(Collectors.toList());
        
        veggieLowCarlorieFoods.forEach(System.out::println);
	}

}
