
class DVDPlayerTest {

	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer();
		Players b = new DVDPlayer();
		ExPlayers c = new DVDPlayer();
		
	System.out.println("DVDPlayer형 변수 a");
	a.play();
	a.stop();
	a.slow();
	
	System.out.println("Players형 변수 b");
	b.play();
	b.stop();
	
	System.out.println("ExPlayers형 변수 c");
	c.play();
	c.stop();
	c.slow();
	}

}
