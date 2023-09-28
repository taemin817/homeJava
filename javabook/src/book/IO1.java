package book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO1 {

	public static void main(String[] args) {
	 
			FileInputStream fis;
			try {									// test파일에 0 하나 들어있다면
				fis = new FileInputStream("res/test.txt");
									//1바이트씩 읽어온다
				int data1 = fis.read(); // 0 -> 48
				System.out.println(data1);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}