package Task10;

// QUS:7

public class Polymorphism {

	public static void main(String[] args) {

		// Greentea2 G2= new Greentea2();
		// G2.flavor();
		// System.out.println();

		Tea2[] teaClass = new Tea2[3];
		teaClass[0] = new Tea2();

		teaClass[1] = new Greentea2();

		teaClass[2] = new Blacktea2();

		System.out.println("The output Value is:" + "\n");

		for (Tea2 x : teaClass) {

			System.out.println(x.getflavour());

		}

	}

}

/*

The output Value is:

Normal tea
Green tea
Black tea2

 
 
 
 
 */
