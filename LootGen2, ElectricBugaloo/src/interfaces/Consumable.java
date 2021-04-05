package interfaces;

import characters.Character;

public interface Consumable {
	
	public void use(Character target);
	
	public String getDescription();
}
