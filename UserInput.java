import java.util.Scanner;

class UserInput {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Username: ");

		String userName = myObj.nextLine();
		System.out.println("Username: " + userName);
	}
}
