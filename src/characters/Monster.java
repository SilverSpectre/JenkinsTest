package characters;

import java.util.ArrayList;

import items.*;

public class Monster extends Character {

	private int expDrop;
	private ArrayList<Item> lootDrop;

	private String[] names = { "Bandit", "Marauder", "Cutthroat", "Vagabond", "Thief" };

	public int getExpDrop() {
		return expDrop;
	}

	public void setExpDrop(int expDrop) {
		this.expDrop = expDrop;
	}

	public ArrayList<Item> getLootDrop() {
		return lootDrop;
	}

	public void setLootDrop(ArrayList<Item> lootDrop) {
		this.lootDrop = lootDrop;
	}

	public Monster() {
		setName(names[RNGesus.nextInt(names.length)]);
		setExpDrop(RNGesus.nextInt(50) + 1);
	}

	public Monster(String name, int strBase, int intBase, int dexBase, int baseHP, Weapon equippedWeapon,
			Armor equippedArmor, int expDrop, ArrayList<Item> lootDrop) {
		super(name, strBase, intBase, dexBase, baseHP, equippedWeapon, equippedArmor);
		setExpDrop(expDrop);
		setLootDrop(lootDrop);
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
				+ "\r\nWorth " + getExpDrop() + " XP";
	}
}