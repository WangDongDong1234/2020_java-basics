package myexcle;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-23 15:40
 * @description
 **/
public class TestMyExlce {
	public static void main(String[] args) throws Exception {
		ResolveExcle resolveExcle = new ResolveExcle();
		resolveExcle.resolve(1L,1L,TestMyExlce.class.getClassLoader().getResource("CommandModule_biaozhun.xlsx").getPath());
	}
}
