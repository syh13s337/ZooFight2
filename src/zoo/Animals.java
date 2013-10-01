//Rasmus "skriv era namn här och i Main.java
package zoo;

public class Animals {

	protected int legs;
	protected int power;
	protected int type;

	private int speed, selection;
	protected String animalInfo, animal;

	public int selection() {
		return selection;
	}

	public void Animal() {
		legs = 0;
		power = 0;
	}

	public String getAnimal() {
		return animal;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(Integer legs) {
		this.legs = legs;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = (int) power;
	}

	public int speed() {
		speed = legs * power;
		return speed;
	}

	public String fight(int animal1speed, int animal2speed, String animal1,
			String animal2) {
		String winner = "";
		String loser = "";
		
		if (animal1speed > animal2speed) {
			winner = animal1;
			loser = animal2;
		} else{
			winner = animal2;
			loser = animal1;
		}
		String fightResult = winner.toString() + " defeated " + loser.toString();
		return fightResult;
		
		
	}

}
