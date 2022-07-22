package practice1;

public class Escape {
	public static void main(String[] args) {
		double triangleArea = calcSquareArea(10.0, 5.0);
		System.out.println("正方形の面積：" + triangleArea + "㎠");
		
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積：" + circleArea + "㎠");
	}
	
	public static double calcSquareArea(double bottom, double height) {
		double area = (bottom * height);
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
