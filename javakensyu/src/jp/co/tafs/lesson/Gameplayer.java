package jp.co.tafs.lesson;

public class Gameplayer {
	public static void main(String[] args) {
		Game game = new Game();
		System.out.println("さあ！最新型のゲームを始めましょう！");
		System.out.println(game.getGamename());
		System.out.println(game.checkPower());
		game.getMaker();
		game.getRelease_date();
		game.getPrice();
		game.getSoftname();
		game.gamePlay();
		game.checkPower();
		game.powerOn();

		System.out.println("感想 : 楽しかったです。");

		newGame.setupGameSoft("ドンキーコング");
		newGame.setupGameSoft("マリオカート");
		newGame.setupGameSoft("ゼルダ");
		newGame.setupGameSoft("パワプロ");
		newGame.setupGameSoft("プロスピ");

		System.out.println("感想 : 楽しかったです。");

	}
}
