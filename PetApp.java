package cePet;

import edu.princeton.cs.algs4.BinarySearchST;

public class PetApp {

	static BinarySearchST<Integer, Pet> st = new BinarySearchST<>();
	
	public static String contains(int key) {
		if (st.contains(key)) {
			return "Pet associated with 10: " + st.get(key).toString();
		}
		return "The key " + key + " was not found in the symbol table.";
	}
	
	public static void main(String[] args) {
		st.put((int)(10+Math.random()*20.0), new Pet(8, "Buddy", "dog"));
		
		Pet[] pets = new Pet[] {
				new Pet (1, "Bailey", "cat"),
				new Pet (2, "Milo", "mouse"),
				new Pet(3,"Otis","mouse"),
                new Pet(4,"Bella","cat"),
                new Pet(5,"Derik","parrot"),
                new Pet(6,"Maggie","dog"),
                new Pet(7,"Ranger","dog"),
                new Pet(8,"Danny","ferret"),
                new Pet(10,"Rosko","dog")
		};
		
		int id = (int)(10+Math.random()*20.0);
		for (Pet pete:pets) {
			while(st.contains(id))
				id = (int)(10+Math.random()*20.0);
			st.put(id, pete);
		}
		
		System.out.println();
		String names = "";
		System.out.print("All keys: ");
		for (Integer i: st.keys()) {
			System.out.print(i + ", ");
			names += st.get(i).getName() + ", ";
		}
		System.out.println();
		System.out.print("All pet names: " + names);
		System.out.println();
		
		System.out.println();
		System.out.println(contains(10));
        System.out.println(contains(17));
        System.out.println(contains(23));

        System.out.println();
        System.out.println("Smallest pet ID: " + st.min());
        System.out.println("Smallest pet ID greater or equal to 17: " + st.ceiling(18));
        System.out.println("Number of pets: " + st.size());
        st.put(30, new Pet(3, "Waldi", "dog"));
        System.out.println("Pet IDs smaller 25: " + st.size(10, 25));
        System.out.println("Pet with ID 30: " + st.get(30));
        System.out.println("Second smallest pet ID: " + st.select(1));
        System.out.println();

        st.put(30, new Pet(3, "Strolch", "Dog"));

        System.out.println(st.get(30));
        System.out.println();

        System.out.println("IDs\tPets\n" +
                "---\t-------------");

        for(Integer i: st.keys()) {
            System.out.println(i + "\t" + st.get(i));
        }

    }
}