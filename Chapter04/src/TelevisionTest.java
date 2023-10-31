class TV {
	private int channel;
	private int volume;
	private boolean onOff;
	
	TV(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
}
public class TelevisionTest {

	public static void main(String[] args) {
		TV myTv = new TV(7, 10, true);
		myTv.print();
		
		TV yourTv = new TV(11, 20, true);
		yourTv.print();
	}

}
