package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 13;
		if (n == 0 || n == 1) {
			System.out.println("Given number is not an prime number");
		} else {
			int flag = 0;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println("Given number is not an prime number");
					flag = 1;
					break;
				}

			}

			if (flag == 0) {
				System.out.println("Given number is prime number");
			}

		}
	}

}
