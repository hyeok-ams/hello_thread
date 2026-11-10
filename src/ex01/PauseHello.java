package ex01;

public class PauseHello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str ;
		for (int i = 1; i < 6; i++) {
			System.out.println("안녕하세요!");
			//잠시 동안(500ms) 쉬기(sleep)
			Thread.sleep(1000);
			//다시 시작
			str = "다시 시작";
			if (i < 5) {
				System.out.println(str+ " " + i);
			}
		}
		System.out.println("종료");
	}

}
