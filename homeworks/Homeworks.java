package homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.function.Predicate;

import static java.lang.Math.abs;


class Homework {
	public static void task8_14() {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int x = scanner.nextInt();
			if ((x / 10) > (x % 10)) System.out.println("Первая цифра больше второй");
			else System.out.println("Вторая цифра больше первой");
		}
	}

	public static void task8_15() {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int n = scanner.nextInt();

			int a1 = n / 10;
			int a2 = n % 10;

			if (a1 > a2) {
				System.out.println("Первая цифра больше, чем вторая");
			} else if (a2 > a1) {
				System.out.println("Вторая цифра больше, чем первая");
			}

		}
	}

	public static void task8_22() {
		System.out.println("Task #8.22");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			if (n % 2 == 0) {
				System.out.println("Up to " + ((n / 10 + 1) * 10));
			} else {
				System.out.println("Down to " + (n / 10) * 10);
			}
		}
		System.out.println("==============");
	}

	public static void task9_23() {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int x = scanner.nextInt();

			int mul = 1, sum = 0;
			while (x != 0) {
				sum += x % 10;
				mul *= x % 10;

				x /= 10;
			}
			if (mul % 2 == 0 && sum % 2 == 0) {
				System.out.println("Число дважды четное");
			} else System.out.println("Число не дважды четное");
		}
	}

	public static void task9_25() {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int n = scanner.nextInt();

			int a1 = n / 100;
			int a2 = n / 10 % 10;
			int a3 = n % 10;

			if (a2 < a1 && a2 < a3) {
				System.out.println("Число " + n + " является \"ямой\"");
			} else System.out.println("Число " + n + " не является \"ямой\"");
		}
	}

	public static void task11_13() {
		System.out.println("Task #11.13");

		System.out.println("Начало");
		for (int i = 999; i != 99; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\nЗавершено");
	}

	public static void task11_14() {
		System.out.println("Tasks #11.14");
		for (int i = 0; i <= 9; i++) {
			if (i == 9) {
				System.out.println(i);
				break;
			}
			System.out.print(i + ",");
		}
		System.out.println("==============");
	}

	public static void task11_18() {
		System.out.println("Task #11.18");
		for (int i = 9999; i != 999; i--) {
			if (i % 100 == 0) System.out.print(i + " ");
		}
		System.out.println("\n==============");
	}

	public static void task11_26() {
		System.out.println("Tasks #11.26");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			for (int i = -abs(n) + 1; i < n; i++) System.out.print(i + " ");
			System.out.println("==============");
		}
		catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void task11_41() {
		System.out.println("Task #11.41");

		Predicate<Integer> func = (n) -> {
			while (n != 0) {
				if ((n % 10) % 2 != 0) return false;
				n /= 10;
			}
			return true;
		};

		for (int i = 100; i < 1000; i++) {
			if (func.test(i)) System.out.print(i + " ");
		}
		System.out.println("==============");
	}

	public static void main(String[] args) {
//		task8_14();
//		task8_15();
//		task8_22();
//		task9_23();
//		task9_25();
//		task11_13();
//		task11_14();
//		task11_18();
//		task11_26();
//		task11_41();
	}
}