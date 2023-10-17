interface ArrayProcessing {
	double apply (double[] array);
}

public class LambdaTest {
	
	public static final ArrayProcessing maxer = array -> {
		if (array.length == 0) {
			return Double.NaN;
		}
		double max = array[0];
		for (double num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	};
	
	public static final ArrayProcessing miner = array -> {
		if (array.length == 0) {
			return Double.NaN;
		}
		double min = array[0];
		for (double num : array) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	};
	
	public static final ArrayProcessing sumer = array -> {
		if (array.length == 0) {
			return Double.NaN;
		}
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		return sum / array.length;
	};
	public static void main(String[] args) {
		double[] numbers = { 12.5, 6.8, 21.0, 8.4};
		double maxResult = maxer.apply(numbers);
		System.out.println("최대값 : " + maxResult);
		double minResult = miner.apply(numbers);
		System.out.println("최솟값 : " + minResult);
		double sumResult = sumer.apply(numbers);
		System.out.println("평균값 : " + sumResult);

	}

}
