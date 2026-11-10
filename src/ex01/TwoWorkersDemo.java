package ex01;

public class TwoWorkersDemo {

	public static void main(String[] args) {
		// 첫번째 작업 흐름 객체 생성
		NumberWorker1 numberworker = new NumberWorker1();
		// 두번째 작업 흐름 객체 생성
		TextWorker	 textworker = new TextWorker();
		// 두 작업 흐름을 실행
		// 객체가 생성될 때 자동 호출되는 생성자만 유일하게 자동실행
		// 내가 run()을 불러야 한다. 이것은 권장X
		// 위임 start();
		numberworker.start(); // start가 run을 대신 실행
		textworker.start();
		
		// 작업 흐름은 현재 3개 = 메인 + numberworker + textworker

	}

}
// 첫번째 NumberWorker1
// NumberWorker는 같은 패키지내에 존재하여 1추가
class NumberWorker1 extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
//두번째 TextWorker
class TextWorker extends Thread{
	public void run() {
		for (int j = 0; j < 5; j++) {
			System.out.println("문자 : " + j + "백");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}