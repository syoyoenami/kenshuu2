package Test;

class test
{
	private int num;
	private double gas;

	public test()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}

	public void Car(int n, double g)
	{
		this();
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}

	public void show()
	{
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}

	class abc
	{
		public void main(String[] args)
		{
			test car1 = new test();

			car1.show();

		}
	}
}