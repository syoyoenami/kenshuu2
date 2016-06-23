package kenshuu3.java;

public class kennshuu3 {
	public static void main(String[] args) {
		System.out.println("１～１００までの乱数を表示します。");
		int r;
		int[] score;
		score = new int[99];
		for (int i = 0; i < 99; i++) {
			r = (int) (Math.random() * 100) + 1;
			score[i] = r;
			System.out.print(score[i] + " ");
		}
		System.out.println("");
		System.out.println("昇順に並び替えます。");
		for (int i = 0; i < 98; i++) {
			for (int j = 0; j < 98 - i; j++) {
				if (score[j] > score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < score.length; k++) {
			System.out.print(score[k] + " ");
		}
	}
}