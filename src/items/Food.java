package items;

import java.util.ArrayList;

import interfaces.Consumable;

public class Food extends Potion implements Consumable {

	private String[] names = { "Loaf of Bread", "Stew", "Apple Pie", "Mutton Chunk", "Flagon of Mead" };
	private ArrayList<Item> ingredients = new ArrayList<Item>();

	public ArrayList<Item> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<Item> ingredients) {
		this.ingredients = ingredients;
	}

	public Food() {
		setHealAmount(RNGesus.nextInt(91) + 10);
		setName(this.names[RNGesus.nextInt(this.names.length)]);
		setValue();
	}

	public Food(String name, int value, int healAmount, ArrayList<Item> ingredients) {
		super(name, value, healAmount);
		setIngredients(ingredients);
	}

	public void setValue() {
		setValue(this.healAmount / 2);
	}
}