package game;

import java.util.Scanner;

public class Gawi2 {

	public static void main(String[] args) {
		String [] items = {"gawi", "bawi", "bo"};
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		int choice = Integer.parseInt(next);
		System.out.print("----nº±≈√:" + items[choice]);
	}

}
