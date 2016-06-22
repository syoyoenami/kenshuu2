package jp.co.tafs.lesson;

public class Game {
	private String gamename = "NINTENDO64";
	private String maker = "任天堂";
	private int release_date = 20000417;
	private int price = 25000;
	private boolean gamepower = false;
	private String softname;
	private boolean check;

	void gamePlay() {
		System.out.println("ゲームをしています。");
		softIn("NEWMARIO");
		softOut();
	}

	boolean checkPower() {
		if (gamepower == true) {
			check = true;
		} else {
			check = false;
		}
		return check;

	}

	void powerOn() {
		if (gamepower == false) {
			gamepower = true;
			System.out.println("電源ONになります。");
		}
		else {
			System.out.println("電源ON状態です。");
		}
	}

	void powerOff() {
		if (gamepower == true) {
			gamepower = false;
			System.out.println("電源がOFFになります。");
		}
	}

	/**
	 * @return gamename
	 */
	public String getGamename() {
		return gamename;
	}

	/**
	 * @param gamename セットする gamename
	 */
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	/**
	 * @return maker
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * @param maker セットする maker
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

	/**
	 * @return release_date
	 */
	public int getRelease_date() {
		return release_date;
	}

	/**
	 * @param release_date セットする release_date
	 */
	public void setRelease_date(int release_date) {
		this.release_date = release_date;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return gamepower
	 */
	public boolean isGamepower() {
		return gamepower;
	}

	/**
	 * @param gamepower セットする gamepower
	 */
	public void setGamepower(boolean gamepower) {
		this.gamepower = gamepower;
	}

	/**
	 * @return softname
	 */
	public String getSoftname() {
		return softname;
	}

	/**
	 * @param softname セットする softname
	 */
	public void setSoftname(String softname) {
		this.softname = softname;
	}

	/**
	 * @return check
	 */
	public boolean isCheck() {
		return check;
	}

	/**
	 * @param check セットする check
	 */
	public void setCheck(boolean check) {
		this.check = check;
	}

	void softIn(String i) {
		softname = i;
		System.out.println(i);
	}

	void softOut() {
		softname = null;
		System.out.println("アクティブなゲームソフトがなります。");
	}
}
