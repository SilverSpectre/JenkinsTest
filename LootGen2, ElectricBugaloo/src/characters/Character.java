package characters;

import java.util.Random;

import items.*;

public abstract class Character {
	protected Random RNGesus = new Random();
	protected String name;
	protected int strBase = RNGesus.nextInt(27) + 4;
	protected int strMod = 0;
	protected int intBase = RNGesus.nextInt(27) + 4;
	protected int intMod = 0;
	protected int dexBase = RNGesus.nextInt(27) + 4;
	protected int dexMod = 0;
	protected int baseHP = getStrength() * 10;
	protected int currentHP = baseHP;
	protected Weapon equippedWeapon;
	protected Armor equippedArmor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrBase() {
		return strBase;
	}

	public void setStrBase(int strBase) {
		this.strBase = strBase;
	}

	public int getStrMod() {
		return strMod;
	}

	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}

	public int getStrength() {
		return getStrBase() + getStrMod();
	}

	public int getIntBase() {
		return intBase;
	}

	public void setIntBase(int intBase) {
		this.intBase = intBase;
	}

	public int getIntMod() {
		return intMod;
	}

	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}

	public int getIntelligence() {
		return getIntBase() + getIntMod();
	}

	public int getDexBase() {
		return dexBase;
	}

	public void setDexBase(int dexBase) {
		this.dexBase = dexBase;
	}

	public int getDexMod() {
		return dexMod;
	}

	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}

	public int getDexterity() {
		if (getEquippedArmor() == null) {
			return getDexBase() + getDexMod();
		} else {
			return getDexBase() + getDexMod() + getEquippedArmor().getAgilityModifier();
		}
	}

	public int getBaseHP() {
		return baseHP;
	}

	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		if (currentHP > baseHP) {
			this.currentHP = baseHP;
		} else {
			this.currentHP = currentHP;
		}
	}

	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}

	public void setEquippedWeapon(Weapon equippedWeapon) {
		this.equippedWeapon = equippedWeapon;
	}

	public Armor getEquippedArmor() {
		return equippedArmor;
	}

	public void setEquippedArmor(Armor equippedArmor) {
		this.equippedArmor = equippedArmor;
	}

	public Character() {
	}

	public Character(String name, int strBase, int intBase, int dexBase, int baseHP, Weapon equippedWeapon,
			Armor equippedArmor) {
		setName(name);
		setStrBase(strBase);
		setIntBase(intBase);
		setDexBase(dexBase);
		setBaseHP(baseHP);
		setEquippedWeapon(equippedWeapon);
		setEquippedArmor(equippedArmor);
	}

	public abstract int Attack();

	public abstract int takeDamage(int dmg);

	@Override
	public String toString() {
		return getName() + "\r\nStrength: " + getStrength() + "\r\nIntelligence: " + getIntelligence()
				+ "\r\nDexerity: " + getDexterity() + "\r\nHP: " + getCurrentHP() + "/" + getBaseHP()
				+ "\r\nEquipped Weapon: " + getEquippedWeapon() + "\r\nEquipped Armor: " + getEquippedArmor();
	}
}