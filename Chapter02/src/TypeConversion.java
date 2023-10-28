public class TypeConversion {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 1/5;
		System.out.println(f); // 1/5는 피연산자가 정수이므로, 정수 연산으로 계산되어서 0이 된다. 이것이 double형 변수로 대입 -> 올림 변환
		
		f = (double)1/5;
		System.out.println(f);
		
		i = (int)1.7 + (int) 1.8;
		System.out.println(i);

	}

}
