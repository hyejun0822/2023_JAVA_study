
public class Pizza {

	public static void main(String[] args) {
		final double PI = 3.141592;
		double area1 = 2 * PI * 20 * 20;
		double area2 = PI * 30 * 30;
		System.out.println("20cm 피자 2개의 면적 : " + area1);
		System.out.println("30cm 피자 1개의 면적 : " + area2);
		System.out.print((area1>area2)?"20cm 피자 두 개" : "30cm 피자 한 개");
		System.out.println("를 주문하세요.");
	}

}
