package characters;

import items.Armor;
import items.Weapon;

public class Adventurer extends Character {

	private boolean arrowInKnee;
	private int exp;
	@SuppressWarnings("unused")
	private boolean isFrench;

	private String[] names = { "Gethryc", "Adventuer", "Lune", "Strider", "Guardian" };

	public boolean isFrench() {
		if (name.equals("Adventuer")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isArrowInKnee() {
		return arrowInKnee;
	}

	public void setArrowInKnee(boolean arrowInKnee) {
		this.arrowInKnee = arrowInKnee;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setFrench(boolean isFrench) {
		this.isFrench = isFrench;
	}

	public Adventurer() {
		setName(names[RNGesus.nextInt(names.length)]);
		setArrowInKnee(false);

	}

	public Adventurer(String name, int strBase, int intBase, int dexBase, int baseHP, Weapon equippedWeapon,
			Armor equippedArmor, boolean arrowInKnee) {
		super(name, strBase, intBase, dexBase, baseHP, equippedWeapon, equippedArmor);
		this.arrowInKnee = arrowInKnee;
	}

	@Override
	public int Attack() {
		return getStrength() + RNGesus.nextInt(getEquippedWeapon().getDmgMax() - getEquippedWeapon().getDmgMin())
				+ getEquippedWeapon().getDmgMin();
	}

	@Override
	public int takeDamage(int dmg) {
		int taken = dmg - getEquippedArmor().getDamageReduction();
		if (taken >= 0) {
			return 0;
		} else {
			return taken;
		}
	}

	@Override
	public String toString() {
		return getName() + "\r\nStrength: " + getStrength() + "\r\nIntelligence: " + getIntelligence()
				+ "\r\nDexerity: " + getDexterity() + "\r\nHP: " + getCurrentHP() + "/" + getBaseHP()
				+ "\r\nEquipped Weapon: " + getEquippedWeapon() + "\r\nEquipped Armor: " + getEquippedArmor()
				+ "\r\nArrow in Knee: " + isArrowInKnee();
	}
}