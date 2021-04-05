package items;

import characters.Character;
import interfaces.Consumable;

public class QuestItem extends Item implements Consumable {

	private boolean priority;
	private String[] quests = {"Lithomancer", "Royal Delivery", "Dragonslayer", "Warrior of Stone"};
	private String quest;
	private String[] names = {"Stone of Serendipity", "King's Jewel", "Red Dragon's Tooth", "Sword of Stone"};

	
	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public QuestItem() {
		int questNum = RNGesus.nextInt(this.quests.length);
		setName("The " + this.names[questNum]);
		setValue(0);
		setQuest(this.quests[questNum]);
		setPriority(false);
	}

	public QuestItem(String name, int value, boolean priority, String quest) {
		super(name, value);
		setPriority(priority);
		setQuest(quest);
	}

	@Override
	// TODO
	public void use(Character target) {
		if (target.getName().equals(getQuest())) {
			System.out.println("Congratulations, you've completed the quest");
		} else {
			System.out.println("This item is essential in another quest");
		}
	}

	@Override
	public String getDescription() {
		return getName() + ", of the \"" + getQuest() + "\" quest";
	}
	
	@Override
	public String toString() {
		return getDescription() + ". It's too important to be sold";
	}
}