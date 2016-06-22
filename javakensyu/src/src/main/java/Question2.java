package src.main.java;

public class Question2 {

	/*
	 * 処理の開始
	 */
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3, 8, 7, 1, 0, 6, 9 };

		System.out.print("ソート前：");
		arrayPrintln(arr);

		quickSort(arr, 0, arr.length - 1);

		System.out.print("ソート後：");
		arrayPrintln(arr);
	}

	/*
	  * 軸要素の選択
	  * 順に見て、最初に見つかった異なる2つの要素のうち、
	  * 大きいほうの番号を返します。
	  * 全部同じ要素の場合は -1 を返します。
	  */
	static int pivot(int[] a, int i, int j) {
		int k = i + 1;
		while (k <= j && a[i] == a[k])
			k++;
		if (k > j)
			return -1;
		if (a[i] >= a[k])
			return i;
		return k;
	}

	/*
	 * パーティション分割
	 * a[i]～a[j]の間で、x を軸として分割します。
	 * x より小さい要素は前に、大きい要素はうしろに来ます。
	 * 大きい要素の開始番号を返します。
	 */
	static int partition(int[] a, int i, int j, int x) {
		int l = i, r = j;
		while (l <= r) {
			while (l <= j && a[l] < x)
				l++;
			while (r >= i && a[r] >= x)
				r--;

			if (l > r)
				break;
			int t = a[l];
			a[l] = a[r];
			a[r] = t;
			l++;
			r--;
		}

		return l;
	}

	/*
	 * クイックソート（再帰用）
	 * 配列aの、a[i]からa[j]を並べ替えます。
	 */
	public static void quickSort(int[] a, int i, int j) {
		if (i == j)
			return;
		int p = pivot(a, i, j);
		if (p != -1) {
			int k = partition(a, i, j, a[p]);
			quickSort(a, i, k - 1);
			quickSort(a, k, j);
		}
	}

	//配列の値を出力するメソッド
	public static void arrayPrintln(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}