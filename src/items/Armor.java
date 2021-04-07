package items;

public class Armor extends Item {
	private int armorRating;
	private int damageReduction;
	private int agilityModifier;
	private String[] names = { "Helm", "Chestplate", "Bracers", "Greaves", "Boots" };

	public int getArmorRating() {
		return armorRating;
	}

	public void setArmorRating(int armorRating) {
		boolean valid;
		do {
			valid = false;
			if (armorRating < 8 || armorRating > 17) {
				// System.out.println("Invalid input, regenerating random value...(AR)(" + value
				// + ")\r\n");
				armorRating = RNGesus.nextInt(10) + 8;
			} else {
				this.armorRating = armorRating;
				valid = true;
			}
		} while (valid == false);
	}

	public int getDamageReduction() {
		return damageReduction;
	}

	public void setDamageReduction(int damageReduction) {
		boolean valid;
		do {
			valid = false;
			if (damageReduction < 0 || damageReduction > 10) {
				// System.out.println("Invalid input, regenerating random value...(DmgRedu)(" +
				// value + ")\r\n");
				damageReduction = RNGesus.nextInt(11);
			} else {
				this.damageReduction = damageReduction;
				valid = true;
			}
		} while (valid == false);
	}

	public int getAgilityModifier() {
		return agilityModifier;
	}

	public void setAgilityModifier(int agilityModifier) {
		boolean valid;
		do {
			valid = false;
			if (agilityModifier < -6 || agilityModifier > 0) {
				// System.out.println("Invalid input, regenerating random value...(AgilMod)(" +
				// value + ")\r\n");
				agilityModifier = RNGesus.nextInt(7) - 6;
			} else {
				this.agilityModifier = agilityModifier;
				valid = true;
			}
		} while (valid == false);
	}

	@Override
	public void setValue(int value) {
		boolean valid;
		do {
			valid = false;
			if (value < 10 || value > 5000) {
				// System.out.println("Invalid number, regenerating random
				// value...(ArmorValue)(" + value + ")\r\n");
				value = RNGesus.nextInt(1491) + 10;
			} else {
				this.value = value;
				valid = true;
			}
		} while (valid == false);
	}

	public Armor() {
		setName(this.names[RNGesus.nextInt(this.names.length)]);
		setValue(RNGesus.nextInt(1491) + 10);
		setArmorRating(RNGesus.nextInt(10) + 8);
		setDamageReduction(RNGesus.nextInt(10) + 1);
		setAgilityModifier(RNGesus.nextInt(7) - 6);
	}

	public Armor(String name, int value, int armorRating, int damageReduction, int agilityModifier) {
		super(name, value);
		setArmorRating(armorRating);
		setDamageReduction(damageReduction);
		setAgilityModifier(agilityModifier);
	}

	@Override
	public String toString() {
		return getName() + ", worth " + getValue() + ", has an AR of " + getArmorRating() + ", a damage reduction of "
				+ getDamageReduction() + ", and an agility modifier of " + getAgilityModifier();
	}
}