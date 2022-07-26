package practice1;

public class Escape {
	public static void main(String[] args) {
		System.out.println("お好きなすしのネタの番号を入力してください");
		System.out.println("1：まぐろ　2：えび　3：こはだ");
		int sushi = new java.util.Scanner(System.in).nextInt();
		switch (sushi) {
		case 1:
			System.out.println("吉");
			break;
		case 2:
			System.out.println("大吉");
			break;
		case 3:
			System.out.println("小吉");
			break;
		}
	}

}