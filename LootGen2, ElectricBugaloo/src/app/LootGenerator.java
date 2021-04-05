package app;

import java.util.ArrayList;
import java.util.Random;

import items.*;
import characters.*;
import lib.ConsoleIO;

public class LootGenerator {

	private static Random RNGesus = new Random();
	private static ArrayList<Item> pool = new ArrayList<Item>();

	public static void Run() {
		boolean exit;
		String[] options = { "Generate 1 Loot Item", "Generate Some Loot Items", "Generate 'N' Loot Items",
				"Demonstrate Consumables" };
		do {
			exit = false;
			int choice = ConsoleIO.promptForMenuSelection(options, true);
			switch (choice) {
			case 0:
				exit = true;
				break;
			case 1:
				Generate(1);
				break;
			case 2:
				Generate(RNGesus.nextInt(10) + 1);
				break;
			case 3:
				int n = ConsoleIO.promptForInt("How much lewt do you want? (between 1 and 10 inclusive)", 1, 10);
				Generate(n);
				break;
			case 4:
				Demonstrate();
				break;
			}
			pool.removeAll(pool);
		} while (!exit);
	}

	private static void Generate(int n) {
		int counter = 0;
		do {
			Item e = null;
			int lewtGod = RNGesus.nextInt(7);
			switch (lewtGod) {
			case 0:
				e = new Item();
				break;
			case 1:
				e = new Weapon();
				break;
			case 2:
				e = new Potion();
				break;
			case 3:
				e = new Armor();
				break;
			case 4:
				e = new Food();
				break;
			case 5:
				e = new ThrownThing();
				break;
			case 6:
				e = new QuestItem();
				break;
			}
			pool.add(e);
			counter += 1;
		} while (counter < n);
		for (Item i : pool) {
			System.out.println(i);
		}
	}

	private static void Demonstrate() {
		Adventurer hero = new Adventurer();
		System.out.println("\r\n" + hero.toString());

		Monster villain = new Monster();
		System.out.println("\r\n" + villain.toString());

		Item item = new Item();
		System.out.println("\r\n" + item.toString());

		Weapon weapon = new Weapon();
		System.out.println("\r\n" + weapon.toString());
		hero.setEquippedWeapon(weapon);
		System.out.println(hero.toString());

		Armor armor = new Armor();
		System.out.println("\r\n" + armor.toString());
		hero.setEquippedArmor(armor);
		System.out.println(hero.toString());

		System.out.println("\r\nFor demonstation, I'm dropping the hero's HP to 1");
		hero.setCurrentHP(1);
		System.out.println("\r\n" + hero.toString());

		Potion potion = new Potion();
		System.out.println("\r\n" + potion.toString());
		potion.use(hero);
		System.out.println(hero.toString());

		Food food = new Food();
		System.out.println("\r\n" + food.toString());
		food.use(hero);
		System.out.println(hero.toString());

		QuestItem questItem = new QuestItem();
		System.out.println("\r\n" + questItem.toString());
		questItem.use(hero);

		ThrownThing rock = new ThrownThing();
		System.out.println("\r\n" + rock.toString());
		rock.use(villain);
		System.out.println(villain.toString() + "\r\n");
	}
}