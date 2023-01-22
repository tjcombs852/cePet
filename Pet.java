package cePet;

public final class Pet {

	private String name;
	private Integer age;
	private String species;
	
	public Pet(int Age, String Name, String Species, String color) {
		species = Species;
		name = Name;
		age = Age;
		color = Color;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return species + " " + name + color + " (" + age.toString() + ")";
	}
	
}
