package practice1.calcapp;

public class Height {
	public static void main(String[] args) {
		int[] heights = {11, 12, 13, 14, 15};
		java.util.Arrays.sort(heights);
		for (int h : heights) {
			System.out.println(h);
		}
	}

}
