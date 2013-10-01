//Rasmus 

package zoo;

import zoo.Animals;

public class Main {

	public static void main(String[] args) {
		Gazelle gazelle = new Gazelle();
		Crocodile crocodile = new Crocodile();
		Animals interaction = new Animals();
		String winner = interaction.fight(gazelle.speed(), crocodile.speed(),
				gazelle.getAnimal(), crocodile.getAnimal());
		System.out.println(winner);


		// skapa paket, importa animals, använd inteeraction
		// fight(animal1.getpower)

	}

}
