package jp.co.tafs.lesson;

public class newGame extends Game {
	//public static gameSoftarray;
	String activeGameSoft;
	String gameSoft;
	static String gameSoftarray[] = new String[5];

	public newGame() {

		this.setGamename("Newmario");
		this.setMaker("Nintendo");
		this.setPrice(99800);

		//String gameSoftarray[] = new String[5];

		for (int i = 0; i < 5; i++) {
			String abc = gameSoftarray[i];
			if (abc != null && abc.equals(gameSoft)) {
				System.out.println(gameSoft + "はすでにインストール済み。");
				activeGameSoft = gameSoft;
				return;
			}

			if (abc == null || abc.equals("")) {
				System.out.println(gameSoft + "をインストールしました。" + "(" + i + ")");
				gameSoftarray[i] = gameSoft;
				activeGameSoft = gameSoft;
				return;
			}
		}

	}

	static void setupGameSoft(String abc) {
		for (int i = 0; i < 5; i++) {
			if (gameSoftarray[i] .equals null) {
				gameSoftarray[i] = abc;
				System.out.println(gameSoftarray[i]);

			}
		}
	}
}
