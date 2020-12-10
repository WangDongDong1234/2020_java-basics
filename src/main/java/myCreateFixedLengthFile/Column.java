package myCreateFixedLengthFile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-09 11:59
 * @description
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
	public int length();

	public int order();
}
