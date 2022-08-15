package game2;

public class Wizard {
	String name;
	int hp;
	public void heal(SwordHero sh) {
		sh.hp += 10;
		System.out.println(sh.name + "のHPを10回復した！");
	}

}
