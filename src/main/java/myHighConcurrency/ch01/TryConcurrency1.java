package myHighConcurrency.ch01;


import java.util.concurrent.TimeUnit;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-01-28 20:57
 * @description
 **/
public class TryConcurrency1 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				browseNews();
			}
		}).start();
		enjoyMusic();

	}

	private static void browseNews()  {
		System.out.println(Thread.currentThread().getName());
		for(;;){
			System.out.println("good news");
			sleep(1);
		}
	}

	private static void enjoyMusic(){
		System.out.println(Thread.currentThread().getName());
		for(;;){
			System.out.println("nice music");
			sleep(1);
		}
	}

	private static void sleep(int seconds)  {
		try{
			TimeUnit.SECONDS.sleep(seconds);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
