package klondikeXP;

public enum Suite {
		HEARTS(Color.RED, 'h'),
		DIAMONDS(Color.RED, 'd'),
		CLOVERS(Color.BLACK, 'c'),
		PIKES(Color.BLACK, 'p');
	
		private char initial;
		private Color color;
		
		Suite(Color color, char initial)
		{
			this.color = color;
			this.initial = initial;
		}
		
		public Color getColor()
		{
			return Color.BLACK;
		}
		
		public static char[] initials() {
			
			char[] initials = new char[4];
			Suite arraySuites[] = Suite.values();
			
			for(int i = 0; i < arraySuites.length; i++)
			{
				initials[i] = arraySuites[i].initial;
			}
			
			return initials;
		}
		
		public static Suite find(char initial) 
		{
			switch(initial)
			{
			case 'h':
				return Suite.HEARTS;
			case 'd':
				return Suite.DIAMONDS;
			case 'c':
				return Suite.CLOVERS;
			case 'p':
				return Suite.PIKES;
			default:
				return null;
				
			}
		}
		
}
