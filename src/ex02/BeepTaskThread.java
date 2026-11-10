package ex02;

import java.awt.Toolkit;

// Runnable 인터페이스를 이용한
// 쓰레드 만들기
class BeepTask implements Runnable{
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			System.out.println("삑");
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("삑에서 오류");
				return;
			}
		}
		
	}

}
class ShowTask implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("탕");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("탕에서 오류");
				return;
			}
		}
		
	}
	
}

public class BeepTaskThread {
	
	public static void main(String[] args) {
		// Runnable 부모가 가진 형식으로 형식변환
		// 부모가 가진 능력만 쓸 수 있음
		// Runnable은 run()메소드만 가지고 있으므로
		// run()만 호출 가능
		// 1.ShowTask 객체생성하여 부모형식으로 고침
		Runnable task1 = new ShowTask();
		// 2. 관례상 run()는 직접호출 금지.
		// 따라서 start()가 필요
		// 그런데 Runnable은 start()함수가 없음.
		// 3. Thread의 start()이용
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Runnable task2 = new BeepTask();
		Thread thread2 = new Thread(task2);
		thread2.start();
		
		
		
	}

}
