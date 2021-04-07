package items;

import characters.Character;
import interfaces.Consumable;

public class ThrownThing extends Weapon implements Consumable {
	private int dmgMin = 0;
	private int dmgMax = 20;
	private String[] names = {"Rock", "Bottle", "Dart", "Small Knife", "Really Bad Boomerang"};
	
	public ThrownThing() {
		setName(this.names[RNGesus.nextInt(this.names.length)]);
		setValue(RNGesus.nextInt(100)+1);
		setDmgMin(RNGesus.nextInt(20)+1);
		setDmgMax(RNGesus.nextInt(20)+1);
	}

	public ThrownThing(String name, int value, int dmgMin, int dmgMax) {
		super(name, value, dmgMin, dmgMax);
	}
	
	@Override
	public void setValue(int value) {
		boolean valid;
		do {
			valid = false;
			if (value <= 0 || value > 100) {
				value = RNGesus.nextInt(100)+1;
			} else {
				this.value = value;
				valid = true;
			}
		} while (valid == false);
	}
	
	@Override
	public void setDmgMin(int dmgMin) {
		dmgMax = 20;
		boolean valid;
		do {
			valid = false;
			if (dmgMin <= 0 || dmgMin > dmgMax) {
				dmgMin = RNGesus.nextInt(10)+1;
			} else {
				this.dmgMin = dmgMin;
				valid = true;
			}
		} while (valid == false);
	}
	
	@Override
	public void setDmgMax(int dmgMax) {
		boolean valid;
		do {
			valid = false;
			if (dmgMax < dmgMin || dmgMax > 20) {
				dmgMax = RNGesus.nextInt(20)+1;
			} else {
				this.dmgMax = dmgMax;
				valid = true;
			}
		} while (valid == false);
	}

	@Override
	public void use(Character target) {
		target.setCurrentHP(target.getCurrentHP() - RNGesus.nextInt(getDmgMax() - getDmgMin()) + getDmgMin());
	}

	@Override
	public String getDescription() {
		return getName() + ", worth " + getValue() + ", has a minimum damage of " + getDmgMin() + ", and a maximum of "
				+ getDmgMax();
	}
	
	@Override
	public String toString() {
		return getDescription() + ". It must be thrown";
	}

}