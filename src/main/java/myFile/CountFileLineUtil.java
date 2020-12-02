package myFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-27 17:57
 * @description   计算文件的行数
 **/
public class CountFileLineUtil {
	public static long getLineNumber(File file){
		if (file.exists()) {
			try {
				FileReader fileReader = new FileReader(file);
				LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
				lineNumberReader.skip(Long.MAX_VALUE);
				long lines = lineNumberReader.getLineNumber() + 1;
				fileReader.close();
				lineNumberReader.close();
				return lines;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(CountFileLineUtil.getLineNumber(new File("./card")));
	}
}

