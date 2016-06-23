package kenshuu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kennshuu5 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("商品をいくつ格納しますか。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		System.out.println("商品をカートに格納します。");

		int[][] cart = new int[num][3];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 3; j++) {
				str = br.readLine();
				int tmp = Integer.parseInt(str);
				cart[i][j] = tmp;
			}

		}

		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			sum += cart[i][1] * cart[i][2];
		}
		if (sum < 2000) {
			System.out.println("送料180円を足して" + (sum += 180) + "です。");

		}
		else {
			System.out.println("送料はカウントされません。金額" + sum);

		}

		System.out.println("合計金額は" + sum + "です。");
	}
}
