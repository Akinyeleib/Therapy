import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Tweets {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String user [] = sc.nextLine().split(" ");
		ArrayList <String> opened = new ArrayList<>();

		int N = Integer.parseInt(user[0]);
		int K = Integer.parseInt(user[1]);

		for (int i = 0; i < K; i++) {
			String user_input = sc.nextLine();
			if (user_input.equals("CLOSEALL")) {
				opened.clear();
			} else {
				if (opened.contains(user_input)) {
					opened.remove(user_input);
				} else {
					opened.add(user_input);
				}
			}
			System.out.println(opened.size());
		}


	}

}

