package items;

import java.util.Random;

public class Item {
	protected String name;
	protected int value;
	protected Random RNGesus = new Random();
	private String[] names = {"Bear Pelt", "Smoothstone", "Empty Quiver", "Pocketwatch", "Rope", "Bundle of Herbs"};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		boolean valid;
		do {
			valid = false;
			if (name != null) {
				this.name = name;
				valid = true;
			}
		} while (valid == false);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		boolean valid;
		do {
			valid = false;
			if (value < 0 || value > 25) {
				value = RNGesus.nextInt(26);
			} else {
				this.value = value;
				valid = true;
			}
		} while (valid == false);
	}

	public Item() {
		setName(names[RNGesus.nextInt(names.length)]);
		setValue(RNGesus.nextInt(26));
	}

	public Item(String name, int value) {
		setName(name);
		setValue(value);
	}
	
	@Override
	public String toString() {
		return getName() + ", worth " + getValue();
	}
}