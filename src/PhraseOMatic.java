public class PhraseOMatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "Sheep",
				"Shark", "win-win", "front-end", "web-based", "pervasive",
				"dynamic" };
		String[] wordListTwo = { "empowered", "sticky", "value-added",
				"oriented", "centric", "Distributed", "clustered", "branded",
				"outside-the-box", "positioned" };
		String[] wordListThree = { "process", "tipping point", "solution",
				"architecture", "core competency", "stratergy", "synergy" };

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " "
				+ wordListThree[rand3];

		System.out.println("What we need is a " + phrase);
	}
}
