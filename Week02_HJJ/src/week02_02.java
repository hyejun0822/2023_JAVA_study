class Sports{
	String getName() {
		return "아직 결정되지 않음";
	}
	int getPlayers() {
		return 0;
	}
}

class Soccer extends Sports{
	 
	 @Override
	 String getName() {
		 return "축구";
	 }
	 int getPlayers() {
		 return 11;
	 }
}
public class week02_02 {

	public static void main(String[] args) {
		Soccer soccer = new Soccer();
		System.out.println("경기 이름 : " + soccer.getName());
		System.out.println("경기자 수 : " + soccer.getPlayers());

	}

}
