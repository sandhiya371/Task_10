package Task10;

// QUS:5


public class Tea {
	private boolean isTeaPrepared;
	private boolean hasMilk;
	private boolean hasSugar;

	// Constructor
	public Tea() {
		this.isTeaPrepared = false;
		this.hasMilk = false;
		this.hasSugar = false;
	}

	// Method to prepare basic tea
	public void prepareTea() {
		if (!isTeaPrepared) {
			System.out.println("Basic tea is prepared with hot water and tea leaves.");
			isTeaPrepared = true;
		} else {
			System.out.println("Tea is already prepared.");
		}
	}

	// Method to add milk
	public void addMilk() {
		if (isTeaPrepared && !hasMilk) {
			System.out.println("Milk is added to the tea.");
			hasMilk = true;
		} else {
			System.out.println("Milk can only be added to prepared tea.");
		}
	}

	// Method to add sugar
	public void addSugar() {
		if (isTeaPrepared && !hasSugar) {
			System.out.println("Sugar is added to the tea.");
			hasSugar = true;
		} else {
			System.out.println("Sugar can only be added to prepared tea.");
		}
	}

	// Main method for demonstration
	public static void main(String[] args) {
		Tea tea = new Tea();

		tea.prepareTea();
		tea.addMilk();
		tea.addSugar();
		tea.addSugar();
		; // Trying to add sugar again
	}
}

/*
Output:

Basic tea is prepared with hot water and tea leaves.
Milk is added to the tea.
Sugar is added to the tea.
Sugar can only be added to prepared tea.
*/