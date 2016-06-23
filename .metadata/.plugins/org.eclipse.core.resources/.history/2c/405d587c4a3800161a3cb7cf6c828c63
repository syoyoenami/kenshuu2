package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("受験者数を入力する。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		int[] a = new int[res];
		System.out.println("点数を入力する。");

		for (int i = 0; i < res; i++) {
			str = br.readLine();
			int num = Integer.parseInt(str);
			a[i] = num;
		}

		for (int i = 0; i < res; i++) {
			System.out.println((i + 1) + "番目の値は" + a[i] + "です。");
		}
	}

}