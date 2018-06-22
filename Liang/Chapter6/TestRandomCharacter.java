public class TestRandomCharacter {
	public static void main(String[] args)
	{
		final int NUMBER_OF_CHARACTERS = 175;
		final int CHARACTERS_PER_LINE = 25;
		for (int i = 0; i < NUMBER_OF_CHARACTERS; i++)
		{
			char ch = RandomCharacter.getRandomLowerCaseLetter();
			if ((i + 1) % CHARACTERS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}
}