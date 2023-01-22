package cePet;

public final class Pet {

	private String name;
	private Integer age;
	private String species;
	
	public Pet(int Age, String Name, String Species) {
		species = Species;
		name = Name;
		age = Age;
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
	
	@Override
	public String toString() {
		return species + " " + name + " (" + age.toString() + ")";
	}
	
}
