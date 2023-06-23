package sub9;

public class Cable implements Socket {

	//전구 선언
	private Bulb bulb;
	
	
	//전구 초기화
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	
	@Override
	public void switchOn() { //전구 불 켜짐
		bulb.lightOn();
	}

	@Override
	public void switchoff() { //전구 불 꺼짐
		bulb.loghtoff();
	}

}
