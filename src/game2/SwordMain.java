package game2;

public class SwordMain {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "天叢雲剣";
		s.damage = 10;
		SwordHero sh1 = new SwordHero("トナカイ", 100);
		sh1.sword = s;
		System.out.println("現在の武器は" + sh1.sword.name);
		sh1.attack();
		System.out.println(sh1.hp + sh1.name);
		SwordHero sh2 = new SwordHero();
		System.out.println(sh2.name + sh2.hp);

	}

}
