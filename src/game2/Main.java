package game2;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.hp);
		Hero h2 = new Hero("アサカ");
		h2.hp = 100;
		Hero h3 = new Hero();
		System.out.println(h3.name);
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}

}
