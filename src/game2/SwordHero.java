package game2;

public class SwordHero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	
	public SwordHero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public SwordHero() {
		this("ダミー", 100);
	}

}
