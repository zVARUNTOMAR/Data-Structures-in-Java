/* Implementation of Stack Using Array in Java*/

/*Date- 29/Sept/2020 */

package Stack;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int top = -1; // Top Element

	static int stack[] = new int[100];

	// Method to AddElement to Stack
	static void addElement() {

		int data;

		if (isFull()) {
			System.out.println("Stack OverFlow");
			return;
		} else {
			System.out.println("Enter Data to Add:");
			data = sc.nextInt();
			stack[++top] = data;
			return;
		}
	}

	//Method to Remove Element from Stack
	static void removeElement() {

		if (isEmpty()) {
			System.out.println("Stack UnderFlow");
		} else {
			System.out.printf("%d is Deleted", stack[top]);
			top--;
			return;
		}

	}

	//Method to Check Stack is Full or Not
	static boolean isFull() {
		if (top == stack.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	//Method to Check Stack is Empty or Not
	static boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	//Method to Display Stack
	static void display() {

		System.out.println("\nCurrent Stack:");
		for (int i = top; i >= 0; i--) {
			if (i == top) {
				System.out.print(stack[i]);
			} else {
				System.out.print("->" + stack[i]);
			}

		}
	}

	//Method to Return Size of Stack
	static void size() {

		if (isEmpty()) {
			System.out.println("\nStack is Empty");
		} else {
			System.out.println("\nCurrent Stack Size is " + (top + 1));
		}
	}

	public static void main(String[] args) {

		
		//Menu 
		
		while (true) {
			System.out.println("\n\n===MENU===");
			System.out.println("Press 1 to Add Element to Stack:");
			System.out.println("Press 2 to Delete Element from Stack");
			System.out.println("Press 3 to Display Stack");
			System.out.println("Press 4 to get Size of Stack");
			System.out.println("Press 5 to Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				addElement();
				break;

			case 2:
				removeElement();
				break;

			case 3:
				display();
				break;

			case 4:
				size();
				break;
			case 5:
				System.out.println("Exiting....");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
	}
}
