package module01_06;
/*
 * 此範例為測試算術運算子功能
 */
public class TestArithmeticOP {
	private int i;
	private float f;
>>>>>>> .merge_file_a13612
	public static void main(String[] args) {
		int num1 = 5, num2 = 2;
		double numD = 7.0;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2 * numD);
		System.out.println(num1 / num2);
		System.out.println(num1 / numD);
		System.out.println(num1 % num2);
		System.out.println("===============");
		
		//以下注意字串相加"+"
		String s1 = "現在是上午";
		int num3 = 10;
		String s2 = "點";
		System.out.println(s1 + num3 + s2);
	}

}
