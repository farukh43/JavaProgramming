package class19;
// Cat  ct = (Cat) an;
//-----------------------
//A     b     c    d


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingObjects2 {

	public static void main(String[] args) {
		// Rule 1 : Conversion is valid or not
		// the type of 'd' and 'c' must have some relationship (either parent to child OR child to parent)
		
//		Animal an = new Dog();
//		Cat ct=(Cat) an; // valid as per rule 1
//		
//		Dog dg = new Dog();
//		Cat ct=(Cat)dg; // Invalid as per Rule 1
	
		// Rule 2 : Assignment is valid or Not
		// 'C' must be either same or Child of 'A'
		
		//Animal an= new Dog();
		//Cat ct=(Cat) an; //Valid as per rule 2
		
		//Animal an= new Dog();
		//Cat ct=(Dog) an; //Invalid as per Rule 2
		
		//Rule 3
		//The underlying object type of 'd' must be either same or child of 'C'
		//Animal an= new Dog();
		//Cat ct =(Cat) an; // Invalid as per rule 3
	
		//Rule 1, rule 2, Rule 3
		//Animal an = new Dog();
		//Dog dg =(Dog) an; //rule1- yes , rule - 2, rule 3
		
		
	}

}
