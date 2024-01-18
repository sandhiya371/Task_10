package Task10;

// QUS:6 

public class Teamaker1 extends Hearbaltea {

	public static void main(String[] args) {
		System.out.println("The output will be:" + "\n");
		
		System.out.println("*** The result of Black Tea ***");
		Blacktea b = new Blacktea();
		b.preparetea();
		System.out.println("-------------------------------------------------------------------------------");
		
		
		System.out.println("*** The result of Green Tea ***" + "\n");
		Greentea g = new Greentea();
		g.preparetea();
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("*** The result of Hearbal Tea ***" + "\n");

		Hearbaltea h = new Hearbaltea();
		h.preparetea();
		System.out.println("-------------------------------------------------------------------------------");

	}

}

/*
  
// Subclass created for Tea1 class are Black tea, Green tea and Herbal tea classes has been created 
 
 
The output will be:

*** The result of Black Tea ***
Prepare a hot water
Add black tea leaves
Boil it for 3-5 minutes
Filter the tea leaves and serve it
-------------------------------------------------------------------------------
*** The result of Green Tea ***

Prepare a hot water
Add Green tea leaves
Boil it for 3-5 minutes
Filter the tea leaves and serve it
-------------------------------------------------------------------------------
*** The result of Herbal Tea ***

Prepare a hot water
Add Hearbal tea Mix
Boil it for 3-5 minutes
Filter the tea waste and serve it
-------------------------------------------------------------------------------

 */
