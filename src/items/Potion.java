package items;

import characters.Character;
import interfaces.Consumable;

public class Potion extends Item implements Consumable {
	protected int healAmount;

	public int getHealAmount() {
		return healAmount;
	}

	public void setHealAmount(int healAmount) {
		boolean valid;
		do {
			valid = false;
			if (healAmount <= 9 || healAmount > 100) {
				healAmount = RNGesus.nextInt(91)+10;
			} else {
				this.healAmount = healAmount;
				valid = true;
			}
		} while (valid == false);
	}

	public Potion() {
		setName("Health Potion");
		setHealAmount(RNGesus.nextInt(91)+10);
		setValue(this.healAmount / 10);
	}

	public Potion(String name, int value, int healAmount) {
		super("Health Potion", value);
		setHealAmount(healAmount);
	}

	@Override
	public String toString() {
		return getDescription() + ". It's worth " + getValue();
	}

	@Override
	public void use(Character target) {
		if ((target.getCurrentHP() + getHealAmount()) < target.getBaseHP()) {
			target.setCurrentHP(target.getCurrentHP() + getHealAmount());
		} else {
			target.setCurrentHP(target.getBaseHP());
		}
	}
	
	@Override
	public String getDescription() {
		return getName() + " heals for " + getHealAmount() + " HP";
	}
}