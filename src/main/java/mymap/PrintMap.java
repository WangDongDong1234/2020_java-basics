package mymap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-01-14 15:11
 * @description
 **/
public class PrintMap {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		map.put("11",11);
		map.put("22",22);
		System.out.println(map);
	}
}
