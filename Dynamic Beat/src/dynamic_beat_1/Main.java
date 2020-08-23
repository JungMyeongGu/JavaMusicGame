package dynamic_beat_1;

public class Main {
	//모든 프로젝트 내부에서 공유할 수 있는 하나의 변수라는 것을 의미 (public static)
	//한번 선언되면 절대 바뀌지 않는 숫자를 뜻함.(상수) (final)
	public static final int SCREEN_WIDTH = 1280; //상수같은 경우 모두 대문자로 만듬.
	public static final int SCREEN_HEIGHT = 720;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DynamicBeat();
	}

}
