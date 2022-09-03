package game4;

public class Item {
	public static void main(String[] args) {
		Item[] items = { new Item(), new Item(), new Item() };
		int u = items.length;
		do {
			System.out.println(u-- + " ");
		} while (u > 0);
	}

}
