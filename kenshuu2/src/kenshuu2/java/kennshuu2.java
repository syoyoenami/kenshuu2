package kenshuu2.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kennshuu2 {

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] test = new int[4];
		System.out.println(test.length + "つの値を入力します。");

		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}

		System.out.println("昇順に並べます。");

		for (int s = 0; s < test.length - 1; s++) {
			for (int t = s + 1; t < test.length; t++) {
				if (test[t] < test[s]) {
					int temp = test[t];
					test[t] = test[s];
					test[s] = temp;
				}
			}
		}

		for (int j = 0; j < test.length; j++) {
			System.out.print(test[j] + " ");
		}
	}
}
