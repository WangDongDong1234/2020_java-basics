package myProxy.demo3;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-25 19:11
 * @description
 **/
public class TestProxyDemo3 {
	public static void main(String[] args) {
		CglibProxy cglibProxy=new CglibProxy();
		PlayGame playGame= (PlayGame) cglibProxy.newInstall(new PlayGame());
		playGame.play();
	}
}
