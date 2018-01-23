import java.util.Scanner;

public class NewGitDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String userName = scan.nextLine();
		System.out.println("Your name is " + userName);
		scan.close();
	}

}
