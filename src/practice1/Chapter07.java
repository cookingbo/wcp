package practice1;

public class Chapter07 {
	public static void main(String[] args) {
		String color = "purple";
		switch (color) {
		case "yellow":
			System.out.println("黄色信号です");
			break;
		case "red":
			System.out.println("赤信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}

}
