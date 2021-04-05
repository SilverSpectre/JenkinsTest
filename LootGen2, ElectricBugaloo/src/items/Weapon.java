package items;

public class Weapon extends Item {
	private int dmgMin = 0;
	protected int dmgMax = 100;
	private String[] names = {"Longsword", "Battleaxe", "Crossbow", "Mace", "Gladius"};

	public int getDmgMin() {
		return dmgMin;
	}

	public void setDmgMin(int dmgMin) {
		boolean valid;
		do {
			valid = false;
			if (dmgMin <= 0 || dmgMin > dmgMax) {
				dmgMin = RNGesus.nextInt(100)+1;
			} else {
				this.dmgMin = dmgMin;
				valid = true;
			}
		} while (valid == false);
	}

	public int getDmgMax() {
		return dmgMax;
	}

	public void setDmgMax(int dmgMax) {
		boolean valid;
		do {
			valid = false;
			if (dmgMax > 100 || dmgMin > dmgMax) {
				dmgMax = RNGesus.nextInt(100)+1;
			} else {
				this.dmgMax = dmgMax;
				valid = true;
			}
		} while (valid == false);
	}
	
	@Override
	public void setValue(int value) {
		boolean valid;
		do {
			valid = false;
			if (value <= 0 || value > 500) {
				value = RNGesus.nextInt(500)+1;
			} else {
				this.value = value;
				valid = true;
			}
		} while (valid == false);
	}

	public Weapon() {
		setName(this.names[RNGesus.nextInt(this.names.length)]);
		setValue(RNGesus.nextInt(500)+1);
		setDmgMin(RNGesus.nextInt(100)+1);
		setDmgMax(RNGesus.nextInt(100)+1);
		
	}

	public Weapon(String name, int value, int dmgMin, int dmgMax) {
		super(name, value);
		setDmgMin(dmgMin);
		setDmgMax(dmgMax);
	}

	@Override
	public String toString() {
		return getName() + ", worth " + getValue() + ", has a minimum damage of " + getDmgMin() + ", and a maximum of "
				+ getDmgMax();
	}
}