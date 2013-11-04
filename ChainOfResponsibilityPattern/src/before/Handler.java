package before;

import java.util.Random;

public class Handler {
	private static Random ran = new Random();
	private static int next = 1;
	private int id = next++;

	public boolean handle(int num) {
		if (ran.nextInt(4) != 0) {
			System.out.print(id + "-busy -> ");
			return false;
		}
		System.out.println(id + "-handled-" + num);
		return true;
	}

}
